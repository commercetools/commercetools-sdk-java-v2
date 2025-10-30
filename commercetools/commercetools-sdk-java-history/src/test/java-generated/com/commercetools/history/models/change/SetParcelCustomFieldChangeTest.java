
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetParcelCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetParcelCustomFieldChangeBuilder builder) {
        SetParcelCustomFieldChange setParcelCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(setParcelCustomFieldChange).isInstanceOf(SetParcelCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetParcelCustomFieldChange.builder().change("change") },
                new Object[] { "parcel",
                        SetParcelCustomFieldChange.builder()
                                .parcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl()) },
                new Object[] { "customTypeId", SetParcelCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "name", SetParcelCustomFieldChange.builder().name("name") },
                new Object[] { "previousValue", SetParcelCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", SetParcelCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetParcelCustomFieldChange value = SetParcelCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void parcel() {
        SetParcelCustomFieldChange value = SetParcelCustomFieldChange.of();
        value.setParcel(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
        Assertions.assertThat(value.getParcel())
                .isEqualTo(new com.commercetools.history.models.change_value.ParcelChangeValueImpl());
    }

    @Test
    public void customTypeId() {
        SetParcelCustomFieldChange value = SetParcelCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void name() {
        SetParcelCustomFieldChange value = SetParcelCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void previousValue() {
        SetParcelCustomFieldChange value = SetParcelCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetParcelCustomFieldChange value = SetParcelCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
