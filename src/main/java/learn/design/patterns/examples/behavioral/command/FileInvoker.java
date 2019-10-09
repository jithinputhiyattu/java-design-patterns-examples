package learn.design.patterns.examples.behavioral.command;

public class FileInvoker {

	// Use if required

	private Command command;

	public FileInvoker(Command c) {
		this.command = c;
	}

	public void execute() {
		this.command.execute();
	}
}
