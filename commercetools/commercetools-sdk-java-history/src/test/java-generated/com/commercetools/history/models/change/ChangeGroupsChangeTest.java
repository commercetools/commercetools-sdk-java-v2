
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChangeGroupsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChangeGroupsChangeBuilder builder) {
        ChangeGroupsChange changeGroupsChange = builder.buildUnchecked();
        Assertions.assertThat(changeGroupsChange).isInstanceOf(ChangeGroupsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", ChangeGroupsChange.builder().change("change") },
                new Object[] { "previousValue",
                        ChangeGroupsChange.builder().previousValue(Collections.singletonList("previousValue")) },
                new Object[] { "nextValue",
                        ChangeGroupsChange.builder().nextValue(Collections.singletonList("nextValue")) },
                new Object[] { "addedItems",
                        ChangeGroupsChange.builder().addedItems(Collections.singletonList("addedItems")) },
                new Object[] { "removedItems",
                        ChangeGroupsChange.builder().removedItems(Collections.singletonList("removedItems")) } };
    }

    @Test
    public void change() {
        ChangeGroupsChange value = ChangeGroupsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        ChangeGroupsChange value = ChangeGroupsChange.of();
        value.setPreviousValue(Collections.singletonList("previousValue"));
        Assertions.assertThat(value.getPreviousValue()).isEqualTo(Collections.singletonList("previousValue"));
    }

    @Test
    public void nextValue() {
        ChangeGroupsChange value = ChangeGroupsChange.of();
        value.setNextValue(Collections.singletonList("nextValue"));
        Assertions.assertThat(value.getNextValue()).isEqualTo(Collections.singletonList("nextValue"));
    }

    @Test
    public void addedItems() {
        ChangeGroupsChange value = ChangeGroupsChange.of();
        value.setAddedItems(Collections.singletonList("addedItems"));
        Assertions.assertThat(value.getAddedItems()).isEqualTo(Collections.singletonList("addedItems"));
    }

    @Test
    public void removedItems() {
        ChangeGroupsChange value = ChangeGroupsChange.of();
        value.setRemovedItems(Collections.singletonList("removedItems"));
        Assertions.assertThat(value.getRemovedItems()).isEqualTo(Collections.singletonList("removedItems"));
    }
}
