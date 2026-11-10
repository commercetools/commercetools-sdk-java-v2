
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MissingRoleOnChannelErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MissingRoleOnChannelErrorBuilder builder) {
        MissingRoleOnChannelError missingRoleOnChannelError = builder.buildUnchecked();
        Assertions.assertThat(missingRoleOnChannelError).isInstanceOf(MissingRoleOnChannelError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "message", MissingRoleOnChannelError.builder().message("message") },
                new Object[] { "channel",
                        MissingRoleOnChannelError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "missingRole", MissingRoleOnChannelError.builder()
                        .missingRole(
                            com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")) } };
    }

    @Test
    public void message() {
        MissingRoleOnChannelError value = MissingRoleOnChannelError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void channel() {
        MissingRoleOnChannelError value = MissingRoleOnChannelError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void missingRole() {
        MissingRoleOnChannelError value = MissingRoleOnChannelError.of();
        value.setMissingRole(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"));
        Assertions.assertThat(value.getMissingRole())
                .isEqualTo(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"));
    }
}
