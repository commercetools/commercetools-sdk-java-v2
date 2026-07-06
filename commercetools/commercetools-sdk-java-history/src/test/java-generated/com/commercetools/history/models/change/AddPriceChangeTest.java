
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddPriceChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddPriceChangeBuilder builder) {
        AddPriceChange addPriceChange = builder.buildUnchecked();
        Assertions.assertThat(addPriceChange).isInstanceOf(AddPriceChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddPriceChange.builder().change("change") },
                new Object[] { "nextValue",
                        AddPriceChange.builder().nextValue(new com.commercetools.history.models.common.PriceImpl()) },
                new Object[] { "catalogData", AddPriceChange.builder().catalogData("catalogData") },
                new Object[] { "priceId", AddPriceChange.builder().priceId("priceId") },
                new Object[] { "variant", AddPriceChange.builder().variant("variant") } };
    }

    @Test
    public void change() {
        AddPriceChange value = AddPriceChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddPriceChange value = AddPriceChange.of();
        value.setNextValue(new com.commercetools.history.models.common.PriceImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.PriceImpl());
    }

    @Test
    public void catalogData() {
        AddPriceChange value = AddPriceChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void priceId() {
        AddPriceChange value = AddPriceChange.of();
        value.setPriceId("priceId");
        Assertions.assertThat(value.getPriceId()).isEqualTo("priceId");
    }

    @Test
    public void variant() {
        AddPriceChange value = AddPriceChange.of();
        value.setVariant("variant");
        Assertions.assertThat(value.getVariant()).isEqualTo("variant");
    }
}
