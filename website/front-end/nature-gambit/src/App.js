import { BrowserRouter, Routes, Route } from 'react-router-dom'
import './styles/App.css'
import Home from './pages/Home'
import Rules from './pages/Rules'
import AboutUs from './pages/AboutUs'


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />}/>
        <Route path="/rules" element={<Rules />} />
        <Route path="/about-us" element={<AboutUs />}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
