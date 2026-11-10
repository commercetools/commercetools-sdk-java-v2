
package com.commercetools.api.models.error;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GraphQLMissingRoleOnChannelErrorTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GraphQLMissingRoleOnChannelErrorBuilder builder) {
        GraphQLMissingRoleOnChannelError graphQLMissingRoleOnChannelError = builder.buildUnchecked();
        Assertions.assertThat(graphQLMissingRoleOnChannelError).isInstanceOf(GraphQLMissingRoleOnChannelError.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "channel",
                        GraphQLMissingRoleOnChannelError.builder()
                                .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { "missingRole", GraphQLMissingRoleOnChannelError.builder()
                        .missingRole(
                            com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")) } };
    }

    @Test
    public void channel() {
        GraphQLMissingRoleOnChannelError value = GraphQLMissingRoleOnChannelError.of();
        value.setChannel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl());
    }

    @Test
    public void missingRole() {
        GraphQLMissingRoleOnChannelError value = GraphQLMissingRoleOnChannelError.of();
        value.setMissingRole(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"));
        Assertions.assertThat(value.getMissingRole())
                .isEqualTo(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"));
    }
}
