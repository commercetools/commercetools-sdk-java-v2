
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetImageLabelChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetImageLabelChangeBuilder builder) {
        SetImageLabelChange setImageLabelChange = builder.buildUnchecked();
        Assertions.assertThat(setImageLabelChange).isInstanceOf(SetImageLabelChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetImageLabelChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetImageLabelChange.builder()
                                .previousValue(new com.commercetools.history.models.common.ImageImpl()) },
                new Object[] { "nextValue",
                        SetImageLabelChange.builder()
                                .nextValue(new com.commercetools.history.models.common.ImageImpl()) },
                new Object[] { "catalogData", SetImageLabelChange.builder().catalogData("catalogData") } };
    }

    @Test
    public void change() {
        SetImageLabelChange value = SetImageLabelChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetImageLabelChange value = SetImageLabelChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.ImageImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.ImageImpl());
    }

    @Test
    public void nextValue() {
        SetImageLabelChange value = SetImageLabelChange.of();
        value.setNextValue(new com.commercetools.history.models.common.ImageImpl());
        Assertions.assertThat(value.getNextValue()).isEqualTo(new com.commercetools.history.models.common.ImageImpl());
    }

    @Test
    public void catalogData() {
        SetImageLabelChange value = SetImageLabelChange.of();
        value.setCatalogData("catalogData");
        Assertions.assertThat(value.getCatalogData()).isEqualTo("catalogData");
    }
}
