
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCartSetBusinessUnitActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyCartSetBusinessUnitActionBuilder builder) {
        MyCartSetBusinessUnitAction myCartSetBusinessUnitAction = builder.buildUnchecked();
        Assertions.assertThat(myCartSetBusinessUnitAction).isInstanceOf(MyCartSetBusinessUnitAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "businessUnit", MyCartSetBusinessUnitAction.builder()
                .businessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) } };
    }

    @Test
    public void businessUnit() {
        MyCartSetBusinessUnitAction value = MyCartSetBusinessUnitAction.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }
}
