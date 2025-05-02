
package com.commercetools.api.models.store;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreSetCustomFieldActionBuilder builder) {
        StoreSetCustomFieldAction storeSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(storeSetCustomFieldAction).isInstanceOf(StoreSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", StoreSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", StoreSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        StoreSetCustomFieldAction value = StoreSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        StoreSetCustomFieldAction value = StoreSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
