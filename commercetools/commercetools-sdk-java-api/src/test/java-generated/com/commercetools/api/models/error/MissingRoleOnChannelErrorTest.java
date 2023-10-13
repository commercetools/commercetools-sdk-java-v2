
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
public class MissingRoleOnChannelErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MissingRoleOnChannelErrorBuilder builder) {
        MissingRoleOnChannelError missingRoleOnChannelError = builder.buildUnchecked();
        Assertions.assertThat(missingRoleOnChannelError).isInstanceOf(MissingRoleOnChannelError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MissingRoleOnChannelError.builder().message("message") },
                new Object[] { MissingRoleOnChannelError.builder()
                        .channel(new com.commercetools.api.models.channel.ChannelResourceIdentifierImpl()) },
                new Object[] { MissingRoleOnChannelError.builder()
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
