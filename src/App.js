import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom'; 
import  ListProduct from './components/ListProduct';
import HeaderComponents from './components/HeaderComponents';
import FooterComponents from './components/FooterComponents';
import AddProductComponents from './components/AddProductComponents';
import UpdateProductComponents from './components/UpdateProductComponents';
function App() {
  return (
    <div>
      <Router>
        <div className="container">
          <HeaderComponents />
           <div className="container">
             <Routes>
             <Route path='/' element={<ListProduct/>} />
             <Route path='/product' element={<ListProduct/>} />
             <Route path="/addProduct" element={<AddProductComponents/>} />
             <Route path="/updateProduct/:id" element={<UpdateProductComponents/>} />
               {/* <Route path="/" element={ListProduct}></Route> */}
                {/* <Route path="/product" component={ListProduct}></Route> */}
                {/* <Route path="/addProduct" component={AddProductComponents}></Route> */}
              </Routes>
          </div>
        <FooterComponents />
      </div>
    </Router>
  </div>
    
  
  );
}

export default App;
