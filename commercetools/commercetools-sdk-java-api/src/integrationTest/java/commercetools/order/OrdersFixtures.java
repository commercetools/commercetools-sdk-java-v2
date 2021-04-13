
package commercetools.order;

import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.OrderEdit;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class OrdersFixtures {
    public static Order deleteOrder(final String id, final Long version) {
        Order order = CommercetoolsTestUtils.getProjectRoot()
                .orders()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(order);
        Assert.assertEquals(order.getId(), id);

        return order;
    }

    public static OrderEdit deleteOrderEdit(final String id, final Long version) {
        OrderEdit orderEdit = CommercetoolsTestUtils.getProjectRoot()
                .orders()
                .edits()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(orderEdit);
        Assert.assertEquals(orderEdit.getId(), id);

        return orderEdit;
    }
}
