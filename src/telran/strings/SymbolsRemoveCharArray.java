package telran.strings;

public class SymbolsRemoveCharArray implements SymbolsRemove {

	@Override
	public String removeSymbols(String str, char symbol) {
		char[] charArray = str.toCharArray();
		int count =0;
		for(char i : charArray) {
			if (i != symbol) count +=1;
		}
		char[] newArray = new char[count];
		int index =0;
		for(char i : charArray) {
			if(i != symbol) newArray[index++] = i;
			// index +=1;
		}
		return new String(newArray);
	}
}