
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveStateRolesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveStateRolesChangeBuilder builder) {
        RemoveStateRolesChange removeStateRolesChange = builder.buildUnchecked();
        Assertions.assertThat(removeStateRolesChange).isInstanceOf(RemoveStateRolesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveStateRolesChange.builder().change("change") },
                new Object[] { "previousValue", RemoveStateRolesChange.builder()
                        .previousValue(Collections.singletonList(com.commercetools.history.models.common.StateRoleEnum
                                .findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { "nextValue", RemoveStateRolesChange.builder()
                        .nextValue(Collections.singletonList(com.commercetools.history.models.common.StateRoleEnum
                                .findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void change() {
        RemoveStateRolesChange value = RemoveStateRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveStateRolesChange value = RemoveStateRolesChange.of();
        value.setPreviousValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }

    @Test
    public void nextValue() {
        RemoveStateRolesChange value = RemoveStateRolesChange.of();
        value.setNextValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }
}
