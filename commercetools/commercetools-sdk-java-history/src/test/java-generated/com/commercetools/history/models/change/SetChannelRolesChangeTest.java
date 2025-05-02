
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SetChannelRolesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, SetChannelRolesChangeBuilder builder) {
        SetChannelRolesChange setChannelRolesChange = builder.buildUnchecked();
        Assertions.assertThat(setChannelRolesChange).isInstanceOf(SetChannelRolesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", SetChannelRolesChange.builder().change("change") },
                new Object[] { "previousValue", SetChannelRolesChange.builder()
                        .previousValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply"))) },
                new Object[] { "nextValue", SetChannelRolesChange.builder()
                        .nextValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply"))) } };
    }

    @Test
    public void change() {
        SetChannelRolesChange value = SetChannelRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetChannelRolesChange value = SetChannelRolesChange.of();
        value.setPreviousValue(Collections
                .singletonList(com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
    }

    @Test
    public void nextValue() {
        SetChannelRolesChange value = SetChannelRolesChange.of();
        value.setNextValue(Collections
                .singletonList(com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
    }
}
