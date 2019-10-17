package learn.design.patterns.examples.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollection implements IChannelCollection {

	List<Channel> channelList;

	public ChannelCollection() {
		super();
		channelList = new ArrayList<>();
	}

	@Override
	public boolean add(Channel channel) {
		return channelList.add(channel);

	}

	@Override
	public boolean remove(Channel channel) {
		return channelList.remove(channel);
	}

	@Override
	public IChannelIterator iterator(ChannelType type) {
 
		return new ChannelIterator(type, this.channelList);
	}

}
