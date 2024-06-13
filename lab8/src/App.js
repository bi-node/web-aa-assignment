import React from 'react';
import Dashboard from '../src/components/Dashboard';
import { PostProvider } from '../src/context/PostContext';



function App() {
    return (
        <PostProvider>
            <Dashboard />
        </PostProvider>
    );
}

export default App;
