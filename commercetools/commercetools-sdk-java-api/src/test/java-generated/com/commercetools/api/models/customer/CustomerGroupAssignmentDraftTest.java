
package com.commercetools.api.models.customer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupAssignmentDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupAssignmentDraftBuilder builder) {
        CustomerGroupAssignmentDraft customerGroupAssignmentDraft = builder.buildUnchecked();
        Assertions.assertThat(customerGroupAssignmentDraft).isInstanceOf(CustomerGroupAssignmentDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customerGroup",
                CustomerGroupAssignmentDraft.builder()
                        .customerGroup(
                            new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl()) } };
    }

    @Test
    public void customerGroup() {
        CustomerGroupAssignmentDraft value = CustomerGroupAssignmentDraft.of();
        value.setCustomerGroup(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomerGroup())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierImpl());
    }
}
