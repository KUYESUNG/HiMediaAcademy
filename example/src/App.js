import {BrowserRouter, Routes, Route} from 'react-router-dom';
import GlobalStyle from './styles/GlobalStyles';
import Layout from './layouts/Layouts';
import Company from './pages/Company';
import ErrorPage from './pages/ErrorPage';
import Main from './pages/Main';

function App() {
  return (
    <>
    <GlobalStyle/>
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout/>}>
          <Route index element={<Main/>}/>
          <Route path="main" element={<Main/>}/>
          <Route path="company" element={<Company/>}/>

        </Route>
        <Route path="*" element={<ErrorPage/>}/>

      </Routes>
    </BrowserRouter>
    </>
  );
}

export default App;
