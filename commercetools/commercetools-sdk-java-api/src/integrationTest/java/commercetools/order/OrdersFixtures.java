
package commercetools.order;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.channel.Channel;
import com.commercetools.api.models.channel.ChannelDraft;
import com.commercetools.api.models.channel.ChannelDraftBuilder;
import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.common.GeoJsonPointBuilder;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.OrderEdit;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class OrdersFixtures {
    public static Order deleteOrder(final String id, final Long version) {
        Order order = CommercetoolsTestUtils.getProjectRoot().orders().withId(id).delete().withVersion(
            version).executeBlocking().getBody();

        Assert.assertNotNull(order);
        Assert.assertEquals(order.getId(), id);

        return order;
    }

    public static OrderEdit deleteOrderEdit(final String id, final Long version) {
        OrderEdit orderEdit = CommercetoolsTestUtils.getProjectRoot().orders().edits().withId(id).delete().withVersion(
            version).executeBlocking().getBody();

        Assert.assertNotNull(orderEdit);
        Assert.assertEquals(orderEdit.getId(), id);

        return orderEdit;
    }
}
