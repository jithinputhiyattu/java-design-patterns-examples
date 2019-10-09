package learn.design.patterns.examples.behavioral.command;

public interface FileSystemReceiver {

	public void openFile();

	public void readFile();

	public void closeFile();

	public void writeFile();

}
