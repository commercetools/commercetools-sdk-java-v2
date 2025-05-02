
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddStateRolesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddStateRolesChangeBuilder builder) {
        AddStateRolesChange addStateRolesChange = builder.buildUnchecked();
        Assertions.assertThat(addStateRolesChange).isInstanceOf(AddStateRolesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddStateRolesChange.builder().change("change") },
                new Object[] { "previousValue", AddStateRolesChange.builder()
                        .previousValue(Collections.singletonList(com.commercetools.history.models.common.StateRoleEnum
                                .findEnum("ReviewIncludedInStatistics"))) },
                new Object[] { "nextValue", AddStateRolesChange.builder()
                        .nextValue(Collections.singletonList(com.commercetools.history.models.common.StateRoleEnum
                                .findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void change() {
        AddStateRolesChange value = AddStateRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddStateRolesChange value = AddStateRolesChange.of();
        value.setPreviousValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }

    @Test
    public void nextValue() {
        AddStateRolesChange value = AddStateRolesChange.of();
        value.setNextValue(Collections.singletonList(
            com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }
}
