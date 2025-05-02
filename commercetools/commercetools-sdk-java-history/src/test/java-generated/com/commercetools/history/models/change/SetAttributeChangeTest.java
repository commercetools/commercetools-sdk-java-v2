
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetAttributeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetAttributeChangeBuilder builder) {
        SetAttributeChange setAttributeChange = builder.buildUnchecked();
        Assertions.assertThat(setAttributeChange).isInstanceOf(SetAttributeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetAttributeChange.builder().change("change") },
                new Object[] { "previousValue", SetAttributeChange.builder()
                        .previousValue(new com.commercetools.history.models.change_value.AttributeValueImpl()) },
                new Object[] { "nextValue",
                        SetAttributeChange.builder()
                                .nextValue(new com.commercetools.history.models.change_value.AttributeValueImpl()) },
                new Object[] { "catalogData", SetAttributeChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetAttributeChange value = SetAttributeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetAttributeChange value = SetAttributeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.AttributeValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.AttributeValueImpl());
    }

    @Test
    public void nextValue() {
        SetAttributeChange value = SetAttributeChange.of();
        value.setNextValue(new com.commercetools.history.models.change_value.AttributeValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.change_value.AttributeValueImpl());
    }

    @Test
    public void catalogData() {
        SetAttributeChange value = SetAttributeChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
