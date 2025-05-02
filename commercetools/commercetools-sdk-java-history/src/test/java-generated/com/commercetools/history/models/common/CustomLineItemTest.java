
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomLineItemTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomLineItemBuilder builder) {
        CustomLineItem customLineItem = builder.buildUnchecked();
        Assertions.assertThat(customLineItem).isInstanceOf(CustomLineItem.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", CustomLineItem.builder().id("id") },
                new Object[] { "name",
                        CustomLineItem.builder()
                                .name(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "money",
                        CustomLineItem.builder().money(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "taxedPrice",
                        CustomLineItem.builder()
                                .taxedPrice(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { "totalPrice",
                        CustomLineItem.builder().totalPrice(new com.commercetools.history.models.common.MoneyImpl()) },
                new Object[] { "slug", CustomLineItem.builder().slug("slug") },
                new Object[] { "quantity", CustomLineItem.builder().quantity(8) } };
    }

    @Test
    public void id() {
        CustomLineItem value = CustomLineItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        CustomLineItem value = CustomLineItem.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void money() {
        CustomLineItem value = CustomLineItem.of();
        value.setMoney(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void taxedPrice() {
        CustomLineItem value = CustomLineItem.of();
        value.setTaxedPrice(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }

    @Test
    public void totalPrice() {
        CustomLineItem value = CustomLineItem.of();
        value.setTotalPrice(new com.commercetools.history.models.common.MoneyImpl());
        Assertions.assertThat(value.getTotalPrice()).isEqualTo(new com.commercetools.history.models.common.MoneyImpl());
    }

    @Test
    public void slug() {
        CustomLineItem value = CustomLineItem.of();
        value.setSlug("slug");
        Assertions.assertThat(value.getSlug()).isEqualTo("slug");
    }

    @Test
    public void quantity() {
        CustomLineItem value = CustomLineItem.of();
        value.setQuantity(8);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8);
    }
}
