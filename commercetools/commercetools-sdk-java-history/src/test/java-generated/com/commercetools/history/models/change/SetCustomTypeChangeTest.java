
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomTypeChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomTypeChangeBuilder builder) {
        SetCustomTypeChange setCustomTypeChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomTypeChange).isInstanceOf(SetCustomTypeChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomTypeChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetCustomTypeChange.builder()
                                .previousValue(new com.commercetools.history.models.common.CustomFieldsImpl()) },
                new Object[] { "nextValue", SetCustomTypeChange.builder()
                        .nextValue(new com.commercetools.history.models.common.CustomFieldsImpl()) } };
    }

    @Test
    public void change() {
        SetCustomTypeChange value = SetCustomTypeChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomTypeChange value = SetCustomTypeChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }

    @Test
    public void nextValue() {
        SetCustomTypeChange value = SetCustomTypeChange.of();
        value.setNextValue(new com.commercetools.history.models.common.CustomFieldsImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.CustomFieldsImpl());
    }
}
