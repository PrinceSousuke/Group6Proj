import React from 'react'
import Header from '../components/Header'
import Nav from '../components/Nav'

function GamePlay(){
    return (
        <div className="Rules-container">
            <p className="App-rulesHeaders">Feyre</p>
            <p>
                You begin the game with one Feyre and after each turn your Feyre is replenished.
Every three turns you get +1 of your max Feyre. You must play a card that does not exceed your max Feyre, otherwise
there are consequences to pay! Your max health will decrease by the amount of Feyre you went over. However, you cannot die from this occurence.
            </p>
            <p className="App-rulesHeaders">Health</p>
            <p>
                At the beginning of each game you will start with 25 HP (Health Points). As in the real world, if you
                reach zero, you die and lose the game. You will never exceed your max health of 25, even if you are some magical creature.
            </p>
            <p className="App-rulesHeaders">Turns</p>
            <p>
                Placeholder!
            </p>
            <p className="App-rulesHeaders">Decks</p>
            <p>
                Player decks must have 20 cards out of 88 cards to choose from.
                Placeholder!
            </p>
            <p className="App-rulesHeaders">Gameplay</p>
            <p>
                There are a total of 8 placeholders on the board that you can place your creatures, traps, and/or spells on!
                Creatures are placed face up and attack on the respective player's turn. Traps are place face down and can incapacitate 
                enemy creatures for one or more turns. However, there can only be a max of 4 traps active at any given moment, so be precise with your actions!
                Spells are placed on top of any creature or trap card in play. Attack, healing, and silly spells
                are to be discarded after the player's turn. Illusion and defense spells stick around for an extra turn, nice!
                Item/Utility cards are able to be used once per turn and must be discarded immediately.
            </p>
        </div>
    )
}

function Rules(){
    return (
        <div className="App">
            <Header />
            <Nav />
            <GamePlay />
        </div>
    )
}

export default Rules;