
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeFieldDefinitionOrderChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeFieldDefinitionOrderChangeBuilder builder) {
        ChangeFieldDefinitionOrderChange changeFieldDefinitionOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeFieldDefinitionOrderChange).isInstanceOf(ChangeFieldDefinitionOrderChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeFieldDefinitionOrderChange.builder().change("change") },
                new Object[] { "previousValue", ChangeFieldDefinitionOrderChange.builder()
                        .previousValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl())) },
                new Object[] { "nextValue", ChangeFieldDefinitionOrderChange.builder()
                        .nextValue(Collections.singletonList(
                            new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl())) } };
    }

    @Test
    public void change() {
        ChangeFieldDefinitionOrderChange value = ChangeFieldDefinitionOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeFieldDefinitionOrderChange value = ChangeFieldDefinitionOrderChange.of();
        value.setPreviousValue(Collections
                .singletonList(new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeFieldDefinitionOrderChange value = ChangeFieldDefinitionOrderChange.of();
        value.setNextValue(Collections
                .singletonList(new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.history.models.change_value.FieldDefinitionOrderValueImpl()));
    }
}
