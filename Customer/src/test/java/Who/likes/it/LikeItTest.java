package Who.likes.it;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LikeItTest {

    @Test
    void whoLikesItTest() {
        //Given
        LikeIt likeIt = new LikeIt();
        //When
        String noOne = likeIt.whoLikesIt();
        String one = likeIt.whoLikesIt("Peter");
        String two = likeIt.whoLikesIt("Jacob", "Alex");
        String three = likeIt.whoLikesIt("Max", "John", "Mark");
        String moreThenThree = likeIt.whoLikesIt("Alex", "Jacob", "Mark", "Max");

        String noOneCase = likeIt.likesIt();
        String oneCase = likeIt.likesIt("Peter");
        String twoCase = likeIt.likesIt("Jacob", "Alex");
        String threeCase = likeIt.likesIt("Max", "John", "Mark");
        String moreThenThreeCase = likeIt.likesIt("Alex", "Jacob", "Mark", "Max");
        //Then
        assertEquals(noOne, "no one likes this");
        assertEquals(one, "Peter likes this");
        assertEquals(two, "Jacob and Alex like this");
        assertEquals(three, "Max, John and Mark like this");
        assertEquals(moreThenThree, "Alex, Jacob and 2 others like this");

        assertEquals(noOneCase, "no one likes this");
        assertEquals(oneCase, "Peter likes this");
        assertEquals(twoCase, "Jacob and Alex like this");
        assertEquals(threeCase, "Max, John and Mark like this");
        assertEquals(moreThenThreeCase, "Alex, Jacob and 2 others like this");
    }

}