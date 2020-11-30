package commercetools.me;

import com.commercetools.api.models.me.MyCart;
import com.commercetools.api.models.me.MyCartDraft;
import com.commercetools.api.models.me.MyCartDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import static commercetools.cart.CartsFixtures.deleteCart;

public class MyCartsFixtures {
    public static MyCart deleteMyCart(final String id, final Long version) {
        MyCart myCart = CommercetoolsTestUtils.getProjectRoot()
                .me().carts()
                .withId(id)
                .delete()
                .withVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(myCart);
        Assert.assertEquals(myCart.getId(), id);

        return myCart;
    }

    public static void withMeCart(final Consumer<MyCart> consumer) {
        MyCartDraft myCartDraft = MyCartDraftBuilder.of()
                .currency("EUR")
                .country("DE")
                .build();

        MyCart myCart = createMeCart(myCartDraft);
        consumer.accept(myCart);
        deleteCart(myCart.getId(), myCart.getVersion());
    }

    public static void withUpdateableMeCart(final UnaryOperator<MyCart> operator) {
        MyCartDraft myCartDraft = MyCartDraftBuilder.of()
                .currency("EUR")
                .country("DE")
                .build();

        MyCart myCart = createMeCart(myCartDraft);
        myCart = operator.apply(myCart);
        deleteCart(myCart.getId(), myCart.getVersion());
    }

    public static MyCart createMeCart(final MyCartDraft myCartDraft) {
        MyCart myCart = CommercetoolsTestUtils.getProjectRoot()
                .me().carts()
                .post(myCartDraft)
                .executeBlocking()
                .getBody();

        Assert.assertNotNull(myCart);
        Assert.assertEquals(myCart.getCountry(), myCartDraft.getCountry());

        return myCart;
    }

    public static MyCart createCartWithCountry() {
        return createMeCart(MyCartDraftBuilder.of()
                .country("DE")
                .currency("EUR")
                .build());
    }
}
