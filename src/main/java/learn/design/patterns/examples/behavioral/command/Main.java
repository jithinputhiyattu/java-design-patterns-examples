package learn.design.patterns.examples.behavioral.command;

public class Main {

	public static void main(String[] args) {

		FileSystemReceiver fs = FileSystemUtil.getFileSystem();

		OpenFileCommand ofc = new OpenFileCommand(fs);

		ofc.execute();

		CloseFileCommand cfc = new CloseFileCommand(fs);
		cfc.execute();

	}

}
