
package com.commercetools.api.models.channel;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelSetRolesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelSetRolesActionBuilder builder) {
        ChannelSetRolesAction channelSetRolesAction = builder.buildUnchecked();
        Assertions.assertThat(channelSetRolesAction).isInstanceOf(ChannelSetRolesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "roles",
                ChannelSetRolesAction.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"))) } };
    }

    @Test
    public void roles() {
        ChannelSetRolesAction value = ChannelSetRolesAction.of();
        value.setRoles(Collections
                .singletonList(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
    }
}
