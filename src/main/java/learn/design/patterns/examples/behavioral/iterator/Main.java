package learn.design.patterns.examples.behavioral.iterator;

public class Main {

	public static void main(String[] args) {

		ChannelCollection channelCollection = new ChannelCollection();

		channelCollection.add(new Channel(ChannelType.TAMIL, 94.7));
		channelCollection.add(new Channel(ChannelType.ENGLISH, 90.7));
		channelCollection.add(new Channel(ChannelType.MALAYALAM, 91.7));
		channelCollection.add(new Channel(ChannelType.ENGLISH, 92.7));
		channelCollection.add(new Channel(ChannelType.KANNADA, 93.7));
		channelCollection.add(new Channel(ChannelType.KANNADA, 94.6));
		channelCollection.add(new Channel(ChannelType.HINDI, 94.5));
		channelCollection.add(new Channel(ChannelType.ENGLISH, 94.4));
		channelCollection.add(new Channel(ChannelType.HINDI, 94.3));

		IChannelIterator iterator = channelCollection.iterator(ChannelType.ALL);

		while (iterator.hasNext()) {

			System.out.println(iterator.next().toString());

		}

	}

}
