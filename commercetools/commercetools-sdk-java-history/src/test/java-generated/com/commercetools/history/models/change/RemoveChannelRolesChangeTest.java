
package com.commercetools.history.models.change;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveChannelRolesChangeTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveChannelRolesChangeBuilder builder) {
        RemoveChannelRolesChange removeChannelRolesChange = builder.buildUnchecked();
        Assertions.assertThat(removeChannelRolesChange).isInstanceOf(RemoveChannelRolesChange.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "change", RemoveChannelRolesChange.builder().change("change") },
                new Object[] { "previousValue", RemoveChannelRolesChange.builder()
                        .previousValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply"))) },
                new Object[] { "nextValue", RemoveChannelRolesChange.builder()
                        .nextValue(Collections.singletonList(
                            com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply"))) } };
    }

    @Test
    public void change() {
        RemoveChannelRolesChange value = RemoveChannelRolesChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        RemoveChannelRolesChange value = RemoveChannelRolesChange.of();
        value.setPreviousValue(Collections
                .singletonList(com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getPreviousValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
    }

    @Test
    public void nextValue() {
        RemoveChannelRolesChange value = RemoveChannelRolesChange.of();
        value.setNextValue(Collections
                .singletonList(com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getNextValue())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.history.models.common.ChannelRoleEnum.findEnum("InventorySupply")));
    }
}
