
package com.commercetools.api.models.recurrence_policy;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecurrencePolicyTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RecurrencePolicyBuilder builder) {
        RecurrencePolicy recurrencePolicy = builder.buildUnchecked();
        Assertions.assertThat(recurrencePolicy).isInstanceOf(RecurrencePolicy.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", RecurrencePolicy.builder().id("id") },
                new Object[] { "version", RecurrencePolicy.builder().version(2L) },
                new Object[] { "key", RecurrencePolicy.builder().key("key") },
                new Object[] { "name",
                        RecurrencePolicy.builder()
                                .name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        RecurrencePolicy.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "schedule", RecurrencePolicy.builder()
                        .schedule(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl()) },
                new Object[] { "createdAt",
                        RecurrencePolicy.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "createdBy",
                        RecurrencePolicy.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "lastModifiedAt",
                        RecurrencePolicy.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy", RecurrencePolicy.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) } };
    }

    @Test
    public void id() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void key() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void schedule() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setSchedule(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
        Assertions.assertThat(value.getSchedule())
                .isEqualTo(new com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleImpl());
    }

    @Test
    public void createdAt() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdBy() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void lastModifiedAt() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        RecurrencePolicy value = RecurrencePolicy.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }
}
