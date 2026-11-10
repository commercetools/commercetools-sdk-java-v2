
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetVatIdActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetVatIdActionBuilder builder) {
        MyCustomerSetVatIdAction myCustomerSetVatIdAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetVatIdAction).isInstanceOf(MyCustomerSetVatIdAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "vatId", MyCustomerSetVatIdAction.builder().vatId("vatId") } };
    }

    @Test
    public void vatId() {
        MyCustomerSetVatIdAction value = MyCustomerSetVatIdAction.of();
        value.setVatId("vatId");
        Assertions.assertThat(value.getVatId()).isEqualTo("vatId");
    }
}
