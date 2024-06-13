import React from 'react';
import { PostProvider } from '../src/components/PostContext';
import Posts from '../src/components/Posts';
import AddPost from '../src/components/AddPost';


const App = () => {
    return (
        <PostProvider>
            <div className="container">
                <h1 className="header">My Facebook-like App</h1>
                <div className="content">
                    <AddPost />
                    <Posts />
                </div>
            </div>
        </PostProvider>
    );
};

export default App;
