
package com.commercetools.api.models.zone;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneSetDescriptionActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneSetDescriptionActionBuilder builder) {
        ZoneSetDescriptionAction zoneSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(zoneSetDescriptionAction).isInstanceOf(ZoneSetDescriptionAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "description", ZoneSetDescriptionAction.builder().description("description") } };
    }

    @Test
    public void description() {
        ZoneSetDescriptionAction value = ZoneSetDescriptionAction.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }
}
