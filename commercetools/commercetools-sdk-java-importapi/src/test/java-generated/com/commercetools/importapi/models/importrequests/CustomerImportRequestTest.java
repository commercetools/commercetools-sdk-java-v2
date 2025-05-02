
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerImportRequestBuilder builder) {
        CustomerImportRequest customerImportRequest = builder.buildUnchecked();
        Assertions.assertThat(customerImportRequest).isInstanceOf(CustomerImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                CustomerImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.customers.CustomerImportImpl())) } };
    }

    @Test
    public void resources() {
        CustomerImportRequest value = CustomerImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.customers.CustomerImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.importapi.models.customers.CustomerImportImpl()));
    }
}
