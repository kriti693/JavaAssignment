import React,{Component} from "react";
import ProductServics from "../Services/ProductServics";

class AddProductComponents extends Component{
    constructor(props){
        super(props)
        this.state={
            name:'',
            price:'',
            description:''

        }
        this.changeProductNameHandler=this.changeProductNameHandler.bind(this);
        this.changeProductPriceHandler=this.changeProductPriceHandler.bind(this);
        this.saveProduct=this.saveProduct.bind(this);
    }
    saveProduct=(e)=>{
        e.preventDefault();
        let product ={name:this.state.name,price:this.state.price,description:this.state.description};
        console.log('product=>'+JSON.stringify(product));
        ProductServics.createProduct(product).then(res =>{
            window.location.href="/product";
           // this.props.history.push('/product');
        });
    }
    changeProductNameHandler=(Event)=>{
        this.setState({name:Event.target.value});
    }
    changeProductPriceHandler=(Event)=>{
        this.setState({price:Event.target.value});
    }
    changeProductDescriptionHandler=(Event)=>{
        this.setState({description:Event.target.value});
    }
    cancel(){
        window.location.href="/product";
        //this.context.history.push("/");
        //this.props.history.push('/product');
    }
    render(){
        return(
            <div>
              <div className="productcontainer">
                  <div className="row">
                      <div className="card p-2">
                          <h3 className="text-center">Add Product</h3>
                          <div className="card-body">
                              <form>
                                  <div className="form-group">
                                      <label>Product Name:</label>
                                      <input placeholder="Product Name" name="name" className="form-control" value={this.state.name} onChange={this.changeProductNameHandler}/>
                                       </div>
                                  <div className="form-group">
                                      <label>Product Price:</label>
                                      <input placeholder="Product Price" name="price" className="form-control" value={this.state.price} onChange={this.changeProductPriceHandler}/>

                                  </div>
                                  <div className="form-group">
                                      <label>Description:</label>
                                      <input type="textarea" placeholder="description" name="productDescription" className="form-control" value={this.state.description} onChange={this.changeProductDescriptionHandler}/>

                                  </div>
                                  <button className="btn btn-success" onClick={this.saveProduct}>Save</button>
                                  <button className="btn btn-danger" onClick={this.cancel} style={{marginLeft:"15px"}}>Cancel</button>
                              </form>
                         </div>
                      </div>
                  </div>
              </div>
            </div>
        )
    }
}
export default AddProductComponents;