자바 IO (입출력) 
I - Input(입력)
O - Ouput(출력)
- 데이터의 입출력 
- java.io 패키지 

입력 스트림 
1. 바이트 기반 입력 스트림
	- 데이터의 전송 단위 바이트
InputStream 	
	- abstract int read() 
	
	- 기반 스트림 : 직접 데이터를 읽어 올 수 있는 스트림
		ByteArrayInputStream : 메모리에서 직접 읽어올수 있는 스트림
		FileInputStream : 파일에서 직접 읽어 올수 있는 스트림
				int read() : 1 바이트를 읽어 오는 것이라서 자료형을 byte로 쓸것을 생각하지만... 안된다!
							  - unsigned byte : 0~255
							  - -1 : 다 읽은 상태
							  - -1이라는 숫자가 더 필요하므로 더 큰 자료형이 필요하지만 가장 효율적인게 int이므로 반환값 타입이 int 
				
	- 보조 스트림 : 다른 스트림(기반 스트림 또는 보조 스트림)에 추가적인 기능을 더 덧붙여 주는 스트림 
		FilterInputStream : 보조 스트림의 상위 클래스
						FilterInputStream(InputStream in) : 
					- 생성자의 매개변수가 다른 스트림, 직접 데이터를 읽어오지는 않으므로
			- BufferedInputStream : 다른 입력 스트림에 버퍼라는 추가 기능을 부여하는 스트림 
			- DataInputStream : 다른 입력스트림에 기본 자료형 또는 많이 쓰는 자료형 형태(String)으로 입력을 받을 수 있는 추기 기능을 부여한 스트림
		
		ObjectInputStream : 다른 입력 스트림의 데이터를 -> 객체 형태로 복구해 주는 기능이 추가된 스트림 
			
	참고)
		버퍼 : 임시메모리
		
2. 문자 기반 입력 스트림 
	- 데이터 전송 단위가 문자!
Reader 
	- abstract int read(char[] cbuf, int off, int len)
	
	- 기반 스트림 : 직접 데이터를 읽어 올 수 있는 스트림
	
	- 보조 스트림 : 다른 스트림(기반 스트림 또는 보조 스트림)에 추가적인 기능을 더 덧붙여 주는 스트림 

출력 스트림 
1. 바이트 기반 출력 스트림 
OutputStream 
	abstract void write(int b)
	
	- 기반 스트림 : 직접 데이터를 쓸수  스트림
	
	- 보조 스트림 : 다른 스트림(기반 스트림 또는 보조 스트림)에 추가적인 기능을 더 덧붙여 주는 스트림 

2. 문자 기반의 출력 스트림 
Writer
	abstract void write(char[] cbuf, int off, int len)
	
	- 기반 스트림 : 직접 데이터를 쓸수  스트림
	
	- 보조 스트림 : 다른 스트림(기반 스트림 또는 보조 스트림)에 추가적인 기능을 더 덧붙여 주는 스트림 