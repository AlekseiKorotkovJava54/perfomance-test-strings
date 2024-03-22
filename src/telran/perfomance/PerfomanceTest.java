package telran.perfomance;

public abstract class PerfomanceTest {
	int nRuns;
	String displayName;
	protected PerfomanceTest(String displayName, int nRuns) {
		this.nRuns = nRuns;
		this.displayName = displayName;
	}
	protected abstract void runTest();
	public void run() {
		long timestamStart = System.currentTimeMillis();
		for(int i=0; i<nRuns; i++) {
			runTest();
		}
		long timestamFinish = System.currentTimeMillis();
		long runningTime = timestamFinish - timestamStart;
		System.out.printf("%s; number of runs: %d; running time: %d\n", displayName, nRuns, runningTime);
	}
}
