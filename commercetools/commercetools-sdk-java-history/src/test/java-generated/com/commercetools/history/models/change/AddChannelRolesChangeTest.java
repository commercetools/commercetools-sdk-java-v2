
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddChannelRolesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddChannelRolesChangeBuilder builder) {
        AddChannelRolesChange addChannelRolesChange = builder.buildUnchecked();
        Assertions.assertThat(addChannelRolesChange).isInstanceOf(AddChannelRolesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", AddChannelRolesChange.builder().change("change") },
                new Object[] { "previousValue", AddChannelRolesChange.builder()
                        .previousValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply"))) },
                new Object[] { "nextValue", AddChannelRolesChange.builder()
                        .nextValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply"))) } };
    }

    @Test
    public void change() {
        AddChannelRolesChange value = AddChannelRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        AddChannelRolesChange value = AddChannelRolesChange.of();
        value.setPreviousValue(Collections
                .singletonList(com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
    }

    @Test
    public void nextValue() {
        AddChannelRolesChange value = AddChannelRolesChange.of();
        value.setNextValue(Collections
                .singletonList(com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
    }
}
