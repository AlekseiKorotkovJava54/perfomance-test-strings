package telran.perfomance.strings;

import telran.perfomance.PerfomanceTest;
import telran.strings.StringsJoin;

public class StringsJoinRerfomance extends PerfomanceTest {
	String[] array;
	StringsJoin stringsJoin;
	public StringsJoinRerfomance(String displayName, int nRuns, StringsJoin stringsJoin, String[] array) {
		super(displayName, nRuns);
		this.stringsJoin = stringsJoin;
		this.array = array;
	}
	@Override
	protected void runTest() {
		stringsJoin.joinStrings(array, ";");
	}
}
