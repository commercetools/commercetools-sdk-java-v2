
package com.commercetools.history.models.common;

import java.time.ZonedDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TextLineItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, TextLineItemBuilder builder) {
        TextLineItem textLineItem = builder.buildUnchecked();
        Assertions.assertThat(textLineItem).isInstanceOf(TextLineItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "addedAt", TextLineItem.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "custom",
                        TextLineItem.builder().custom(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "description",
                        TextLineItem.builder()
                                .description(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "id", TextLineItem.builder().id("id") },
                new Object[] { "key", TextLineItem.builder().key("key") },
                new Object[] { "name",
                        TextLineItem.builder()
                                .name(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "quantity", TextLineItem.builder().quantity(8L) } };
    }

    @Test
    public void addedAt() {
        TextLineItem value = TextLineItem.of();
        value.setAddedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getAddedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void custom() {
        TextLineItem value = TextLineItem.of();
        value.setCustom(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void description() {
        TextLineItem value = TextLineItem.of();
        value.setDescription(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void id() {
        TextLineItem value = TextLineItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        TextLineItem value = TextLineItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        TextLineItem value = TextLineItem.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void quantity() {
        TextLineItem value = TextLineItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
