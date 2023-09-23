import { useState } from "react"
import "./styles.css"

export default function App() {
  const [newItem, setNewItem] = useState("")

  return (
  <>
  <form className="new-item-form">
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