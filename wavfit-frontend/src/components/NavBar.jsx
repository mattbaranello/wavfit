import React from "react"
import "../styles.css"

export default function Navbar() {
    return (
        <nav>
            <img src="../images/WavFit.png" className="nav--icon" />
            <h3 className="nav--logo_text">WavFit Tracker</h3>
            <h4 className="nav--title">Saved Workouts</h4>
        </nav>
    )
}