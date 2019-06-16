public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(30, Kata.modifiedSum(new int[] {1,2,3}, 3)); 
        assertEquals(30, Kata.modifiedSum(new int[] {1,2}, 5));
    }
}