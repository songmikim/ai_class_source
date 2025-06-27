import styles from './MyComponent1.module.scss';
import { useState } from 'react';
import classNames from 'classnames/bind';

const cx = classNames.bind(styles);

const MyComponent1 = () => {
  const [visible, setVisible] = useState(false);

  const onToggle = () => setVisible(!visible);

  return (
    <>
      <button type="button" onClick={onToggle}>
        토글
      </button>
      {/* <h1 className={classNames('one','two', { [styles.hidden]: !visible })}> 보일까 말까?</h1> */}

      <h1 className={classNames('one', 'two', { hidden: !visible })}>
        {' '}
        보일까 말까?
      </h1>
    </>
  );
};

export default MyComponent1;
