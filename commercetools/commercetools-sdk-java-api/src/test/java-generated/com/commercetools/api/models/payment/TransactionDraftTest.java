
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
public class TransactionDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TransactionDraftBuilder builder) {
        TransactionDraft transactionDraft = builder.buildUnchecked();
        Assertions.assertThat(transactionDraft).isInstanceOf(TransactionDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TransactionDraft.builder().timestamp(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { TransactionDraft.builder()
                        .type(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization")) },
                new Object[] { TransactionDraft.builder().amount(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { TransactionDraft.builder().interactionId("interactionId") },
                new Object[] { TransactionDraft.builder()
                        .state(com.commercetools.api.models.payment.TransactionState.findEnum("Initial")) },
                new Object[] { TransactionDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void timestamp() {
        TransactionDraft value = TransactionDraft.of();
        value.setTimestamp(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTimestamp()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void type() {
        TransactionDraft value = TransactionDraft.of();
        value.setType(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization"));
    }

    @Test
    public void amount() {
        TransactionDraft value = TransactionDraft.of();
        value.setAmount(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void interactionId() {
        TransactionDraft value = TransactionDraft.of();
        value.setInteractionId("interactionId");
        Assertions.assertThat(value.getInteractionId()).isEqualTo("interactionId");
    }

    @Test
    public void state() {
        TransactionDraft value = TransactionDraft.of();
        value.setState(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.api.models.payment.TransactionState.findEnum("Initial"));
    }

    @Test
    public void custom() {
        TransactionDraft value = TransactionDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
