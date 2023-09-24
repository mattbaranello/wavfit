import { useState } from "react"
import AppBar from "./components/AppBar"
import "./styles.css"
import "../node_modules/bootstrap/dist/css/bootstrap.min.css"

export default function App() {
  const [newItem, setNewItem] = useState("")
  const [workout, setWorkout] = useState([])

  function handleSubmit(e) {
    e.preventDefault()

    setWorkout([
      ...workout, 
      { id: crypto.randomUUID(), title: newItem, complete:
      false },
    ])
  }

  console.log

  return (
  <>
  <div className="Nav">
    <AppBar/>
  </div>
  <form onSubmit={handleSubmit} className="new-item-form">
    <div className="form-row">
      <label htmlFor="item">New Item</label>
      <input 
      value={newItem} 
      onChange={e => setNewItem(e.target.value)} 
      type="text" 
      id="item"/>
    </div>
    <button className="btn">Add</button>
  </form>
  <h1 className="header">Workout Tracker</h1>
  <ul className="tracker">
    <li>
      <label>
        <input type="text"/>
      </label>
      <button className="btn btn-danger">Delete</button>
    </li>
  </ul>
  </>
  )
}