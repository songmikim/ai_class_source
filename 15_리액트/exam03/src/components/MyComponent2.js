import { Component } from 'react';

class MyComponent2 extends Component {
  render(favoriteNumber) {
    const style = {
      backgroundColor: this.props.color,
    };

    return (
      <>
        <h1 style={style}>나의 멋진 컴포넌트(클래스형)</h1>
        <h2> 좋아하는 숫자는 {favoriteNumber} 입니다.</h2>
      </>
    );
  }
}

export default MyComponent2;