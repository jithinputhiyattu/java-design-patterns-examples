package learn.design.patterns.examples.behavioral.iterator;

import java.util.List;

public class ChannelIterator implements IChannelIterator {

	List<Channel> channelList;
	ChannelType type;
	int index;

	public ChannelIterator(ChannelType type, List<Channel> channelList) {
		this.channelList = channelList;
		this.type = type;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		while (channelList.size() > index) {
			Channel channel = channelList.get(index);
			if (this.type == ChannelType.ALL || channel.getType() == this.type) {
				return true;
			}
			index++;
		}
		return false;
	}

	@Override
	public Channel next() {
		return channelList.get(index++);
	}

}
