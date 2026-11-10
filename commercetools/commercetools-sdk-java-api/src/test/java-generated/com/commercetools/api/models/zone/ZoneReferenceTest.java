
package com.commercetools.api.models.zone;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneReferenceBuilder builder) {
        ZoneReference zoneReference = builder.buildUnchecked();
        Assertions.assertThat(zoneReference).isInstanceOf(ZoneReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj", ZoneReference.builder().obj(new com.commercetools.api.models.zone.ZoneImpl()) },
                new Object[] { "id", ZoneReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ZoneReference value = ZoneReference.of();
        value.setObj(new com.commercetools.api.models.zone.ZoneImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.zone.ZoneImpl());
    }

    @Test
    public void id() {
        ZoneReference value = ZoneReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
