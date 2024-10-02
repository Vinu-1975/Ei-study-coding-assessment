package task1.behaviour.iterator;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args){
        Feed feed = new Feed();
        System.out.println("Populating app with posts....");
        feed.addPost(new Post("Hello, this is my first post!", "Alice"));
        feed.addPost(new Post("Here's a cool photo from my vacation!", "Bob"));
        feed.addPost(new Post("I just attended a great concert!", "Charlie"));
        System.out.println("Successfully added " + new Feed().getPostCnt() + " posts");
        System.out.println("");
        System.out.println("Iterating over all posts so far...");
        Iterator<Post> iterator = feed.createIterator();
        while (iterator.hasNext()) {
            Post post = iterator.next();
            System.out.println(post);
        }
    }
}
