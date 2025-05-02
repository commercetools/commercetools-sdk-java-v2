
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetStateRolesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetStateRolesChangeBuilder builder) {
        SetStateRolesChange setStateRolesChange = builder.buildUnchecked();
        Assertions.assertThat(setStateRolesChange).isInstanceOf(SetStateRolesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetStateRolesChange.builder().change("change") },
                new Object[] { "previousValue", SetStateRolesChange.builder()
                        .previousValue(Collections.singletonList(com.commercetools.history.models.common.StateRoleEnum
                                .findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { "nextValue", SetStateRolesChange.builder()
                        .nextValue(Collections.singletonList(com.commercetools.history.models.common.StateRoleEnum
                                .findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void change() {
        SetStateRolesChange value = SetStateRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetStateRolesChange value = SetStateRolesChange.of();
        value.setPreviousValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }

    @Test
    public void nextValue() {
        SetStateRolesChange value = SetStateRolesChange.of();
        value.setNextValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }
}
