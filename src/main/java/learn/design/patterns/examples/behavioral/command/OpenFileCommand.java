package learn.design.patterns.examples.behavioral.command;

public class OpenFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	public OpenFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	@Override
	public void execute() {
		fileSystem.openFile();

	}

}
