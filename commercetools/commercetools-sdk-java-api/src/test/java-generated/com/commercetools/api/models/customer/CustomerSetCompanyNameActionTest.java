
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetCompanyNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetCompanyNameActionBuilder builder) {
        CustomerSetCompanyNameAction customerSetCompanyNameAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetCompanyNameAction).isInstanceOf(CustomerSetCompanyNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "companyName", CustomerSetCompanyNameAction.builder().companyName("companyName") } };
    }

    @Test
    public void companyName() {
        CustomerSetCompanyNameAction value = CustomerSetCompanyNameAction.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }
}
