public class Tests {
    @Test
    public void FixedTests() {
        assertEquals(86, Solution.predictAge(65,60,75,55,60,63,64,45));
        assertEquals(79, Solution.predictAge(32,54,76,65,34,63,64,45));
    }
}