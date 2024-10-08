import React from 'react'
import Header from '../components/Header'
import Nav from '../components/Nav'

function GamePlay(){
    return (
        <div className="Rules-container">
            <p className="App-headers">Feyre</p>
            <p>
                You begin the game with one Feyre and after each turn your Feyre is replenished.
Every three turns you get +1 of your max Feyre. You must play a card that does not exceed your max Feyre, otherwise
there are consequences to pay! Your max health will decrease by the amount of Feyre you went over. However, you cannot die from this occurence.
            </p>
            <p className="App-headers">Health</p>
            <p>
                At the beginning of each game you will start with 25 HP (Health Points). As in the real world, if you
                reach zero, you die and lose the game. You will never exceed your max health of 25, even if you are some magical creature.
            </p>
            <p className="App-headers">Turns</p>
            <p>
                Player one will go first and upon each turn they draw 3 cards from their deck. A player can play all the cards in their hand or, if they're wise, they can pick and choose what to play. Once a player has no cards in their deck
                they will take damage upon every turn starting at -1HP and doubling after their turn has ended. This will be the downfall of using cards to swiftly
                and making unwise decisions.
            </p>
            <p className="App-headers">Decks</p>
            <p>
                Player decks must have 20 cards out of 88 cards to choose from. Each deck can only consist of one type (Earth, Water, Fire, and Air) and can have up to 9
                neutral cards. Make sure to choose your cards wisely as they will determine your fate of the game.
            </p>
            <p className="App-headers">Gameplay</p>
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
            <Header title="Rules"/>
            <Nav />
            <GamePlay />
        </div>
    )
}

export default Rules;