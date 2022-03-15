

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (Keagan Crane)
 * @version (March 15th, 2022)
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    /**
     * Tests if the name of a sales item can be accessed.
     */
    @Test
    public void testGetName() {
        SalesItem test1 = new SalesItem("Tennis Ball", 12);
        assertEquals("Tennis Ball", test1.getName());
        assertEquals("Basketball", test1.getName());
    }
    
    /**
     * Tests if the price of a sales item can be accessed.
     */
    @Test
    public void testGetPrice() {
        SalesItem test = new SalesItem("Gum", 2);
        assertEquals(2, test.getPrice());
        assertEquals(5, test.getPrice());
    }
    
    /**
     * Tests if the number of comments on a sales item can be accessed
     */
    @Test
    public void testGetNumberOfComments() {
        SalesItem test = new SalesItem("Shoe", 40);
        test.addComment("Joe Brown", "Nice Shoe!", 5);
        assertEquals(1, test.getNumberOfComments());
        assertEquals(2, test.getNumberOfComments());
    }
    
    /**
     * Tests to see if a comment can be removed from a sales item.
     */
    @Test
    public void testRemoveComment() {
        SalesItem test = new SalesItem("box", 56231);
        test.addComment("Bobby Johnson", "Cool box", 5);
        test.addComment("Willy Jones", "ugly box", 2);
        test.removeComment(1);
        assertEquals(1, test.getNumberOfComments());
        assertEquals(2, test.getNumberOfComments());
    }
    
    /**
     * Tests to see if a comment on a sales item can be upvoted.
     */
    @Test
    public void testUpvoteComment() {
        Comment test = new Comment("Conny Springer", "Decent door", 3);
        test.upvote();
        test.upvote();
        assertEquals(2, test.getVoteCount());
        assertEquals(1, test.getVoteCount());
    }
    
    /**
     * Tests to see if a comment on a sales item can be downvoted.
     */
    @Test
    public void testDownvoteComment() {
        Comment test = new Comment("Sanji Vinsmoke", "moss head", 4);
        test.upvote();
        test.upvote();
        test.downvote();
        test.downvote();
        assertEquals(0, test.getVoteCount());
        assertEquals(1, test.getVoteCount());
    }
    
    /**
     * Tests to see if the most upvoted comment can be accessed.
     * 
     * Can't figure out
     */
    @Test
    public void testMostHelpfulComment() {
        
    }
    
    /**
     * Tests to see if the rating of a comment is valid (between 1 and 5 inclusive)
     */
    @Test
    public void testRatingInvalid() {
        int test = 1;
        assertEquals(true, test>0 && test<6);
        assertEquals(true, test<1 && test>5);
    }
    
    /**
     * Tests to see if a comment by a certain author is accessible.
     * 
     * Can't get to work
     */
    @Test
    public void testFindCommentByAuthor() {
        SalesItem test = new SalesItem("Bike", 100);
        test.addComment("Joey Barnes", "Fast Bike", 4);
        test.addComment("Harrison Johnson", "Speedy Bike", 3);
        assertEquals("Fast Bike", test.findCommentByAuthor("Joey Barnes"));
        
    }
    
    /**
     * Tests to see if a comment can be upvoted.
     */
    @Test
    public void testUpvote() {
        Comment test = new Comment("Roronoa Zoro", "I'm lost", 3);
        test.upvote();
        assertEquals(1, test.getVoteCount());
        assertEquals(2, test.getVoteCount());
    }
    
    /**
     * Tests to see if a comment can be downvoted.
     */
    @Test
    public void testDownvote() {
        Comment test = new Comment("Zeke Yeager", "My comment", 4);
        test.upvote();
        test.downvote();
        assertEquals(0, test.getVoteCount());
        assertEquals(1, test.getVoteCount());
    }
    
    /**
     * Tests to see if the rating on a comment is accessible.
     */
    @Test
    public void testGetRating() {
        Comment test = new Comment("Obito Uchiha", "Comment", 2);
        assertEquals(2, test.getRating());
        assertEquals(1, test.getRating());
    }
}
