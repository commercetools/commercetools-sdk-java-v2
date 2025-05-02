
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCompanyNameSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCompanyNameSetMessageBuilder builder) {
        CustomerCompanyNameSetMessage customerCompanyNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCompanyNameSetMessage).isInstanceOf(CustomerCompanyNameSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "companyName", CustomerCompanyNameSetMessage.builder().companyName("companyName") } };
    }

    @Test
    public void companyName() {
        CustomerCompanyNameSetMessage value = CustomerCompanyNameSetMessage.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }
}
