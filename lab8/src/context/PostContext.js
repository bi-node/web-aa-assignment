import React, { createContext, useState } from 'react';

export const PostContext = createContext();

export const PostProvider = ({ children }) => {
    const [posts, setPosts] = useState([]);
    const [selectedPostId, setSelectedPostId] = useState(null);

    return (
        <PostContext.Provider value={{ posts, setPosts, selectedPostId, setSelectedPostId }}>
            {children}
        </PostContext.Provider>
    );
};
