
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveLocalizedEnumValuesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveLocalizedEnumValuesChangeBuilder builder) {
        RemoveLocalizedEnumValuesChange removeLocalizedEnumValuesChange = builder.buildUnchecked();
        Assertions.assertThat(removeLocalizedEnumValuesChange).isInstanceOf(RemoveLocalizedEnumValuesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveLocalizedEnumValuesChange.builder().change("change") },
                new Object[] { "previousValue", RemoveLocalizedEnumValuesChange.builder()
                        .previousValue(new com.commercetools.history.models.change_value.LocalizedEnumValueImpl()) },
                new Object[] { "attributeName",
                        RemoveLocalizedEnumValuesChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        RemoveLocalizedEnumValuesChange value = RemoveLocalizedEnumValuesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveLocalizedEnumValuesChange value = RemoveLocalizedEnumValuesChange.of();
        value.setPreviousValue(new com.commercetools.history.models.change_value.LocalizedEnumValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.change_value.LocalizedEnumValueImpl());
    }

    @Test
    public void attributeName() {
        RemoveLocalizedEnumValuesChange value = RemoveLocalizedEnumValuesChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
