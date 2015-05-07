package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class SnakeCamelUtillTest {

	@Test
	public void snakeToCamelcaseでスネークからキャメルに() {
		SnakeCamelUtil snaketocamel = new SnakeCamelUtil();
		String expected1 = "AbcDef";
		String actual1 = snaketocamel.snakeToCamelcase("_abc__def");
		assertThat(actual1, is(expected1));
	}
	
	@Test
	public void camelToSnakecaseでキャメルからスネークに(){
		SnakeCamelUtil cameltosnake = new SnakeCamelUtil();
		String expected = "the_book";
		String actual = cameltosnake.camelToSnakecase("TheBook");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeで小文字を大文字に(){
		SnakeCamelUtil Capitalize = new SnakeCamelUtil();
		String expected = " ";
		String actual = Capitalize.capitalize(" ");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで大文字を小文字に(){
		SnakeCamelUtil Uncapitalize = new SnakeCamelUtil();
		String expected = "b";
		String actual = Uncapitalize.uncapitalize("b");
		assertThat(actual, is(expected));
	}
}
