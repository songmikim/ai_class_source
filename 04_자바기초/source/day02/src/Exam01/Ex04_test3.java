package Exam01;

public class Ex04_test3 {
    public static void main(String[] args) {
        //3. 5층 건물이 있습니다. 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스클럽입니다. 건물의 층을 누르면 그 층이 어떤 곳인지
        // 알려주는 엘리베이터가 있을 때 이를 swich ~ case문으로 구현하시오(5층인 경우 ‘5층 헬스클럽입니다.’)
        int num= 1;
        switch (num){
            case 1: System.out.printf("%d층 약국입니다.", num);  break;
            case 2: System.out.printf("%d층 정형외과입니다.", num); break;
            case 3: System.out.printf("%d층 피부과입니다.", num); break;
            case 4: System.out.printf("%d층 치과입니다.", num); break;
            case 5: System.out.printf("%d층 헬스클럽입니다.", num); break;
            default: System.out.printf("%d층 없는 층입니다.", num);
        }
    }
}
