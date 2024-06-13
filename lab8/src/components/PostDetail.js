import React, { useContext, useEffect, useMemo } from 'react';
import { PostContext } from '../context/PostContext';

const PostDetails = () => {
    const { posts, selectedPostId } = useContext(PostContext);

    const selectedPost = useMemo(() => {
        return posts.find(post => post.id === selectedPostId);
    }, [posts, selectedPostId]);

    if (!selectedPost) return <div>Select a post to see details</div>;

    return (
        <div>
            <h3>{selectedPost.title}</h3>
            <div>{selectedPost.author}</div>
            <div>{selectedPost.content}</div>
            {selectedPost.comment && selectedPost.comment.map((c, index) => (
                <div key={index} className="comment">
                    {c.name}
                </div>
            ))}
        </div>
    );
};

export default PostDetails;
