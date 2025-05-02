
package com.commercetools.api.models.me;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyTransactionDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyTransactionDraftBuilder builder) {
        MyTransactionDraft myTransactionDraft = builder.buildUnchecked();
        Assertions.assertThat(myTransactionDraft).isInstanceOf(MyTransactionDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "timestamp",
                        MyTransactionDraft.builder().timestamp(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "type",
                        MyTransactionDraft.builder()
                                .type(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization")) },
                new Object[] { "amount",
                        MyTransactionDraft.builder().amount(new com.commercetools.api.models.common.MoneyImpl()) },
                new Object[] { "interactionId", MyTransactionDraft.builder().interactionId("interactionId") },
                new Object[] { "custom", MyTransactionDraft.builder()
                        .custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) } };
    }

    @Test
    public void timestamp() {
        MyTransactionDraft value = MyTransactionDraft.of();
        value.setTimestamp(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getTimestamp()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void type() {
        MyTransactionDraft value = MyTransactionDraft.of();
        value.setType(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.payment.TransactionType.findEnum("Authorization"));
    }

    @Test
    public void amount() {
        MyTransactionDraft value = MyTransactionDraft.of();
        value.setAmount(new com.commercetools.api.models.common.MoneyImpl());
        Assertions.assertThat(value.getAmount()).isEqualTo(new com.commercetools.api.models.common.MoneyImpl());
    }

    @Test
    public void interactionId() {
        MyTransactionDraft value = MyTransactionDraft.of();
        value.setInteractionId("interactionId");
        Assertions.assertThat(value.getInteractionId()).isEqualTo("interactionId");
    }

    @Test
    public void custom() {
        MyTransactionDraft value = MyTransactionDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }
}
