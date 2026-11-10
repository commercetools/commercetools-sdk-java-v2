
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangePriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangePriceChangeBuilder builder) {
        ChangePriceChange changePriceChange = builder.buildUnchecked();
        Assertions.assertThat(changePriceChange).isInstanceOf(ChangePriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangePriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangePriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { "nextValue",
                        ChangePriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { "catalogData", ChangePriceChange.builder().catalogData("catalogData") },
                new Object[] { "priceId", ChangePriceChange.builder().priceId("priceId") },
                new Object[] { "variant", ChangePriceChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void nextValue() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void catalogData() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void priceId() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variant() {
        ChangePriceChange value = ChangePriceChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
