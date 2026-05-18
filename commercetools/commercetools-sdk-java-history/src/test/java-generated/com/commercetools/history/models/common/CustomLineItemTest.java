
package com.commercetools.history.models.common;

import java.util.Collections;

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
                new Object[] { "key", CustomLineItem.builder().key("key") },
                new Object[] { "name",
                        CustomLineItem.builder()
                                .name(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { "money",
                        CustomLineItem.builder().money(new com.commercetools.history.models.common.TypedMoneyImpl()) },
                new Object[] { "taxedPrice",
                        CustomLineItem.builder()
                                .taxedPrice(new com.commercetools.history.models.common.TaxedItemPriceImpl()) },
                new Object[] { "taxedPricePortions",
                        CustomLineItem.builder()
                                .taxedPricePortions(Collections.singletonList(
                                    new com.commercetools.history.models.common.MethodTaxedPriceImpl())) },
                new Object[] { "totalPrice",
                        CustomLineItem.builder()
                                .totalPrice(new com.commercetools.history.models.common.CentPrecisionMoneyImpl()) },
                new Object[] { "slug", CustomLineItem.builder().slug("slug") },
                new Object[] { "quantity", CustomLineItem.builder().quantity(8L) },
                new Object[] { "state",
                        CustomLineItem.builder()
                                .state(Collections
                                        .singletonList(new com.commercetools.history.models.common.ItemStateImpl())) },
                new Object[] { "taxCategory",
                        CustomLineItem.builder()
                                .taxCategory(new com.commercetools.history.models.common.TaxCategoryReferenceImpl()) },
                new Object[] { "taxRate",
                        CustomLineItem.builder().taxRate(new com.commercetools.history.models.common.TaxRateImpl()) },
                new Object[] { "perMethodTaxRate",
                        CustomLineItem.builder()
                                .perMethodTaxRate(Collections.singletonList(
                                    new com.commercetools.history.models.common.MethodTaxRateImpl())) },
                new Object[] { "discountedPricePerQuantity", CustomLineItem.builder()
                        .discountedPricePerQuantity(Collections.singletonList(
                            new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl())) },
                new Object[] { "custom",
                        CustomLineItem.builder()
                                .custom(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "shippingDetails", CustomLineItem.builder()
                        .shippingDetails(new com.commercetools.history.models.common.ItemShippingDetailsImpl()) },
                new Object[] { "priceMode",
                        CustomLineItem.builder()
                                .priceMode(com.commercetools.history.models.common.CustomLineItemPriceMode
                                        .findEnum("Standard")) },
                new Object[] { "recurrenceInfo",
                        CustomLineItem.builder()
                                .recurrenceInfo(
                                    new com.commercetools.history.models.common.CustomLineItemRecurrenceInfoImpl()) } };
    }

    @Test
    public void id() {
        CustomLineItem value = CustomLineItem.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        CustomLineItem value = CustomLineItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
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
        value.setMoney(new com.commercetools.history.models.common.TypedMoneyImpl());
        Assertions.assertThat(value.getMoney()).isEqualTo(new com.commercetools.history.models.common.TypedMoneyImpl());
    }

    @Test
    public void taxedPrice() {
        CustomLineItem value = CustomLineItem.of();
        value.setTaxedPrice(new com.commercetools.history.models.common.TaxedItemPriceImpl());
        Assertions.assertThat(value.getTaxedPrice())
                .isEqualTo(new com.commercetools.history.models.common.TaxedItemPriceImpl());
    }

    @Test
    public void taxedPricePortions() {
        CustomLineItem value = CustomLineItem.of();
        value.setTaxedPricePortions(
            Collections.singletonList(new com.commercetools.history.models.common.MethodTaxedPriceImpl()));
        Assertions.assertThat(value.getTaxedPricePortions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.common.MethodTaxedPriceImpl()));
    }

    @Test
    public void totalPrice() {
        CustomLineItem value = CustomLineItem.of();
        value.setTotalPrice(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
        Assertions.assertThat(value.getTotalPrice())
                .isEqualTo(new com.commercetools.history.models.common.CentPrecisionMoneyImpl());
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
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }

    @Test
    public void state() {
        CustomLineItem value = CustomLineItem.of();
        value.setState(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
        Assertions.assertThat(value.getState())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.ItemStateImpl()));
    }

    @Test
    public void taxCategory() {
        CustomLineItem value = CustomLineItem.of();
        value.setTaxCategory(new com.commercetools.history.models.common.TaxCategoryReferenceImpl());
        Assertions.assertThat(value.getTaxCategory())
                .isEqualTo(new com.commercetools.history.models.common.TaxCategoryReferenceImpl());
    }

    @Test
    public void taxRate() {
        CustomLineItem value = CustomLineItem.of();
        value.setTaxRate(new com.commercetools.history.models.common.TaxRateImpl());
        Assertions.assertThat(value.getTaxRate()).isEqualTo(new com.commercetools.history.models.common.TaxRateImpl());
    }

    @Test
    public void perMethodTaxRate() {
        CustomLineItem value = CustomLineItem.of();
        value.setPerMethodTaxRate(
            Collections.singletonList(new com.commercetools.history.models.common.MethodTaxRateImpl()));
        Assertions.assertThat(value.getPerMethodTaxRate())
                .isEqualTo(Collections.singletonList(new com.commercetools.history.models.common.MethodTaxRateImpl()));
    }

    @Test
    public void discountedPricePerQuantity() {
        CustomLineItem value = CustomLineItem.of();
        value.setDiscountedPricePerQuantity(Collections
                .singletonList(new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl()));
        Assertions.assertThat(value.getDiscountedPricePerQuantity())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl()));
    }

    @Test
    public void custom() {
        CustomLineItem value = CustomLineItem.of();
        value.setCustom(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void shippingDetails() {
        CustomLineItem value = CustomLineItem.of();
        value.setShippingDetails(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
        Assertions.assertThat(value.getShippingDetails())
                .isEqualTo(new com.commercetools.history.models.common.ItemShippingDetailsImpl());
    }

    @Test
    public void priceMode() {
        CustomLineItem value = CustomLineItem.of();
        value.setPriceMode(com.commercetools.history.models.common.CustomLineItemPriceMode.findEnum("Standard"));
        Assertions.assertThat(value.getPriceMode())
                .isEqualTo(com.commercetools.history.models.common.CustomLineItemPriceMode.findEnum("Standard"));
    }

    @Test
    public void recurrenceInfo() {
        CustomLineItem value = CustomLineItem.of();
        value.setRecurrenceInfo(new com.commercetools.history.models.common.CustomLineItemRecurrenceInfoImpl());
        Assertions.assertThat(value.getRecurrenceInfo())
                .isEqualTo(new com.commercetools.history.models.common.CustomLineItemRecurrenceInfoImpl());
    }
}
