
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetKeyActionBuilder builder) {
        StandalonePriceSetKeyAction standalonePriceSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetKeyAction).isInstanceOf(StandalonePriceSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", StandalonePriceSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        StandalonePriceSetKeyAction value = StandalonePriceSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
