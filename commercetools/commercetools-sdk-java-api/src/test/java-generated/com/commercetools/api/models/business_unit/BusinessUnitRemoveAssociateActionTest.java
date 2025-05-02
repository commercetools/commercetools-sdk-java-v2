
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitRemoveAssociateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitRemoveAssociateActionBuilder builder) {
        BusinessUnitRemoveAssociateAction businessUnitRemoveAssociateAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitRemoveAssociateAction).isInstanceOf(BusinessUnitRemoveAssociateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customer", BusinessUnitRemoveAssociateAction.builder()
                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) } };
    }

    @Test
    public void customer() {
        BusinessUnitRemoveAssociateAction value = BusinessUnitRemoveAssociateAction.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }
}
