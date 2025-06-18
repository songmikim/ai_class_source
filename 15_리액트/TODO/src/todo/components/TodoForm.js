import { FaPlusSquare } from 'react-icons/fa'; // 추가 버튼 아이콘

// 할 일 추가 입력 폼 컴포넌트
const TodoForm = ({ onSubmit, onChange, form , errors}) => {
  return (
    <form onSubmit={onSubmit}> {/* 폼 제출 이벤트 핸들러 등록 */}
      <div>
        <input
          type="text" // 텍스트 입력 필드
          onChange={onChange}  // 입력 변경 핸들러
          name="title" // 필드 이름
          placeholder="할일 제목" // 안내 문구
          value={form?.title ?? ''}  // 상태에 따라 값 설정
        />
        {errors?.title && <div>{errors.title}</div>}  {/* 제목 유효성 에러 표시 */}
      </div>
      <div>
        <textarea
          onChange={onChange} // 입력 변경 핸들러
          name="content"
          placeholder="할일 내용"
          value={form?.content ?? ''}  // 상태에 따라 값 설정
        />
        {errors?.content && <div>{errors.content}</div>}  {/* 내용 유효성 에러 표시 */}
      </div>
      <button type="submit">
        <FaPlusSquare />
      </button>
    </form>
  );
};

export default TodoForm;  // 컴포넌트 내보내기
