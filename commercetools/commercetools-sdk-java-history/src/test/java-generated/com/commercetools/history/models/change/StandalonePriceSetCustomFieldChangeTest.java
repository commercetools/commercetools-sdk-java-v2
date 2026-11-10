
package com.commercetools.history.models.change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetCustomFieldChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetCustomFieldChangeBuilder builder) {
        StandalonePriceSetCustomFieldChange standalonePriceSetCustomFieldChange = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetCustomFieldChange)
                .isInstanceOf(StandalonePriceSetCustomFieldChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "change", StandalonePriceSetCustomFieldChange.builder().change("change") },
                new Object[] { "name", StandalonePriceSetCustomFieldChange.builder().name("name") },
                new Object[] { "customTypeId",
                        StandalonePriceSetCustomFieldChange.builder().customTypeId("customTypeId") },
                new Object[] { "previousValue",
                        StandalonePriceSetCustomFieldChange.builder().previousValue("previousValue") },
                new Object[] { "nextValue", StandalonePriceSetCustomFieldChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        StandalonePriceSetCustomFieldChange value = StandalonePriceSetCustomFieldChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void name() {
        StandalonePriceSetCustomFieldChange value = StandalonePriceSetCustomFieldChange.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void customTypeId() {
        StandalonePriceSetCustomFieldChange value = StandalonePriceSetCustomFieldChange.of();
        value.setCustomTypeId("customTypeId");
        Assertions.assertThat(value.getCustomTypeId()).isEqualTo("customTypeId");
    }

    @Test
    public void previousValue() {
        StandalonePriceSetCustomFieldChange value = StandalonePriceSetCustomFieldChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        StandalonePriceSetCustomFieldChange value = StandalonePriceSetCustomFieldChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
