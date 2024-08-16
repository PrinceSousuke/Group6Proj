import React from 'react'
import Header from '../components/Header'
import Nav from '../components/Nav'
import Window from '../components/Window'

function Home(){
    return (
        <div className="App">
            <Header title={"Nature's Gambit"} />
            <Nav />
            <Window />
        </div>
    )
}

export default Home;