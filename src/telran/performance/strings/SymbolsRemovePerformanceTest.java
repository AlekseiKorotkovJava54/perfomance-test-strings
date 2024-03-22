package telran.performance.strings;

import telran.performance.PerformanceTest;
import telran.strings.SymbolsRemove;

public class SymbolsRemovePerformanceTest extends PerformanceTest {
	String str;
	char symbol;
	SymbolsRemove symbolsRemove;
	public SymbolsRemovePerformanceTest(String displayName, int nRuns,SymbolsRemove symbolsRemove,String str, char symbol) {
		super(displayName, nRuns);
		this.symbolsRemove = symbolsRemove;
		this.str = str;
	}
	@Override
	protected void runTest() {
		symbolsRemove.removeSymbols(str, symbol);
	}
}