
package com.commercetools.checkout.models.transaction;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionDraftBuilder builder) {
        TransactionDraft transactionDraft = builder.buildUnchecked();
        Assertions.assertThat(transactionDraft).isInstanceOf(TransactionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", TransactionDraft.builder().key("key") },
                new Object[] { "application", TransactionDraft.builder()
                        .application(
                            new com.commercetools.checkout.models.application.ApplicationResourceIdentifierImpl()) },
                new Object[] { "transactionItems",
                        TransactionDraft.builder()
                                .transactionItems(Collections.singletonList(
                                    new com.commercetools.checkout.models.transaction.TransactionItemDraftImpl())) },
                new Object[] { "cart", TransactionDraft.builder()
                        .cart(new com.commercetools.checkout.models.cart.CartResourceIdentifierImpl()) } };
    }

    @Test
    public void key() {
        TransactionDraft value = TransactionDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void application() {
        TransactionDraft value = TransactionDraft.of();
        value.setApplication(new com.commercetools.checkout.models.application.ApplicationResourceIdentifierImpl());
        Assertions.assertThat(value.getApplication())
                .isEqualTo(new com.commercetools.checkout.models.application.ApplicationResourceIdentifierImpl());
    }

    @Test
    public void transactionItems() {
        TransactionDraft value = TransactionDraft.of();
        value.setTransactionItems(
            Collections.singletonList(new com.commercetools.checkout.models.transaction.TransactionItemDraftImpl()));
        Assertions.assertThat(value.getTransactionItems())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.checkout.models.transaction.TransactionItemDraftImpl()));
    }

    @Test
    public void cart() {
        TransactionDraft value = TransactionDraft.of();
        value.setCart(new com.commercetools.checkout.models.cart.CartResourceIdentifierImpl());
        Assertions.assertThat(value.getCart())
                .isEqualTo(new com.commercetools.checkout.models.cart.CartResourceIdentifierImpl());
    }
}
