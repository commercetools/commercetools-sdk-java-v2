
package commercetools.channel;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelDraft;
import com.commercetools.api.models.channel.ChannelDraftBuilder;
import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.common.GeoJsonPointBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

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
                .roles(Arrays.asList(ChannelRoleEnum.INVENTORY_SUPPLY))
                .geoLocation(GeoJsonPointBuilder.of().coordinates(Arrays.asList(13.0, 51.0)).build())
                .build();

        Channel channel = CommercetoolsTestUtils.getProjectRoot()
                .channels()
                .post(channelDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(channel);
        Assert.assertEquals(channelDraft.getKey(), channel.getKey());

        return channel;
    }

    public static Channel deleteChannel(final String id, final Long version) {
        Channel channel = CommercetoolsTestUtils.getProjectRoot()
                .channels()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(channel);
        Assert.assertEquals(channel.getId(), id);

        return channel;
    }
}
