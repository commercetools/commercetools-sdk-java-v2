
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemovePriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemovePriceChangeBuilder builder) {
        RemovePriceChange removePriceChange = builder.buildUnchecked();
        Assertions.assertThat(removePriceChange).isInstanceOf(RemovePriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemovePriceChange.builder().change("change") },
                new Object[] { "previousValue",
                        RemovePriceChange.builder()
                                .previousValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { "nextValue",
                        RemovePriceChange.builder()
                                .nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { "catalogData", RemovePriceChange.builder().catalogData("catalogData") },
                new Object[] { "priceId", RemovePriceChange.builder().priceId("priceId") } };
    }

    @Test
    public void change() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void nextValue() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void catalogData() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void priceId() {
        RemovePriceChange value = RemovePriceChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }
}
