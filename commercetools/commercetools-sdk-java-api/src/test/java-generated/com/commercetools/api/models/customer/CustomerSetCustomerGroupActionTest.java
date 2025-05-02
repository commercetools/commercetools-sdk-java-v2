
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerSetCustomerGroupActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerSetCustomerGroupActionBuilder builder) {
        CustomerSetCustomerGroupAction customerSetCustomerGroupAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetCustomerGroupAction).isInstanceOf(CustomerSetCustomerGroupAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroup",
                CustomerSetCustomerGroupAction.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) } };
    }

    @Test
    public void customerGroup() {
        CustomerSetCustomerGroupAction value = CustomerSetCustomerGroupAction.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }
}
