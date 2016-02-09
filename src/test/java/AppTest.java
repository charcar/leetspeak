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
    assertEquals("3l3phant", yourApp.leetspeak("Elephant"));
}

  @Test
  public void leetspeak_replacesEveryOInAStringWithA0_wordChanges() {
    App yourApp = new App();
    assertEquals("b00 b00", yourApp.leetspeak("boo boo"));
}

  @Test
  public void leetspeak_replacesEveryIInAStringWithA1_wordChanges() {
    App yourApp = new App();
    assertEquals("1 lik3 1k3", yourApp.leetspeak("I like Ike"));
}

  @Test
  public void leetspeak_replacesEverySInAStringWithAZ_wordChanges() {
    App yourApp = new App();
    assertEquals("r0z3z ar3 r3d", yourApp.leetspeak("roses are red"));
}

@Test
public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
  App yourApp = new App();
  assertEquals("Suzi3 Sunzhin3", yourApp.leetspeak("Susie Sunshine"));
}

@Test
public void leetspeak_makesCorrectReplacementsRegardlessOfCase_ignoresUppercase() {
  App yourApp = new App();
  assertEquals( "1 scr3am y0u scr3am w3 all scr3am f0r razpb3rry ic3 cr3am!", yourApp.leetspeak("I scream you scream we all scream for raspberry ice cream!"));
}

}
