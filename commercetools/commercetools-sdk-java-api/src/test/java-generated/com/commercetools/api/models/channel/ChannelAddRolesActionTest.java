
package com.commercetools.api.models.channel;

import java.util.Collections;

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
public class ChannelAddRolesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChannelAddRolesActionBuilder builder) {
        ChannelAddRolesAction channelAddRolesAction = builder.buildUnchecked();
        Assertions.assertThat(channelAddRolesAction).isInstanceOf(ChannelAddRolesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChannelAddRolesAction.builder()
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
