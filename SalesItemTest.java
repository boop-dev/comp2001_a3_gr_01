

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
     * 
     */
    @Test
    public void testGetName() {
        SalesItem test1 = new SalesItem("Tennis Ball", 12);
        assertEquals("Tennis Ball", test1.getName());
        assertEquals("Basketball", test1.getName());
    }
    
    @Test
    public void testGetPrice() {
        SalesItem test = new SalesItem("Gum", 2);
        assertEquals(2, test.getPrice());
        assertEquals(5, test.getPrice());
    }
    
    @Test
    public void testGetNumberOfComments() {
        SalesItem test = new SalesItem("Shoe", 40);
        test.addComment("Joe Brown", "Nice Shoe!", 5);
        assertEquals(1, test.getNumberOfComments());
        assertEquals(2, test.getNumberOfComments());
    }
    
    @Test
    public void testRemoveComment() {
        SalesItem test = new SalesItem("box", 56231);
        test.addComment("Bobby Johnson", "Cool box", 5);
        test.addComment("Willy Jones", "ugly box", 2);
        test.removeComment(1);
        assertEquals(1, test.getNumberOfComments());
        assertEquals(2, test.getNumberOfComments());
    }
    
    @Test
    public void testUpvoteComment() {
        Comment test = new Comment("Conny Springer", "Decent door", 3);
        test.upvote();
        test.upvote();
        assertEquals(2, test.getVoteCount());
        assertEquals(1, test.getVoteCount());
    }
        
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
    

}
