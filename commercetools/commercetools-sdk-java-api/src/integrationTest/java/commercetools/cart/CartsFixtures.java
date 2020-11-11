package commercetools.cart;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order_edit.OrderEdit;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

public class CartsFixtures {
    public static Cart deleteCart(final String id, final Long version) {
        Cart cart = CommercetoolsTestUtils.getProjectRoot()
                .carts()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(cart);
        Assert.assertEquals(cart.getId(), id);

        return cart;
    }
}
