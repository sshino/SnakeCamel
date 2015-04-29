package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelUtillTest {

	@Test
	public void snakeToCamelcase�ŃX�l�[�N����L��������() {
		SnakeCamelUtil snaketocamel = new SnakeCamelUtil();
		String expected = "theBook";
		String actual = snaketocamel.snakeToCamelcase("the_book");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecase�ŃL����������X�l�[�N��(){
		SnakeCamelUtil cameltosnake = new SnakeCamelUtil();
		String expected = "the_book";
		String actual = cameltosnake.camelToSnakecase("theBook");
		assertThat(actual, is(expected));
	}
}
