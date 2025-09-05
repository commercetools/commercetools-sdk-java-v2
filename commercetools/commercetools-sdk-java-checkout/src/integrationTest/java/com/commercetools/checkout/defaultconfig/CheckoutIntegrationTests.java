
package com.commercetools.checkout.defaultconfig;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.models.cart.CartDraft;
import com.commercetools.checkout.models.transaction.TransactionDraft;

import io.vrap.rmf.base.client.oauth2.ClientCredentials;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckoutIntegrationTests {

    private static final ProjectApiRoot projectApiRoot;
    private static final com.commercetools.checkout.client.ProjectApiRoot checkoutApiRoot;

    static {
        projectApiRoot = createApiClient();
        checkoutApiRoot = createCheckoutClient();
    }
    public static ProjectApiRoot createApiClient() {
        return ApiRootBuilder.ofEnvironmentVariables().buildProjectRoot();
    }

    public static com.commercetools.checkout.client.ProjectApiRoot createCheckoutClient() {
        return CheckoutApiRootBuilder.of()
                .defaultClient(ClientCredentials.of()
                        .withClientId(System.getenv("CTP_CLIENT_ID"))
                        .withClientSecret(System.getenv("CTP_CLIENT_SECRET"))
                        .build(),
                    ServiceRegion.GCP_EUROPE_WEST1)
                .build(System.getenv("CTP_PROJECT_KEY"));
    }

    // create client, then cart, then transaction
    @Test
    public void createAndGetTransactionTest() {
        var newCart = CartDraft.builder().currency("EUR").build();

        var cart = projectApiRoot.carts().post(newCart).executeBlocking().getBody();
        Assertions.assertNotNull(cart);

        var transactionKey = "transaction-" + CheckoutApiTestUtils.randomKey();
        var transaction = checkoutApiRoot.with()
                .transactions()
                .post(TransactionDraft.builder()
                        .key(transactionKey)
                        .application(a -> a.key("demo-commercetools-checkout"))
                        .cart(c -> c.id(cart.getId()))
                        .plusTransactionItems(t -> t.amount(a -> a.centAmount(100).currencyCode("EUR"))
                                .paymentIntegration(p -> p.key("sample-invoice-payment")))
                        .build()

                )
                .executeBlocking()
                .getBody();

        // Create transaction
        Assertions.assertNotNull(transaction);

        Assertions.assertNotNull(
            checkoutApiRoot.with().transactions().withId(transaction.getId()).get().executeBlocking().getBody());
        Assertions.assertEquals(transactionKey, transaction.getKey());
        Assertions.assertNotNull(
            checkoutApiRoot.with().transactions().withKey(transaction.getKey()).get().executeBlocking().getBody());
    }
}
