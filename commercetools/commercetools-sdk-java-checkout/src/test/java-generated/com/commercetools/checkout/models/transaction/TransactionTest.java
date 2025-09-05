
package com.commercetools.checkout.models.transaction;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TransactionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TransactionBuilder builder) {
        Transaction transaction = builder.buildUnchecked();
        Assertions.assertThat(transaction).isInstanceOf(Transaction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Transaction.builder().id("id") },
                new Object[] { "key", Transaction.builder().key("key") },
                new Object[] { "version", Transaction.builder().version(2) },
                new Object[] { "application", Transaction.builder()
                        .application(
                            new com.commercetools.checkout.models.application.ApplicationResourceIdentifierImpl()) },
                new Object[] { "transactionItems",
                        Transaction.builder()
                                .transactionItems(Collections.singletonList(
                                    new com.commercetools.checkout.models.transaction.TransactionItemImpl())) },
                new Object[] { "cart",
                        Transaction.builder().cart(new com.commercetools.checkout.models.cart.CartReferenceImpl()) },
                new Object[] { "transactionStatus", Transaction.builder()
                        .transactionStatus(new com.commercetools.checkout.models.transaction.TransactionStatusImpl()) },
                new Object[] { "order",
                        Transaction.builder().order(new com.commercetools.checkout.models.cart.OrderReferenceImpl()) },
                new Object[] { "createdAt", Transaction.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Transaction.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void id() {
        Transaction value = Transaction.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        Transaction value = Transaction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void version() {
        Transaction value = Transaction.of();
        value.setVersion(2);
        Assertions.assertThat(value.getVersion()).isEqualTo(2);
    }

    @Test
    public void application() {
        Transaction value = Transaction.of();
        value.setApplication(new com.commercetools.checkout.models.application.ApplicationResourceIdentifierImpl());
        Assertions.assertThat(value.getApplication())
                .isEqualTo(new com.commercetools.checkout.models.application.ApplicationResourceIdentifierImpl());
    }

    @Test
    public void transactionItems() {
        Transaction value = Transaction.of();
        value.setTransactionItems(
            Collections.singletonList(new com.commercetools.checkout.models.transaction.TransactionItemImpl()));
        Assertions.assertThat(value.getTransactionItems())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.checkout.models.transaction.TransactionItemImpl()));
    }

    @Test
    public void cart() {
        Transaction value = Transaction.of();
        value.setCart(new com.commercetools.checkout.models.cart.CartReferenceImpl());
        Assertions.assertThat(value.getCart())
                .isEqualTo(new com.commercetools.checkout.models.cart.CartReferenceImpl());
    }

    @Test
    public void transactionStatus() {
        Transaction value = Transaction.of();
        value.setTransactionStatus(new com.commercetools.checkout.models.transaction.TransactionStatusImpl());
        Assertions.assertThat(value.getTransactionStatus())
                .isEqualTo(new com.commercetools.checkout.models.transaction.TransactionStatusImpl());
    }

    @Test
    public void order() {
        Transaction value = Transaction.of();
        value.setOrder(new com.commercetools.checkout.models.cart.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder())
                .isEqualTo(new com.commercetools.checkout.models.cart.OrderReferenceImpl());
    }

    @Test
    public void createdAt() {
        Transaction value = Transaction.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Transaction value = Transaction.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
