import React, { Component} from 'react'
import ProductServics from '../Services/ProductServics'
import {useNavigate} from "react-router-dom";
 

class ListProduct extends Component{
    
    constructor(props){
        super(props)
        this.state={
            product:[]
        }
         
        this.addProduct=this.addProduct.bind(this);
        this.editProduct=this.editProduct.bind(this);
        this.deleteProduct=this.deleteProduct.bind(this);
    }
    deleteProduct(id){
        ProductServics.deleteProductById(id);
        window.location.href="/product";

    }
    editProduct(id){
        window.location.href=`/updateProduct/${id}`;

    }
    componentDidMount(){
        ProductServics.getAllProduct().then((res)=>{
            this.setState({product:res.data}); 
        });
    }
    addProduct(){

        window.location.href="/addProduct";
      // this.props..push("/addProduct");
     //  this.props.navigation.goBack("/addProduct");
    }

       render(){
       
        return(
            <div>
                <h2 className="text-center">Product-List</h2>
                {/* <div className="row"> */}
                     <button className="btn btn-primary btn-md" onClick={this.addProduct}>Add Product</button> 
                {/* </div> */}
                <div className="row">
                    <table className="table table-striped table-bordered"> 
                    <thead>
                        <tr>
                            <th>Product Name</th>
                            <th>Product Price</th>
                            <th>Description</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.product.map(
                                product =>
                                <tr key={product.id}>
                                    <td>{product.name}</td>
                                    <td>{product.price}</td>
                                    <td>{product.description}</td>
                                    <td>
                                        <button onClick={()=> this.editProduct(product.id)} className="btn btn-info">Update</button>
                                    <button style={{marginLeft:"10px"}} onClick={()=> this.deleteProduct(product.id)} className="btn btn-danger">Delete</button>
                                    </td>
                                    </tr>
                            )
                        }
                    </tbody>
                    
                    </table>

                </div>
            </div>
        )
    }
}

export default ListProduct
