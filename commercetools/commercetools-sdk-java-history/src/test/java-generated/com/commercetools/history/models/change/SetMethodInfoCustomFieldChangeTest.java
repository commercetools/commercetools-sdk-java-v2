
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetMethodInfoCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetMethodInfoCustomFieldChangeBuilder builder) {
        SetMethodInfoCustomFieldChange setMethodInfoCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setMethodInfoCustomFieldChange).isInstanceOf(SetMethodInfoCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetMethodInfoCustomFieldChange.builder().change("change") },
                new Object[] { "name", SetMethodInfoCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId", SetMethodInfoCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        SetMethodInfoCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetMethodInfoCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetMethodInfoCustomFieldChange value = SetMethodInfoCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void name() {
        SetMethodInfoCustomFieldChange value = SetMethodInfoCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetMethodInfoCustomFieldChange value = SetMethodInfoCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        SetMethodInfoCustomFieldChange value = SetMethodInfoCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetMethodInfoCustomFieldChange value = SetMethodInfoCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
