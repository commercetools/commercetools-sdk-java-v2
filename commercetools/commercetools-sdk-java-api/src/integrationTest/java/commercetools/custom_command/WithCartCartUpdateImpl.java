
package commercetools.custom_command;

import com.commercetools.api.models.cart.Cart;

public class WithCartCartUpdateImpl extends com.commercetools.api.models.cart.CartUpdateImpl {

    private Cart cart;

    public WithCartCartUpdateImpl(final Cart cart, final Long version,
            final java.util.List<com.commercetools.api.models.cart.CartUpdateAction> actions) {
        this.cart = cart;
        super.setActions(actions);
        super.setVersion(version);
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(final Cart cart) {
        this.cart = cart;
    }
}
