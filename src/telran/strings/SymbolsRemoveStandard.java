package telran.strings;

public class SymbolsRemoveStandard implements SymbolsRemove {

	@Override
	public String removeSymbols(String str, char symbol) {
		String i = "" + symbol;
		return str.replaceAll(i, "");
	}
}
