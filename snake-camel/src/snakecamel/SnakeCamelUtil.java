package snakecamel;

public class SnakeCamelUtil {
	
	public static void main(String args[]) {
		
		capitalize(" ");
		capitalize("a");
		capitalize("xyz");
		
		uncapitalize(" ");
		uncapitalize("A");
		uncapitalize("Xyz");
		
		snakeToCamelcase("abc");
		snakeToCamelcase("abc_def");
		snakeToCamelcase("abc_def_gh");
		snakeToCamelcase("abc__def__gh");
		snakeToCamelcase("_abc_def");
		
		camelToSnakecase("Abc");
		camelToSnakecase("AbcDef");
		camelToSnakecase("AbcDefGh");
		
	}

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < words.length; i++){
			if(words[i].isEmpty())
				i++;
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
