import React from 'react'
import {useState} from 'react'
import FetchRequests from "../JS_fetch_calls/FetchForSpring";


    function ListOfBlogPostComponent() {

        const [blogPost, setBlogPost ] = useState(null)

            return (
                <div>
                    <h2> List of blog posts </h2>
                    { blogPost.map( (blogInfo) => (
                        <div key={blogInfo}>
                            <h1>blogPost.id</h1>
                        </div>
                        )
                    )}

                </div>
            )



    }

    export default ListOfBlogPostComponent