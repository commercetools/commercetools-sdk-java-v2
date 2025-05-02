
package com.commercetools.api.models.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderSetBusinessUnitActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderSetBusinessUnitActionBuilder builder) {
        OrderSetBusinessUnitAction orderSetBusinessUnitAction = builder.buildUnchecked();
        Assertions.assertThat(orderSetBusinessUnitAction).isInstanceOf(OrderSetBusinessUnitAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "businessUnit", OrderSetBusinessUnitAction.builder()
                .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) } };
    }

    @Test
    public void businessUnit() {
        OrderSetBusinessUnitAction value = OrderSetBusinessUnitAction.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }
}
