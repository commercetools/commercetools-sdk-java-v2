
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetDiscountedPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetDiscountedPriceChangeBuilder builder) {
        SetDiscountedPriceChange setDiscountedPriceChange = builder.buildUnchecked();
        Assertions.assertThat(setDiscountedPriceChange).isInstanceOf(SetDiscountedPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetDiscountedPriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetDiscountedPriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.DiscountedPriceImpl()) },
                new Object[] { "nextValue",
                        SetDiscountedPriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.DiscountedPriceImpl()) },
                new Object[] { "catalogData", SetDiscountedPriceChange.builder().catalogData("catalogData") },
                new Object[] { "variant", SetDiscountedPriceChange.builder().variant("variant") },
                new Object[] { "priceId", SetDiscountedPriceChange.builder().priceId("priceId") },
                new Object[] { "price", SetDiscountedPriceChange.builder()
                        .price(new com.commercetools.history.models.common.PriceImpl()) } };
    }

    @Test
    public void change() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedPriceImpl());
    }

    @Test
    public void nextValue() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.DiscountedPriceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.DiscountedPriceImpl());
    }

    @Test
    public void catalogData() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void variant() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }

    @Test
    public void priceId() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void price() {
        SetDiscountedPriceChange value = SetDiscountedPriceChange.of();
        value.setPrice(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }
}
