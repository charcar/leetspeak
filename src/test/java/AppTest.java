import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    App yourApp = new App();
    assertEquals("happy", yourApp.leetspeak("happy"));
  }

  @Test
public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
  App yourApp = new App();
  assertEquals("3l3phant", yourApp.leetspeak("elephant"));
}
}
