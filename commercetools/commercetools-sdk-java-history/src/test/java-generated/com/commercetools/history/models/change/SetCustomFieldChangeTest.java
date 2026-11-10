
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetCustomFieldChangeBuilder builder) {
        SetCustomFieldChange setCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setCustomFieldChange).isInstanceOf(SetCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetCustomFieldChange.builder().change("change") },
                new Object[] { "previousValue", SetCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetCustomFieldChange.builder().nextValue("nextValue") },
                new Object[] { "name", SetCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId", SetCustomFieldChange.builder().customTypeId("customTypeId") } };
    }

    @Test
    public void change() {
        SetCustomFieldChange value = SetCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetCustomFieldChange value = SetCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetCustomFieldChange value = SetCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }

    @Test
    public void name() {
        SetCustomFieldChange value = SetCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        SetCustomFieldChange value = SetCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }
}
