
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

import org.junit.jupiter.api.Assertions;

public class ChannelFixtures {

    public static void withChannel(final Consumer<Channel> consumer) {
        Channel channel = createChannel();
        try {
            consumer.accept(channel);
        }
        finally {
            deleteChannel(channel.getId(), channel.getVersion());
        }
    }

    public static void withUpdateableChannel(final UnaryOperator<Channel> operator) {
        Channel channel = createChannel();
        try {
            channel = operator.apply(channel);
        }
        finally {
            deleteChannel(channel.getId(), channel.getVersion());
        }
    }

    public static Channel createChannel() {
        ChannelDraft channelDraft = ChannelDraftBuilder.of()
                .key(CommercetoolsTestUtils.randomKey())
                .roles(Arrays.asList(ChannelRoleEnum.INVENTORY_SUPPLY))
                .geoLocation(GeoJsonPointBuilder.of().coordinates(Arrays.asList(13.0, 51.0)).build())
                .build();

        Channel channel = CommercetoolsTestUtils.getProjectApiRoot()
                .channels()
                .post(channelDraft)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(channel);
        Assertions.assertEquals(channelDraft.getKey(), channel.getKey());

        return channel;
    }

    public static Channel deleteChannel(final String id, final Long version) {
        Channel channel = CommercetoolsTestUtils.getProjectApiRoot()
                .channels()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assertions.assertNotNull(channel);
        Assertions.assertEquals(channel.getId(), id);

        return channel;
    }
}
