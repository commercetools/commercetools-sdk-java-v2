
package com.commercetools.api.models.channel;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelDraftBuilder builder) {
        ChannelDraft channelDraft = builder.buildUnchecked();
        Assertions.assertThat(channelDraft).isInstanceOf(ChannelDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ChannelDraft.builder().key("key") },
                new Object[] { "roles", ChannelDraft.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"))) },
                new Object[] { "name",
                        ChannelDraft.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        ChannelDraft.builder()
                                .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "address",
                        ChannelDraft.builder().address(new com.commercetools.api.models.common.BaseAddressImpl()) },
                new Object[] { "custom",
                        ChannelDraft.builder().custom(new com.commercetools.api.models.type.CustomFieldsDraftImpl()) },
                new Object[] { "geoLocation",
                        ChannelDraft.builder().geoLocation(new com.commercetools.api.models.common.GeoJsonImpl()) } };
    }

    @Test
    public void key() {
        ChannelDraft value = ChannelDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void roles() {
        ChannelDraft value = ChannelDraft.of();
        value.setRoles(Collections
                .singletonList(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
    }

    @Test
    public void name() {
        ChannelDraft value = ChannelDraft.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        ChannelDraft value = ChannelDraft.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void address() {
        ChannelDraft value = ChannelDraft.of();
        value.setAddress(new com.commercetools.api.models.common.BaseAddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.BaseAddressImpl());
    }

    @Test
    public void custom() {
        ChannelDraft value = ChannelDraft.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsDraftImpl());
    }

    @Test
    public void geoLocation() {
        ChannelDraft value = ChannelDraft.of();
        value.setGeoLocation(new com.commercetools.api.models.common.GeoJsonImpl());
        Assertions.assertThat(value.getGeoLocation()).isEqualTo(new com.commercetools.api.models.common.GeoJsonImpl());
    }
}
