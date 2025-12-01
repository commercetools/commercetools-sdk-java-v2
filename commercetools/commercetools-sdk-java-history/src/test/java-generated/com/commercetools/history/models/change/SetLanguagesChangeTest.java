
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetLanguagesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetLanguagesChangeBuilder builder) {
        SetLanguagesChange setLanguagesChange = builder.buildUnchecked();
        Assertions.assertThat(setLanguagesChange).isInstanceOf(SetLanguagesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetLanguagesChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetLanguagesChange.builder().previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue",
                        SetLanguagesChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { "addedItems",
                        SetLanguagesChange.builder().addedItems(Collections.singletonList("addedItems")) },
                new Object[] { "removedItems",
                        SetLanguagesChange.builder().removedItems(Collections.singletonList("removedItems")) } };
    }

    @Test
    public void change() {
        SetLanguagesChange value = SetLanguagesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetLanguagesChange value = SetLanguagesChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        SetLanguagesChange value = SetLanguagesChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void addedItems() {
        SetLanguagesChange value = SetLanguagesChange.of();
        value.setAddedItems(Collections.singletonList("addedItems"));
        Assertions.assertThat(value.getAddedItems()).isEqualTo(Collections.singletonList("addedItems"));
    }

    @Test
    public void removedItems() {
        SetLanguagesChange value = SetLanguagesChange.of();
        value.setRemovedItems(Collections.singletonList("removedItems"));
        Assertions.assertThat(value.getRemovedItems()).isEqualTo(Collections.singletonList("removedItems"));
    }
}
