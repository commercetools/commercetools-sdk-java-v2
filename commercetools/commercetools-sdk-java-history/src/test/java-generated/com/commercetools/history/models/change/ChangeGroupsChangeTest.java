
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
                        ChangeGroupsChange.builder().nextValue(Collections.singletonList("nextValue")) } };
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
}
