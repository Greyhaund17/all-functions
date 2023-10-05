import org.junit.*;

public class MainClassTest {
    @BeforeClass                       //amenaarajin katarvox gorts. metodneric araj katarvox gortsoxutyun
    public void beforeClassMethod() {
    }

    @Before                         // naxqan metodi gortsoxutyun
    public void setUp() {
    }

    @Test                          // metodi gortsoxutyun
    @Ignore                        // metodi chkatarum
    public void method() {

    }

    @Test
    public void method1() {
    }


    @After                            // metodic heto katarvox gortsoxutyun
    public void tearDown() {

    }

    @AfterClass                        //amenaverjin metodic heto katarvox gortsoxutyun
    public void afterClassMethod() {
   // ete unenq 3 hat method urmn arajin@ @Beforeclass-@Before-@Test-@After-@Before-@Test-@After-
        // @Before-@Test-@After-@AfterClass

    }
}
