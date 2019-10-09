package learn.design.patterns.examples.behavioral.command;

public class MacFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening mac file ....");

	}

	@Override
	public void readFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeFile() {
		System.out.println("Closing mac file ....");

	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub

	}

}
