package learn.design.patterns.examples.behavioral.iterator;

public class Channel {
	
	ChannelType type;
	double frequency;
	public ChannelType getType() {
		return type;
	}
	public void setType(ChannelType type) {
		this.type = type;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public Channel(ChannelType type, double frequency) {
		super();
		this.type = type;
		this.frequency = frequency;
	}
	@Override
	public String toString() {
		return "Channel [type=" + type + ", frequency=" + frequency + "]";
	}


}
