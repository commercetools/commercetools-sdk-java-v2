
package com.commercetools.api.models.payment;

import java.time.ZonedDateTime;

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
        return new Object[][] {
                new Object[] { "timestamp",
                        TransactionDraft.builder().timestamp(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "type",
                        TransactionDraft.builder()
                                .type(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization")) },
                new Object[] { "amount",
                        TransactionDraft.builder().amount(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "interactionId", TransactionDraft.builder().interactionId("interactionId") },
                new Object[] { "state",
                        TransactionDraft.builder()
                                .state(com.commercetools.api.models.payment.TransactionState.findEnum("Initial")) },
                new Object[] { "custom",
                        TransactionDraft.builder()
                                .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "interfaceId", TransactionDraft.builder().interfaceId("interfaceId") } };
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

    @Test
    public void interfaceId() {
        TransactionDraft value = TransactionDraft.of();
        value.setInterfaceId("interfaceId");
        Assertions.assertThat(value.getInterfaceId()).isEqualTo("interfaceId");
    }
}
