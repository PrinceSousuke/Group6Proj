import React from 'react'
import { Link } from 'react-router-dom'

function Nav(){
    return (
        <nav className="App-navBar">
            <Link className="App-navLink" to="/">Home</Link>
            <Link className="App-navLink" to="/rules">Rules</Link>
            <Link className="App-navLink" to="/about-us">About Us</Link>
        </nav>
    )
}

export default Nav;