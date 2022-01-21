
package commercetools.channel;

import static commercetools.channel.ChannelFixtures.*;

import java.util.ArrayList;
import java.util.List;

import com.commercetools.api.models.channel.*;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChannelIntegrationTests {

    @Test
    public void createAndDeleteById() {
        Channel channel = createChannel();
        Channel deletedChannel = deleteChannel(channel.getId(), channel.getVersion());

        Assertions.assertEquals(channel.getId(), deletedChannel.getId());
    }

    @Test
    public void getById() {
        withChannel(channel -> {
            Channel queriedChannel = CommercetoolsTestUtils.getProjectApiRoot()
                    .channels()
                    .withId(channel.getId())
                    .get()
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(queriedChannel);
            Assertions.assertEquals(channel.getId(), queriedChannel.getId());
        });
    }

    @Test
    public void query() {
        withChannel(channel -> {
            ChannelPagedQueryResponse response = CommercetoolsTestUtils.getProjectApiRoot()
                    .channels()
                    .get()
                    .withWhere("id=" + "\"" + channel.getId() + "\"")
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(response);
            Assertions.assertEquals(response.getResults().get(0).getId(), channel.getId());
        });
    }

    @Test
    public void update() {
        withUpdateableChannel(channel -> {
            List<ChannelUpdateAction> updateActions = new ArrayList<>();
            updateActions.add(ChannelSetGeoLocationActionBuilder.of().build());

            Channel updateChannel = CommercetoolsTestUtils.getProjectApiRoot()
                    .channels()
                    .withId(channel.getId())
                    .post(ChannelUpdateBuilder.of().actions(updateActions).version(channel.getVersion()).build())
                    .executeBlocking()
                    .getBody();

            Assertions.assertNotNull(updateChannel);

            return updateChannel;
        });
    }

}
