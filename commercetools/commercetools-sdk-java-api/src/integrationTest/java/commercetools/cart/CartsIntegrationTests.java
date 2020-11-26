package commercetools.cart;

import com.commercetools.api.models.cart.*;
import com.commercetools.api.models.customer.*;
import com.commercetools.api.models.product.*;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import commercetools.customer.CustomerFixtures;
import commercetools.product.ProductFixtures;
import commercetools.tax_category.TaxCategoryFixtures;
import commercetools.utils.CommercetoolsTestUtils;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.junit.Assert;
import org.junit.Test;

import javax.crypto.spec.RC5ParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CartsIntegrationTests {
    @Test
    public void signInWithAnonymousCartWithNewActiveCart() {
        CustomerFixtures.withCustomer(customer -> {
            ProductFixtures.withTaxedProduct(product -> {
                CartsFixtures.withUpdateableCart(anonymousCart -> {
                        List<CartUpdateAction> updateAnonymousActions = new ArrayList<>();
                        updateAnonymousActions.add(
                                CartAddLineItemActionBuilder.of()
                                    .productId(product.getId())
                                    .sku("123ng")
                                    .variantId(1L)
                                    .quantity(7L)
                                    .build()
                        );

                        Cart updatedAnonymousCart = CommercetoolsTestUtils.getProjectRoot()
                                                        .carts()
                                                        .withId(anonymousCart.getId())
                                                        .post(
                                                                CartUpdateBuilder.of()
                                                                        .version(anonymousCart.getVersion())
                                                                        .actions(updateAnonymousActions)
                                                                        .build()
                                                        )
                                                        .executeBlocking().getBody();

                        Assert.assertNotNull(updatedAnonymousCart);
                        Assert.assertEquals(updatedAnonymousCart.getId(), anonymousCart.getId());

                        return updatedAnonymousCart;
                        //                -----------------------------------------------------------


//                        ApiHttpResponse<CustomerSignInResult> customerSignInResult =
//                                CommercetoolsTestUtils.getProjectRoot()
//                                        .login()
//                                        .post(
//                                                CustomerSigninBuilder.of().email(customer.getEmail())
//                                                        .password("secret").anonymousCartId(anonymousCart.getId())
//                                                        .anonymousCartSignInMode(AnonymousCartSignInMode.USE_AS_NEW_ACTIVE_CUSTOMER_CART)
//                                                        .build()
//                                        )
//                                        .executeBlocking();
//                        JsonNode activeCartAnonymousCustomer = customerSignInResult.getBody().getCart();
//                        String cartString = activeCartAnonymousCustomer.toString();
//                        Assert.assertNotNull(activeCartAnonymousCustomer);

//                        List<CartUpdateAction> updateActions = new ArrayList<>();
//                        updateActions.add(CartSetCountryActionBuilder.of()
//                                .country("DE")
//                                .build());
//                        updateActions.add(CartAddLineItemActionBuilder.of()
//                                .productId(product.getId())
//                                .variantId(1L)
//                                .quantity(3L)
//                                .build());
//                        CartUpdate cartWithProduct = CartUpdateBuilder.of()
//                                .version(cart.getVersion())
//                                .actions(updateActions)
//                                .build();
//
//                        Cart updatedCart = CommercetoolsTestUtils.getProjectRoot()
//                                .carts()
//                                .withId(cart.getId())
//                                .post(cartWithProduct)
//                                .executeBlocking().getBody();
//
//                        Cart anonymousCart = CartsFixtures.createCartWithCountry();
                    });

        });
    });
}
}
