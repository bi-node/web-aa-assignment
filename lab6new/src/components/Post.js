import React from "react";

const Post=({title, author})=>{
   return ( <div className="post-c">
        <h4>Title: {title}</h4>
        <h5>Author: {author}</h5>
    </div>);
};


export default Post;