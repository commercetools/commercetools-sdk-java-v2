package commercetools.custom_command;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.cart.CartUpdate;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartUpdateBuilder;

import java.util.List;
import java.util.Objects;

public class IncludeCartCartUpdateBuilder extends CartUpdateBuilder {
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    public IncludeCartCartUpdateBuilder cart(Cart cart){
        this.cart = cart;
        return this;
    }

    public static IncludeCartCartUpdateBuilder of() {
        return new IncludeCartCartUpdateBuilder();
    }

    @Override
    public CartUpdate build() {
        final Long version = super.getVersion();
        final List<CartUpdateAction> actions = super.getActions();
        Objects.requireNonNull(version, CartUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, CartUpdate.class + ": actions is missing");
        Objects.requireNonNull(cart, CartUpdate.class + ": cart is missing");
        return new WithCartCartUpdateImpl(cart, version, actions);
    }
}
