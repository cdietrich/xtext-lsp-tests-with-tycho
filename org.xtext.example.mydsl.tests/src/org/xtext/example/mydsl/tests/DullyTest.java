package org.xtext.example.mydsl.tests;
import org.eclipse.xtext.testing.AbstractLanguageServerTest;
import org.eclipse.xtext.testing.HoverTestConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DullyTest extends AbstractLanguageServerTest {
	public DullyTest() {
		super("mydsl");
	}
	
	  @BeforeEach
	  public void setup() {
	    super.setup();
	  }
	  
	  @AfterEach
	  public void cleanup() {
	    super.cleanup();
	  }

	@Test
	public void testHover_01() {
		testHover((HoverTestConfiguration it) -> {
			String model =
					"/**\n" +
					" * Some documentation.\n" +
					" */\n" +
					"Hello Foo !\n";
			it.setModel(model);
			it.setLine(3);
			it.setColumn("type F".length());
			String expectedHover =
					"[[3, 6] .. [3, 9]]\n" +
					"kind: markdown\n" +
					"value: Some documentation.\n";
			it.setExpectedHover(expectedHover);
		});
	}
}