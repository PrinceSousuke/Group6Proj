import React from 'react'
import Header from '../components/Header'
import Nav from '../components/Nav'

function AboutUs(){
    return (
        <div className="App">
            <Header title="About the Developers!"/>
            <Nav />
            <p>Ryan Meeks (Game Developer)</p>
            <p>I enjoy studying computer science related things, primarily game development and ethical hacking. If I feel good about what I have learned to do so far, I look for something more difficult to learn. When developing an application, I often try to make it work as fluid as I can, sometimes spending too much time.</p>
            <p>Ben Ludolf (Game Developer)</p>
            <p>I'm Ben Ludolf, a current student at Neumont College of Computer Science. My life goal is to work remotely and travel. I have many passions including weightlifting, music, and overall just learning new things. A fun fact about me is I can bench two plates or 225 which only 0.075% of humans can do.</p>
            <p>Amber Oliver (Graphic Designer)</p>
            <p>
                Hi my name is Amber Oliver and here's a little  about me, I grew up in a small town in Alabama and went to the local high school. I was in marching band for 7 years and played the flute and piccolo. I now go to the same college as my older brother and live in Utah, which is pretty far from home. 
                Here's a little fun fact about me as well, many people think I'm from England because of how I say certain words, but it's actually because of a speech impediment.
            </p>
            <p>Damia Sargent (Website Developer)</p>
            <p>
                I have a deep and growing passion to learn new things and how to adapt to the changing world. I have been programming since the age of 8 (12 years!), which is why I chose Neumont.
                I have grown a liking to programming websites as well as dealing with data. My life goal is to eventually be good enough at what I do to land a very successful job and grow my knowledge!
            </p>
        </div>
    )
}

export default AboutUs;