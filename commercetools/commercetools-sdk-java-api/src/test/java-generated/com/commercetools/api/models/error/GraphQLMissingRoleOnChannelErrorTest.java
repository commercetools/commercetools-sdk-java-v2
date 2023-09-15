
package com.commercetools.api.models.error;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class GraphQLMissingRoleOnChannelErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GraphQLMissingRoleOnChannelErrorBuilder builder) {
        GraphQLMissingRoleOnChannelError graphQLMissingRoleOnChannelError = builder.buildUnchecked();
        Assertions.assertThat(graphQLMissingRoleOnChannelError).isInstanceOf(GraphQLMissingRoleOnChannelError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GraphQLMissingRoleOnChannelError.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { GraphQLMissingRoleOnChannelError.builder()
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
