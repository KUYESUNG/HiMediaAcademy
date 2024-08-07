import {BrowserRouter, Routes, Route} from 'react-router-dom';
import About from './pages/About';
import Menu from './pages/Menu';
import Main from './pages/Main';

function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route index element={<Main/>}/>
          <Route path="/about" element={<About/>}/>
          <Route path="/menu" element={<Menu/>}/>
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
