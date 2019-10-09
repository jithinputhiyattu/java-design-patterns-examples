package learn.design.patterns.examples.behavioral.command;

public class FileSystemUtil {

	public static FileSystemReceiver getFileSystem() {
		return new MacFileSystemReceiver();
	}
}
