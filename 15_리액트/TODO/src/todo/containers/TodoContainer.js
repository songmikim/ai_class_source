import { useState } from 'react'; // React의 useState 훅을 불러옴
import TodoForm from '../components/TodoForm'; // 할 일 입력 폼 컴포넌트
import TodoItems from '../components/TodoItems'; // 할 일 목록 컴포넌트

const TodoContainer = () => {
  const [form, setForm] = useState({}); // 입력 폼 상태
  const [items, setItems] = useState([
    // 초기 할 일 목록 상태
    { id: 1, title: '할일1', content: '할일1 내용', checked: false },
    { id: 2, title: '할일2', content: '할일2 내용', checked: true },
    { id: 3, title: '할일3', content: '할일3 내용', checked: false },
  ]);
  const [errors, setErrors] = useState({}); // 입력 유효성 검사 에러 상태

  const onSubmit = (e) => {
    e.preventDefault(); // 폼 제출 기본 동작 방지

    // 유효성 검사: 필수 항목 확인
    let hasErrors = false;
    const requiredFields = {
      title: '제목을 입력하세요',
      content: '내용을 입력하세요',
    };

    const errors = {};
    for (const [field, message] of Object.entries(requiredFields)) {
      if (!form[field] || !form[field]?.trim()) {
        errors[field] = message; // 오류 메시지 설정
        hasErrors = true;
      }
    }

    // 유효성 검사 실패시 다음 로직 실행x
    setErrors(errors); // 에러 상태 업데이트

    if (hasErrors) return; // 에러가 있으면 함수 종료

    setItems(items.concat({ ...form, id: Date.now() }));

    // 입력 폼 초기화
    setForm({});
  };

  const onChange = (e) => {
    // 입력 필드의 상태 업데이트
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  // 체크박스 토글 처리
  const onToggle = (id) => {
    // 체크박스 클릭 시 checked 상태 반전
    setItems((prevItems) =>
      prevItems.map((item) =>
        item.id === id ? { ...item, checked: !item.checked } : item,
      ),
    );
  };

  // 항목 개별 삭제
  const onRemove = (id) => {
    setItems((prevItems) => prevItems.filter((item) => item.id !== id));
  };

  // 체크된 항목들 일괄 삭제
  const onRemoveAll = () => {
    setItems(items.filter(({ checked }) => !checked));
  };

  return (
    <>
      {/* 할 일 입력 폼 렌더링 */}
      <TodoForm
        onSubmit={onSubmit}
        onChange={onChange}
        form={form}
        errors={errors}
      />
      {/* 할 일 목록 렌더링 */}
      <TodoItems
        items={items}
        onToggle={onToggle}
        onRemove={onRemove}
        onRemoveAll={onRemoveAll}
      />
    </>
  );
};

export default TodoContainer;  // 컴포넌트 내보내기
