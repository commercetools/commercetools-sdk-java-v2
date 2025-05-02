
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeEnumValueOrderChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeEnumValueOrderChangeBuilder builder) {
        ChangeEnumValueOrderChange changeEnumValueOrderChange = builder.buildUnchecked();
        Assertions.assertThat(changeEnumValueOrderChange).isInstanceOf(ChangeEnumValueOrderChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeEnumValueOrderChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeEnumValueOrderChange.builder()
                                .previousValue(Collections.singletonList(
                                    new com.commercetools.history.models.change_value.EnumValueImpl())) },
                new Object[] { "nextValue",
                        ChangeEnumValueOrderChange.builder()
                                .nextValue(Collections.singletonList(
                                    new com.commercetools.history.models.change_value.EnumValueImpl())) },
                new Object[] { "fieldName", ChangeEnumValueOrderChange.builder().fieldName("fieldName") } };
    }

    @Test
    public void change() {
        ChangeEnumValueOrderChange value = ChangeEnumValueOrderChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeEnumValueOrderChange value = ChangeEnumValueOrderChange.of();
        value.setPreviousValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
    }

    @Test
    public void nextValue() {
        ChangeEnumValueOrderChange value = ChangeEnumValueOrderChange.of();
        value.setNextValue(
            Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.history.models.change_value.EnumValueImpl()));
    }

    @Test
    public void fieldName() {
        ChangeEnumValueOrderChange value = ChangeEnumValueOrderChange.of();
        value.setFieldName("fieldName");
        Assertions.assertThat(value.getFieldName()).isEqualTo("fieldName");
    }
}
