import {BrowserRouter, Routes, Route} from 'react-router-dom';
import GlobalStyle from './styles/GlobalStyles';
import Layout from './layouts/Layouts';
import Company from './pages/Company';

function App() {
  return (
    <>
    <GlobalStyle/>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout/>}>
          <Route index element={<Company/>}/>

        </Route>
      </Routes>
    </BrowserRouter>
    </>
  );
}

export default App;
