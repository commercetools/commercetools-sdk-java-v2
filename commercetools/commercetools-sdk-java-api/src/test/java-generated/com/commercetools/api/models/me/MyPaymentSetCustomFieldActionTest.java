
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentSetCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentSetCustomFieldActionBuilder builder) {
        MyPaymentSetCustomFieldAction myPaymentSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetCustomFieldAction).isInstanceOf(MyPaymentSetCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", MyPaymentSetCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyPaymentSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyPaymentSetCustomFieldAction value = MyPaymentSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyPaymentSetCustomFieldAction value = MyPaymentSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
