
package com.commercetools.api.models.business_unit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetAssociatesActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetAssociatesActionBuilder builder) {
        BusinessUnitSetAssociatesAction businessUnitSetAssociatesAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetAssociatesAction).isInstanceOf(BusinessUnitSetAssociatesAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associates", BusinessUnitSetAssociatesAction.builder()
                .associates(
                    Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateDraftImpl())) } };
    }

    @Test
    public void associates() {
        BusinessUnitSetAssociatesAction value = BusinessUnitSetAssociatesAction.of();
        value.setAssociates(
            Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateDraftImpl()));
        Assertions.assertThat(value.getAssociates())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateDraftImpl()));
    }
}
