
package com.commercetools.api.models.shopping_list;

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
public class TextLineItemTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TextLineItemBuilder builder) {
        TextLineItem textLineItem = builder.buildUnchecked();
        Assertions.assertThat(textLineItem).isInstanceOf(TextLineItem.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { TextLineItem.builder().addedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        TextLineItem.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { TextLineItem.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { TextLineItem.builder().id("id") }, new Object[] { TextLineItem.builder().key("key") },
                new Object[] {
                        TextLineItem.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { TextLineItem.builder().quantity(8L) } };
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
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void description() {
        TextLineItem value = TextLineItem.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
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
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void quantity() {
        TextLineItem value = TextLineItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
