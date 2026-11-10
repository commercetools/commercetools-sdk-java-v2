
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddFieldDefinitionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddFieldDefinitionChangeBuilder builder) {
        AddFieldDefinitionChange addFieldDefinitionChange = builder.buildUnchecked();
        Assertions.assertThat(addFieldDefinitionChange).isInstanceOf(AddFieldDefinitionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddFieldDefinitionChange.builder().change("change") },
                new Object[] { "nextValue", AddFieldDefinitionChange.builder()
                        .nextValue(new com.commercetools.history.models.common.FieldDefinitionImpl()) } };
    }

    @Test
    public void change() {
        AddFieldDefinitionChange value = AddFieldDefinitionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void nextValue() {
        AddFieldDefinitionChange value = AddFieldDefinitionChange.of();
        value.setNextValue(new com.commercetools.history.models.common.FieldDefinitionImpl());
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(new com.commercetools.history.models.common.FieldDefinitionImpl());
    }
}
