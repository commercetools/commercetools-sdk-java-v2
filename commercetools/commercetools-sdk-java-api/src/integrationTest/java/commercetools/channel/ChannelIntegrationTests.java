
package commercetools.channel;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.channel.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;
import org.junit.Test;

public class ChannelIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Channel channel = ChannelFixtures.createChannel();
        Channel deletedChannel = ChannelFixtures.deleteChannel(channel.getId(), channel.getVersion());

        Assert.assertEquals(channel.getId(), deletedChannel.getId());
    }

    @Test
    public void getById() {
        ChannelFixtures.withChannel(channel -> {
            Channel queriedChannel = CommercetoolsTestUtils.getProjectRoot()
                    .channels()
                    .withId(channel.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(queriedChannel);
            Assert.assertEquals(channel.getId(), queriedChannel.getId());
        });
    }

    @Test
    public void query() {
        ChannelFixtures.withChannel(channel -> {
            ChannelPagedQueryResponse response = CommercetoolsTestUtils.getProjectRoot()
                    .channels()
                    .get()
                    .withWhere("id=" + "\"" + channel.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), channel.getId());
        });
    }

    @Test
    public void update() {
        ChannelFixtures.withUpdateableChannel(channel -> {
            List<ChannelUpdateAction> updateActions = new ArrayList<>();
            updateActions.add(ChannelSetGeoLocationActionBuilder.of().build());

            Channel updateChannel = CommercetoolsTestUtils.getProjectRoot()
                    .channels()
                    .withId(channel.getId())
                    .post(ChannelUpdateBuilder.of().actions(updateActions).version(channel.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assert.assertNotNull(updateChannel);

            return updateChannel;
        });
    }

}
