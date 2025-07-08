import ColorBox from './components/ColorBox2';
import SelectColors from './components/SelectColors';
import ColorContext, { ColorProvider } from './contexts/color';

const App = () => {
  return (
    <ColorProvider>
      <ColorBox />
      <SelectColors />
    </ColorProvider>
  );
};
export default App;

// const App = () => {
//   return (
//   <ColorContext.Provider value={{color: 'red'}}>
//     <ColorBox />
//   </ColorContext.Provider>
//   )

// };
// export default App;

// import RenderPropsEx from './components/RenderPropsEx';
// const App = () => {
//   // return <ColorBox />;
//   return (
//     <RenderPropsEx>
//       {({color, ea}) => (
//         <h1>
//           color: {color}, ea:{ea}
//         </h1>
//       )}
//     </RenderPropsEx>
//   );
// };

// export default App;
