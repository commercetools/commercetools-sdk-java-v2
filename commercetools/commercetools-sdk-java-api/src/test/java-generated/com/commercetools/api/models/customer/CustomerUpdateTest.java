
package com.commercetools.api.models.customer;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerUpdateBuilder builder) {
        CustomerUpdate customerUpdate = builder.buildUnchecked();
        Assertions.assertThat(customerUpdate).isInstanceOf(CustomerUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", CustomerUpdate.builder().version(2L) },
                new Object[] { "actions",
                        CustomerUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.customer.CustomerUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CustomerUpdate value = CustomerUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CustomerUpdate value = CustomerUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerUpdateActionImpl()));
    }
}
