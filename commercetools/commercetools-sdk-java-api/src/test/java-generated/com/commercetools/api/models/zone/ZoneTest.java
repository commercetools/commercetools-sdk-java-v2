
package com.commercetools.api.models.zone;

import java.time.ZonedDateTime;
import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneBuilder builder) {
        Zone zone = builder.buildUnchecked();
        Assertions.assertThat(zone).isInstanceOf(Zone.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Zone.builder().id("id") },
                new Object[] { "version", Zone.builder().version(2L) },
                new Object[] { "createdAt", Zone.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedAt",
                        Zone.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { "lastModifiedBy",
                        Zone.builder().lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { "createdBy",
                        Zone.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { "key", Zone.builder().key("key") }, new Object[] { "name", Zone.builder().name("name") },
                new Object[] { "description", Zone.builder().description("description") },
                new Object[] { "locations", Zone.builder()
                        .locations(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl())) } };
    }

    @Test
    public void id() {
        Zone value = Zone.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        Zone value = Zone.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        Zone value = Zone.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedAt() {
        Zone value = Zone.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        Zone value = Zone.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void createdBy() {
        Zone value = Zone.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void key() {
        Zone value = Zone.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        Zone value = Zone.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        Zone value = Zone.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void locations() {
        Zone value = Zone.of();
        value.setLocations(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl()));
        Assertions.assertThat(value.getLocations())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl()));
    }
}
