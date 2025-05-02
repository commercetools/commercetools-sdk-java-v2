
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCompanyNameSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCompanyNameSetMessagePayloadBuilder builder) {
        CustomerCompanyNameSetMessagePayload customerCompanyNameSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCompanyNameSetMessagePayload)
                .isInstanceOf(CustomerCompanyNameSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "companyName",
                CustomerCompanyNameSetMessagePayload.builder().companyName("companyName") } };
    }

    @Test
    public void companyName() {
        CustomerCompanyNameSetMessagePayload value = CustomerCompanyNameSetMessagePayload.of();
        value.setCompanyName("companyName");
        Assertions.assertThat(value.getCompanyName()).isEqualTo("companyName");
    }
}
