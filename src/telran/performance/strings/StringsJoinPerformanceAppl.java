package telran.performance.strings;

import java.util.Random;

import telran.strings.StringsJoin;
import telran.strings.StringsJoinBuilder;
import telran.strings.StringsJoinOperator;
import telran.strings.SymbolsRemove;
import telran.strings.SymbolsRemoveCharArray;
import telran.strings.SymbolsRemoveStandard;

public class StringsJoinPerformanceAppl {

	private static final int N_STRINGS = 1000;
	private static final int N_RUNS = 1000;
	private static final int N_CHARS = 100000;
	private static final char SIMBOL = 'a';
	

	public static void main(String[] args) {
		String[] array = getArray(N_STRINGS);
		String str = getStr(N_CHARS);
		StringsJoinPerformance testBuilder = getTest(array, N_RUNS, "test of StringsJoinBuilder",
				new StringsJoinBuilder());
		StringsJoinPerformance testOperator = getTest(array, N_RUNS,"test of StringsJoinOperator",
				new StringsJoinOperator());
		testBuilder.run();
		testOperator.run();
		
		SymbolsRemovePerformanceTest testRemoveCharArray = getTestRemove("test RemoveCharArray", N_RUNS, new SymbolsRemoveCharArray(), str, SIMBOL);
		SymbolsRemovePerformanceTest testRemoveStandard = getTestRemove("test RemoveStandard", N_RUNS, new SymbolsRemoveStandard(), str, SIMBOL);
		testRemoveCharArray.run();
		testRemoveStandard.run();
	}

	private static StringsJoinPerformance getTest(String[] array, int nRuns, String displayName, StringsJoin stringsJoin) {
		return new StringsJoinPerformance(displayName, nRuns, stringsJoin, array);
	}
	
	private static SymbolsRemovePerformanceTest getTestRemove(String displayName, int nRuns,SymbolsRemove symbolsRemove,String str, char symbol) {
		return new SymbolsRemovePerformanceTest(displayName,nRuns,symbolsRemove,str,symbol);
	}

	private static String[] getArray(int nStrings) {
		String[] res = new String[nStrings];
		for(int i = 0; i < res.length; i++) {
			res[i] = "STRING";
		}
		return res;
	}
	private static String getStr(int nChars) {
		Random random = new Random();
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0; i<nChars; i++) {
			int charCode = random.nextInt(58)+65;
			stringBuilder.append((char)charCode);
		}
		return stringBuilder.toString();
	}
}
