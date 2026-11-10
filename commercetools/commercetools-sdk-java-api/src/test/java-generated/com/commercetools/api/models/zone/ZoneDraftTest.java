
package com.commercetools.api.models.zone;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneDraftBuilder builder) {
        ZoneDraft zoneDraft = builder.buildUnchecked();
        Assertions.assertThat(zoneDraft).isInstanceOf(ZoneDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ZoneDraft.builder().key("key") },
                new Object[] { "name", ZoneDraft.builder().name("name") },
                new Object[] { "description", ZoneDraft.builder().description("description") },
                new Object[] { "locations", ZoneDraft.builder()
                        .locations(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl())) } };
    }

    @Test
    public void key() {
        ZoneDraft value = ZoneDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ZoneDraft value = ZoneDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ZoneDraft value = ZoneDraft.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void locations() {
        ZoneDraft value = ZoneDraft.of();
        value.setLocations(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl()));
        Assertions.assertThat(value.getLocations())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.zone.LocationImpl()));
    }
}
