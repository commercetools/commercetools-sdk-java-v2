
package com.commercetools.history.models.common;

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
                new Object[] { Transaction.builder().timestamp("timestamp") },
                new Object[] { Transaction.builder()
                        .type(com.commercetools.history.models.common.TransactionType.findEnum("Authorization")) },
                new Object[] { Transaction.builder().amount(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { Transaction.builder().interactionId("interactionId") },
                new Object[] { Transaction.builder()
                        .state(com.commercetools.history.models.common.TransactionState.findEnum("Initial")) } };
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
        value.setTimestamp("timestamp");
        Assertions.assertThat(value.getTimestamp()).isEqualTo("timestamp");
    }

    @Test
    public void type() {
        Transaction value = Transaction.of();
        value.setType(com.commercetools.history.models.common.TransactionType.findEnum("Authorization"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.history.models.common.TransactionType.findEnum("Authorization"));
    }

    @Test
    public void amount() {
        Transaction value = Transaction.of();
        value.setAmount(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
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
        value.setState(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.history.models.common.TransactionState.findEnum("Initial"));
    }
}
