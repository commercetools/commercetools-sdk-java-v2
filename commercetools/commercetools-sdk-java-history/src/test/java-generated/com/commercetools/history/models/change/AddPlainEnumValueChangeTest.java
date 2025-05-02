
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddPlainEnumValueChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddPlainEnumValueChangeBuilder builder) {
        AddPlainEnumValueChange addPlainEnumValueChange = builder.buildUnchecked();
        Assertions.assertThat(addPlainEnumValueChange).isInstanceOf(AddPlainEnumValueChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddPlainEnumValueChange.builder().change("change") },
                new Object[] { "nextValue",
                        AddPlainEnumValueChange.builder()
                                .nextValue(new com.commercetools.history.models.common.AttributePlainEnumValueImpl()) },
                new Object[] { "attributeName", AddPlainEnumValueChange.builder().attributeName("attributeName") } };
    }

    @Test
    public void change() {
        AddPlainEnumValueChange value = AddPlainEnumValueChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddPlainEnumValueChange value = AddPlainEnumValueChange.of();
        value.setNextValue(new com.commercetools.history.models.common.AttributePlainEnumValueImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.AttributePlainEnumValueImpl());
    }

    @Test
    public void attributeName() {
        AddPlainEnumValueChange value = AddPlainEnumValueChange.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }
}
