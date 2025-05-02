
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetCustomFieldActionBuilder builder) {
        MyCustomerSetCustomFieldAction myCustomerSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetCustomFieldAction).isInstanceOf(MyCustomerSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", MyCustomerSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyCustomerSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyCustomerSetCustomFieldAction value = MyCustomerSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyCustomerSetCustomFieldAction value = MyCustomerSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
