
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetPermissionsChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetPermissionsChangeBuilder builder) {
        SetPermissionsChange setPermissionsChange = builder.buildUnchecked();
        Assertions.assertThat(setPermissionsChange).isInstanceOf(SetPermissionsChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetPermissionsChange.builder().change("change") },
                new Object[] { "previousValue",
                        SetPermissionsChange.builder()
                                .previousValue(Collections.singletonList(
                                    com.commercetools.history.models.common.Permission.findEnum("AddChildUnits"))) },
                new Object[] { "nextValue",
                        SetPermissionsChange.builder()
                                .nextValue(Collections.singletonList(
                                    com.commercetools.history.models.common.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void change() {
        SetPermissionsChange value = SetPermissionsChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetPermissionsChange value = SetPermissionsChange.of();
        value.setPreviousValue(
            Collections.singletonList(com.commercetools.history.models.common.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections
                        .singletonList(com.commercetools.history.models.common.Permission.findEnum("AddChildUnits")));
    }

    @Test
    public void nextValue() {
        SetPermissionsChange value = SetPermissionsChange.of();
        value.setNextValue(
            Collections.singletonList(com.commercetools.history.models.common.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections
                        .singletonList(com.commercetools.history.models.common.Permission.findEnum("AddChildUnits")));
    }
}
