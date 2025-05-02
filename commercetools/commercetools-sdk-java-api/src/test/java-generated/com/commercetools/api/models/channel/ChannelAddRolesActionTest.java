
package com.commercetools.api.models.channel;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelAddRolesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelAddRolesActionBuilder builder) {
        ChannelAddRolesAction channelAddRolesAction = builder.buildUnchecked();
        Assertions.assertThat(channelAddRolesAction).isInstanceOf(ChannelAddRolesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "roles",
                ChannelAddRolesAction.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"))) } };
    }

    @Test
    public void roles() {
        ChannelAddRolesAction value = ChannelAddRolesAction.of();
        value.setRoles(Collections
                .singletonList(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
    }
}
