
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitRemoveAssociateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitRemoveAssociateActionBuilder builder) {
        MyBusinessUnitRemoveAssociateAction myBusinessUnitRemoveAssociateAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitRemoveAssociateAction)
                .isInstanceOf(MyBusinessUnitRemoveAssociateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "customer", MyBusinessUnitRemoveAssociateAction.builder()
                .customer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) } };
    }

    @Test
    public void customer() {
        MyBusinessUnitRemoveAssociateAction value = MyBusinessUnitRemoveAssociateAction.of();
        value.setCustomer(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getCustomer())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }
}
