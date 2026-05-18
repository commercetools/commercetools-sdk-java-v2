
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetProductAttributeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetProductAttributeChangeBuilder builder) {
        SetProductAttributeChange setProductAttributeChange = builder.buildUnchecked();
        Assertions.assertThat(setProductAttributeChange).isInstanceOf(SetProductAttributeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetProductAttributeChange.builder().change("change") },
                new Object[] { "catalogData", SetProductAttributeChange.builder().catalogData("catalogData") },
                new Object[] { "previousValue",
                        SetProductAttributeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.AttributeImpl()) },
                new Object[] { "nextValue", SetProductAttributeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.AttributeImpl()) } };
    }

    @Test
    public void change() {
        SetProductAttributeChange value = SetProductAttributeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void catalogData() {
        SetProductAttributeChange value = SetProductAttributeChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }

    @Test
    public void previousValue() {
        SetProductAttributeChange value = SetProductAttributeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AttributeImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributeImpl());
    }

    @Test
    public void nextValue() {
        SetProductAttributeChange value = SetProductAttributeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AttributeImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributeImpl());
    }
}
