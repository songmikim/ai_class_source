import logo from './logo.svg';
import './App.css';

function App() {
  let name;
  name = name ?? '기본 이름';
  //return name? <h1>{name}님, 반갑습니다.</h1> :'';
  return name && <h1 className='greet'>{name}님, 반갑습니다.</h1>;
}

export default App;
