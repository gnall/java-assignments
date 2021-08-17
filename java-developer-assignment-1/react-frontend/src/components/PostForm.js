import React, { Component } from 'react'
import axios from 'axios'

class PostForm extends Component {

    constructor(props){
        super(props)

        this.state = {
            userInput: ''
        }
    }

    changeHandler=(e)  =>{
        this.setState({
            [e.target.name]: e.target.value
        })
    }

    submitHandler = (e) => {
        e.preventDefault()
        axios.post('http://localhost:8080/primeSolver/', this.state)
        .then(response => {
            console.log(response)
        })
    }

    handleChange = (e) => {
        this.setState({
            [e.target.userInput]: e.target.value
        })
    }

    handleSubmit = (e) => {
        console(e.target)
    }


    render() {
        const { userInput } = this.state
        return (
            <div>
                <form onSubmit={this.submitHandler}>
                    <div>
                        <input
                            type='text'
                            name='userInput'
                            onChange={this.changeHandler}
                            value={userInput}></input>
                    </div>
                    <button type='submit'>Submit Now</button>
                </form>
            </div>
        )
    }
}

export default PostForm
