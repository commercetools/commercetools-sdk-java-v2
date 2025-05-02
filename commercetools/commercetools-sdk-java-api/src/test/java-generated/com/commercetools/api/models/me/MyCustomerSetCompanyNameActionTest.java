
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCustomerSetCompanyNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCustomerSetCompanyNameActionBuilder builder) {
        MyCustomerSetCompanyNameAction myCustomerSetCompanyNameAction = builder.buildUnchecked();
        Assertions.assertThat(myCustomerSetCompanyNameAction).isInstanceOf(MyCustomerSetCompanyNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "companyName", MyCustomerSetCompanyNameAction.builder().companyName("companyName") } };
    }

    @Test
    public void companyName() {
        MyCustomerSetCompanyNameAction value = MyCustomerSetCompanyNameAction.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }
}
