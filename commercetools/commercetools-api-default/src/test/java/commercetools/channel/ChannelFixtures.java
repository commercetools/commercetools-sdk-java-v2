package commercetools.channel;

import com.commercetools.api.generated.models.channel.Channel;
import com.commercetools.api.generated.models.channel.ChannelDraft;
import com.commercetools.api.generated.models.channel.ChannelDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class ChannelFixtures {
    
    public static void withChannel(final Consumer<Channel> consumer) {
        Channel channel = createChannel();
        consumer.accept(channel);
        deleteChannel(channel.getId(), channel.getVersion());
    }
    
    public static void withUpdateableChannel(final UnaryOperator<Channel> operator) {
        Channel channel = createChannel();
        channel = operator.apply(channel);
        deleteChannel(channel.getId(), channel.getVersion());
    }
    
    public static Channel createChannel() {
        ChannelDraft channelDraft = ChannelDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .build();
        
        Channel channel = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .channels()
                .post(channelDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(channel);
        Assert.assertEquals(channelDraft.getKey(), channel.getKey());
        
        return channel;
    }
    
    public static Channel deleteChannel(final String id, final Long version) {
        Channel channel = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .channels()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();
        
        Assert.assertNotNull(channel);
        Assert.assertEquals(channel.getId(), id);
        
        return channel;
    }
}
