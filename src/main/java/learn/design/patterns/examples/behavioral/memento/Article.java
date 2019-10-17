package learn.design.patterns.examples.behavioral.memento;

public class Article {

	String caption;
	String content;

	public Article(String string, String string2) {
		 this.caption = string;
		 this.content = string2;
	}

	public String getCaption() {
		return caption;
	}

	@Override
	public String toString() {
		return "Article [caption=" + caption + ", content=" + content + "]";
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public void restore(Memento memento) {

		this.caption = memento.caption;
		this.content = memento.content;
	}

	public Memento save() {
		return new Memento(caption, content);
	}

}
