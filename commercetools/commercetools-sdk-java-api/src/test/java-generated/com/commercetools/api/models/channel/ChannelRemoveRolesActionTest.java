
package com.commercetools.api.models.channel;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelRemoveRolesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelRemoveRolesActionBuilder builder) {
        ChannelRemoveRolesAction channelRemoveRolesAction = builder.buildUnchecked();
        Assertions.assertThat(channelRemoveRolesAction).isInstanceOf(ChannelRemoveRolesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "roles",
                ChannelRemoveRolesAction.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"))) } };
    }

    @Test
    public void roles() {
        ChannelRemoveRolesAction value = ChannelRemoveRolesAction.of();
        value.setRoles(Collections
                .singletonList(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
    }
}
