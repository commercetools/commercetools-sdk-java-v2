
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveFieldDefinitionChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveFieldDefinitionChangeBuilder builder) {
        RemoveFieldDefinitionChange removeFieldDefinitionChange = builder.buildUnchecked();
        Assertions.assertThat(removeFieldDefinitionChange).isInstanceOf(RemoveFieldDefinitionChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveFieldDefinitionChange.builder().change("change") },
                new Object[] { "previousValue", RemoveFieldDefinitionChange.builder()
                        .previousValue(new com.commercetools.history.models.common.FieldDefinitionImpl()) } };
    }

    @Test
    public void change() {
        RemoveFieldDefinitionChange value = RemoveFieldDefinitionChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveFieldDefinitionChange value = RemoveFieldDefinitionChange.of();
        value.setPreviousValue(new com.commercetools.history.models.common.FieldDefinitionImpl());
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(new com.commercetools.history.models.common.FieldDefinitionImpl());
    }
}
