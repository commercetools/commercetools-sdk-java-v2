
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentSetMethodInfoInterfaceActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentSetMethodInfoInterfaceActionBuilder builder) {
        MyPaymentSetMethodInfoInterfaceAction myPaymentSetMethodInfoInterfaceAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetMethodInfoInterfaceAction)
                .isInstanceOf(MyPaymentSetMethodInfoInterfaceAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interface",
                MyPaymentSetMethodInfoInterfaceAction.builder()._interface("_interface") } };
    }

    @Test
    public void _interface() {
        MyPaymentSetMethodInfoInterfaceAction value = MyPaymentSetMethodInfoInterfaceAction.of();
        value.setInterface("interface");
        Assertions.assertThat(value.getInterface()).isEqualTo("interface");
    }
}
