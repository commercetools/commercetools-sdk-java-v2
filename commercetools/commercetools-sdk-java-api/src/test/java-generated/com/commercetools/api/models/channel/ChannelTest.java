
package com.commercetools.api.models.channel;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ChannelTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ChannelBuilder builder) {
        Channel channel = builder.buildUnchecked();
        Assertions.assertThat(channel).isInstanceOf(Channel.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Channel.builder().id("id") },
                new Object[] { "version", Channel.builder().version(2L) },
                new Object[] { "createdAt", Channel.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Channel.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Channel.builder()
                                .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Channel.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", Channel.builder().key("key") },
                new Object[] { "roles", Channel.builder()
                        .roles(Collections.singletonList(
                            com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply"))) },
                new Object[] { "name",
                        Channel.builder().name(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "description",
                        Channel.builder().description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { "address",
                        Channel.builder().address(new com.commercetools.api.models.common.AddressImpl()) },
                new Object[] { "reviewRatingStatistics", Channel.builder()
                        .reviewRatingStatistics(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl()) },
                new Object[] { "custom",
                        Channel.builder().custom(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "geoLocation",
                        Channel.builder().geoLocation(new com.commercetools.api.models.common.GeoJsonImpl()) } };
    }

    @Test
    public void id() {
        Channel value = Channel.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Channel value = Channel.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Channel value = Channel.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Channel value = Channel.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Channel value = Channel.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Channel value = Channel.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        Channel value = Channel.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void roles() {
        Channel value = Channel.of();
        value.setRoles(Collections
                .singletonList(com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.channel.ChannelRoleEnum.findEnum("InventorySupply")));
    }

    @Test
    public void name() {
        Channel value = Channel.of();
        value.setName(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        Channel value = Channel.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void address() {
        Channel value = Channel.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }

    @Test
    public void reviewRatingStatistics() {
        Channel value = Channel.of();
        value.setReviewRatingStatistics(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl());
        Assertions.assertThat(value.getReviewRatingStatistics())
                .isEqualTo(new com.commercetools.api.models.review.ReviewRatingStatisticsImpl());
    }

    @Test
    public void custom() {
        Channel value = Channel.of();
        value.setCustom(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustom()).isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void geoLocation() {
        Channel value = Channel.of();
        value.setGeoLocation(new com.commercetools.api.models.common.GeoJsonImpl());
        Assertions.assertThat(value.getGeoLocation()).isEqualTo(new com.commercetools.api.models.common.GeoJsonImpl());
    }
}
