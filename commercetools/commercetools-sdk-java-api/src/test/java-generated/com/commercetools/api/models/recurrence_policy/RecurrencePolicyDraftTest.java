
package com.commercetools.api.models.recurrence_policy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicyDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicyDraftBuilder builder) {
        RecurrencePolicyDraft recurrencePolicyDraft = builder.buildUnchecked();
        Assertions.assertThat(recurrencePolicyDraft).isInstanceOf(RecurrencePolicyDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", RecurrencePolicyDraft.builder().key("key") },
                new Object[] { "name",
                        RecurrencePolicyDraft.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        RecurrencePolicyDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "schedule", RecurrencePolicyDraft.builder()
                        .schedule(
                            new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftImpl()) } };
    }

    @Test
    public void key() {
        RecurrencePolicyDraft value = RecurrencePolicyDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        RecurrencePolicyDraft value = RecurrencePolicyDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        RecurrencePolicyDraft value = RecurrencePolicyDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void schedule() {
        RecurrencePolicyDraft value = RecurrencePolicyDraft.of();
        value.setSchedule(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftImpl());
        Assertions.assertThat(value.getSchedule())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftImpl());
    }
}
