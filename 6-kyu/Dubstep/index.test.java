public class SongTests {
    @Test
    public void Test1() {
      assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
       assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }
}