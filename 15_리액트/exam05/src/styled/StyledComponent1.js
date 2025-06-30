import { SmallButton, MediumButton } from '../global/components/Buttons';
const StyledComponent1 = () => {
  return (
    <div>
      <SmallButton color="green" bg="orange" border={true}>
        클릭1
      </SmallButton>
      <MediumButton color="white" bg="blue" border={false}>
        클릭2
      </MediumButton>
    </div>
  );
};

export default StyledComponent1;
