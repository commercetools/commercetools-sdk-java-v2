
package com.commercetools.api.models.zone;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ZoneSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ZoneSetKeyActionBuilder builder) {
        ZoneSetKeyAction zoneSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(zoneSetKeyAction).isInstanceOf(ZoneSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ZoneSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ZoneSetKeyAction value = ZoneSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
