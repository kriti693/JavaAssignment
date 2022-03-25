import axios from "axios"; 

const PRODUCT_API_BASE_URL="http://localhost:8081/product";
 class ProductService{
        getAllProduct(){
            return axios.get(PRODUCT_API_BASE_URL +"/getAllProduct");
        }
        createProduct(product){
            return axios.post(PRODUCT_API_BASE_URL+"/addNewproduct",product);
        }
        updateProduct(product){
            return axios.post(PRODUCT_API_BASE_URL+"/updateProduct",product);
        }
        deleteProductById(id){
            return axios.delete(PRODUCT_API_BASE_URL+`/deleteProduct/${id}`);
        }
 }

 export default new ProductService()