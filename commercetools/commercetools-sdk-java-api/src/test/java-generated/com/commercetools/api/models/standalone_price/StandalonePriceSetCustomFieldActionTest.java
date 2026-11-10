
package com.commercetools.api.models.standalone_price;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StandalonePriceSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StandalonePriceSetCustomFieldActionBuilder builder) {
        StandalonePriceSetCustomFieldAction standalonePriceSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(standalonePriceSetCustomFieldAction)
                .isInstanceOf(StandalonePriceSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", StandalonePriceSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", StandalonePriceSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StandalonePriceSetCustomFieldAction value = StandalonePriceSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StandalonePriceSetCustomFieldAction value = StandalonePriceSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
