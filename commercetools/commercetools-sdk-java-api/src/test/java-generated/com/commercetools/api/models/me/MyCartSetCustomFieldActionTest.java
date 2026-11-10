
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetCustomFieldActionBuilder builder) {
        MyCartSetCustomFieldAction myCartSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetCustomFieldAction).isInstanceOf(MyCartSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", MyCartSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyCartSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyCartSetCustomFieldAction value = MyCartSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyCartSetCustomFieldAction value = MyCartSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
