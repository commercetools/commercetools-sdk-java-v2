
package com.commercetools.api.models.zone;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneChangeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneChangeNameActionBuilder builder) {
        ZoneChangeNameAction zoneChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(zoneChangeNameAction).isInstanceOf(ZoneChangeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", ZoneChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        ZoneChangeNameAction value = ZoneChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
