
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetShippingMethodTaxCategoryChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetShippingMethodTaxCategoryChangeBuilder builder) {
        SetShippingMethodTaxCategoryChange setShippingMethodTaxCategoryChange = builder.buildUnchecked();
        Assertions.assertThat(setShippingMethodTaxCategoryChange)
                .isInstanceOf(SetShippingMethodTaxCategoryChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", SetShippingMethodTaxCategoryChange.builder().change("change") },
                new Object[] { "taxMode",
                        SetShippingMethodTaxCategoryChange.builder()
                                .taxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform")) },
                new Object[] { "previousValue",
                        SetShippingMethodTaxCategoryChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { "nextValue", SetShippingMethodTaxCategoryChange.builder()
                        .nextValue(new com.commercetools.history.models.common.ReferenceImpl()) } };
    }

    @Test
    public void change() {
        SetShippingMethodTaxCategoryChange value = SetShippingMethodTaxCategoryChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void taxMode() {
        SetShippingMethodTaxCategoryChange value = SetShippingMethodTaxCategoryChange.of();
        value.setTaxMode(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
        Assertions.assertThat(value.getTaxMode())
                .isEqualTo(com.commercetools.history.models.common.TaxMode.findEnum("Platform"));
    }

    @Test
    public void previousValue() {
        SetShippingMethodTaxCategoryChange value = SetShippingMethodTaxCategoryChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void nextValue() {
        SetShippingMethodTaxCategoryChange value = SetShippingMethodTaxCategoryChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }
}
