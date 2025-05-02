
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetProductPriceCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetProductPriceCustomTypeChangeBuilder builder) {
        SetProductPriceCustomTypeChange setProductPriceCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setProductPriceCustomTypeChange).isInstanceOf(SetProductPriceCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetProductPriceCustomTypeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetProductPriceCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue",
                        SetProductPriceCustomTypeChange.builder()
                                .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "catalogData", SetProductPriceCustomTypeChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetProductPriceCustomTypeChange value = SetProductPriceCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetProductPriceCustomTypeChange value = SetProductPriceCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetProductPriceCustomTypeChange value = SetProductPriceCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void catalogData() {
        SetProductPriceCustomTypeChange value = SetProductPriceCustomTypeChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
