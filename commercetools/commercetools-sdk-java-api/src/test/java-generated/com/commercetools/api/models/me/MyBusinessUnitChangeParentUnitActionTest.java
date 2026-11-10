
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyBusinessUnitChangeParentUnitActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, MyBusinessUnitChangeParentUnitActionBuilder builder) {
        MyBusinessUnitChangeParentUnitAction myBusinessUnitChangeParentUnitAction = builder.buildUnchecked();
        Assertions.assertThat(myBusinessUnitChangeParentUnitAction)
                .isInstanceOf(MyBusinessUnitChangeParentUnitAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "parentUnit", MyBusinessUnitChangeParentUnitAction.builder()
                .parentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) } };
    }

    @Test
    public void parentUnit() {
        MyBusinessUnitChangeParentUnitAction value = MyBusinessUnitChangeParentUnitAction.of();
        value.setParentUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getParentUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }
}
