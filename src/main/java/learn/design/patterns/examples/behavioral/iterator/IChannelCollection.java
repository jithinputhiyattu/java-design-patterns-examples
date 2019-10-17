package learn.design.patterns.examples.behavioral.iterator;

public interface IChannelCollection {
	
	public boolean add(Channel channel);
	
	public boolean remove(Channel channel);
	
	
	public IChannelIterator iterator(ChannelType type);

}
