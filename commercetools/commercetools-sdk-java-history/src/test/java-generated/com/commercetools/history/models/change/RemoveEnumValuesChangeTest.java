
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveEnumValuesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveEnumValuesChangeBuilder builder) {
        RemoveEnumValuesChange removeEnumValuesChange = builder.buildUnchecked();
        Assertions.assertThat(removeEnumValuesChange).isInstanceOf(RemoveEnumValuesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveEnumValuesChange.builder().change("change") },
                new Object[] { "previousValue", RemoveEnumValuesChange.builder()
                        .previousValue(new com.commercetools.history.models.common.AttributePlainEnumValueImpl()) },
                new Object[] { "attributeName", RemoveEnumValuesChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        RemoveEnumValuesChange value = RemoveEnumValuesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveEnumValuesChange value = RemoveEnumValuesChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.AttributePlainEnumValueImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributePlainEnumValueImpl());
    }

    @Test
    public void attributeName() {
        RemoveEnumValuesChange value = RemoveEnumValuesChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
