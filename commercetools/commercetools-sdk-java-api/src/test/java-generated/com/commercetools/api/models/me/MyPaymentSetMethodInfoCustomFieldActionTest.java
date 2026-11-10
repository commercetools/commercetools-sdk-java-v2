
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentSetMethodInfoCustomFieldActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentSetMethodInfoCustomFieldActionBuilder builder) {
        MyPaymentSetMethodInfoCustomFieldAction myPaymentSetMethodInfoCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetMethodInfoCustomFieldAction)
                .isInstanceOf(MyPaymentSetMethodInfoCustomFieldAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", MyPaymentSetMethodInfoCustomFieldAction.builder().name("name") },
                new Object[] { "value", MyPaymentSetMethodInfoCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        MyPaymentSetMethodInfoCustomFieldAction value = MyPaymentSetMethodInfoCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        MyPaymentSetMethodInfoCustomFieldAction value = MyPaymentSetMethodInfoCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
