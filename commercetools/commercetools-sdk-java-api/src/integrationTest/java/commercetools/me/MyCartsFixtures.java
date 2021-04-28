
package commercetools.me;

import static commercetools.cart.CartsFixtures.deleteCart;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.me.MyCartDraft;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;

import org.junit.Assert;

public class MyCartsFixtures {
    public static void withMeCart(final Consumer<Cart> consumer) {
        MyCartDraft myCartDraft = MyCartDraftBuilder.of().currency("EUR").country("DE").build();

        Cart myCart = createMeCart(myCartDraft);
        consumer.accept(myCart);
        deleteCart(myCart.getId(), myCart.getVersion());
    }

    public static void withUpdateableMeCart(final UnaryOperator<Cart> operator) {
        MyCartDraft myCartDraft = MyCartDraftBuilder.of().currency("EUR").country("DE").build();

        Cart myCart = createMeCart(myCartDraft);
        myCart = operator.apply(myCart);
        deleteCart(myCart.getId(), myCart.getVersion());
    }

    public static Cart createMeCart(final MyCartDraft myCartDraft) {
        Cart myCart = CommercetoolsTestUtils.getProjectRoot()
                .me()
                .carts()
                .post(myCartDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(myCart);
        Assert.assertEquals(myCart.getCountry(), myCartDraft.getCountry());

        return myCart;
    }

    public static Cart createCartWithCountry() {
        return createMeCart(MyCartDraftBuilder.of().country("DE").currency("EUR").build());
    }
}
