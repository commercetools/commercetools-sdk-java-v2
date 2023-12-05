
package com.commercetools.api.models.payment;

import java.time.ZonedDateTime;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class TransactionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TransactionBuilder builder) {
        Transaction transaction = builder.buildUnchecked();
        Assertions.assertThat(transaction).isInstanceOf(Transaction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Transaction.builder().id("id") },
                new Object[] { Transaction.builder().timestamp(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { Transaction.builder()
                        .type(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization")) },
                new Object[] { Transaction.builder()
                        .amount(new com.commercetools.api.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { Transaction.builder().interactionId("interactionId") },
                new Object[] { Transaction.builder()
                        .state(com.commercetools.api.models.payment.TransactionState.findEnum("Initial")) },
                new Object[] {
                        Transaction.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) } };
    }

    @Test
    public void id() {
        Transaction value = Transaction.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void timestamp() {
        Transaction value = Transaction.of();
        value.setTimestamp(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTimestamp()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void type() {
        Transaction value = Transaction.of();
        value.setType(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization"));
    }

    @Test
    public void amount() {
        Transaction value = Transaction.of();
        value.setAmount(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getAmount())
                .isEqualTo(new com.commercetools.api.models.common.CentPrecisionMoneyImpl());
    }

    @Test
    public void interactionId() {
        Transaction value = Transaction.of();
        value.setInteractionId("interactionId");
        Assertions.assertThat(value.getInteractionId()).isEqualTo("interactionId");
    }

    @Test
    public void state() {
        Transaction value = Transaction.of();
        value.setState(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
    }

    @Test
    public void custom() {
        Transaction value = Transaction.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }
}
