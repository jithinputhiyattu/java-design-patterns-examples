package learn.design.patterns.examples.behavioral.command;

public class CloseFileCommand implements Command {
	private FileSystemReceiver fileSystem;

	public CloseFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		fileSystem.closeFile();
	}

}
