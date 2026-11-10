
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyPaymentSetMethodInfoInterfaceAccountActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyPaymentSetMethodInfoInterfaceAccountActionBuilder builder) {
        MyPaymentSetMethodInfoInterfaceAccountAction myPaymentSetMethodInfoInterfaceAccountAction = builder
                .buildUnchecked();
        Assertions.assertThat(myPaymentSetMethodInfoInterfaceAccountAction)
                .isInstanceOf(MyPaymentSetMethodInfoInterfaceAccountAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "interfaceAccount",
                MyPaymentSetMethodInfoInterfaceAccountAction.builder().interfaceAccount("interfaceAccount") } };
    }

    @Test
    public void interfaceAccount() {
        MyPaymentSetMethodInfoInterfaceAccountAction value = MyPaymentSetMethodInfoInterfaceAccountAction.of();
        value.setInterfaceAccount("interfaceAccount");
        Assertions.assertThat(value.getInterfaceAccount()).isEqualTo("interfaceAccount");
    }
}
