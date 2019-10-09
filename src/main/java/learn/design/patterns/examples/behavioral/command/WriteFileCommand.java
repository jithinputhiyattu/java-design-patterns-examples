package learn.design.patterns.examples.behavioral.command;

public class WriteFileCommand implements Command {
	FileSystemReceiver fileSystem;

	public WriteFileCommand(FileSystemReceiver fileSystem) {
		super();
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		fileSystem.writeFile();

	}
}
