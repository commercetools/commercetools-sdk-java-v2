
package com.commercetools.api.models.customer_group;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupUpdateBuilder builder) {
        CustomerGroupUpdate customerGroupUpdate = builder.buildUnchecked();
        Assertions.assertThat(customerGroupUpdate).isInstanceOf(CustomerGroupUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", CustomerGroupUpdate.builder().version(2L) },
                new Object[] { "actions", CustomerGroupUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.customer_group.CustomerGroupUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CustomerGroupUpdate value = CustomerGroupUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CustomerGroupUpdate value = CustomerGroupUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.customer_group.CustomerGroupUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.customer_group.CustomerGroupUpdateActionImpl()));
    }
}
