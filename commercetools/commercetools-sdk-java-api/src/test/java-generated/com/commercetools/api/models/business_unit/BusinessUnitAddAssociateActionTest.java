
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAddAssociateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAddAssociateActionBuilder builder) {
        BusinessUnitAddAssociateAction businessUnitAddAssociateAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAddAssociateAction).isInstanceOf(BusinessUnitAddAssociateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associate", BusinessUnitAddAssociateAction.builder()
                .associate(new com.commercetools.api.models.business_unit.AssociateDraftImpl()) } };
    }

    @Test
    public void associate() {
        BusinessUnitAddAssociateAction value = BusinessUnitAddAssociateAction.of();
        value.setAssociate(new com.commercetools.api.models.business_unit.AssociateDraftImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.business_unit.AssociateDraftImpl());
    }
}
