package task1.behaviour.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Feed implements SocialMediaFeed{
    private List<Post> posts = new ArrayList<>();
    public static int postCnt = 0;
    public void addPost(Post post) {
        posts.add(post);
        postCnt++;
    }

    public static int getPostCnt(){
        return postCnt;
    }

    @Override
    public Iterator<Post> createIterator() {
        return new FeedIterator();
    }

    // Inner class
    private class FeedIterator implements Iterator<Post> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < posts.size();
        }

        @Override
        public Post next() {
            if (hasNext()) {
                return posts.get(currentIndex++);
            }
            return null;
        }
    }
}
