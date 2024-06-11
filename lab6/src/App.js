import React from 'react';
import './App.css';
import Posts from "./components/Posts";
import Dashboard from "./components/Dashboard";

const App = () => {
    return (
        <div className="App">
            <header className="App-header">
                <h1>Product List</h1>
            </header>
            <main>
                <Dashboard />
            </main>
        </div>
    );
};

export default App;
