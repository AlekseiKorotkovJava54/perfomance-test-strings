package telran.strings;

public class StringsJoinBuilder implements StringsJoin {

	@Override
	public String joinStrings(String[] array, String delimiter) {
		StringBuilder stringBuilder = new StringBuilder(array[0]);
		for (int i = 1; i < array.length; i++) {
			stringBuilder.append(delimiter).append(array[i]);
		}
		return stringBuilder.toString();
	}

}
