Test.describe("Sample Tests", function() {
    Test.it("Should pass sample tests", function() {
      Test.assertEquals(zeros(0), 0, "Testing with n = 0")
      Test.assertEquals(zeros(6), 1, "Testing with n = 6")
      Test.assertEquals(zeros(30), 7, "Testing with n = 30")
    });
  });