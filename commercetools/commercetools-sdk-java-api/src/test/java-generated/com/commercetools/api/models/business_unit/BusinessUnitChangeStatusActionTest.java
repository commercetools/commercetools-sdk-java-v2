
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitChangeStatusActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitChangeStatusActionBuilder builder) {
        BusinessUnitChangeStatusAction businessUnitChangeStatusAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitChangeStatusAction).isInstanceOf(BusinessUnitChangeStatusAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "status", BusinessUnitChangeStatusAction.builder().status("status") } };
    }

    @Test
    public void status() {
        BusinessUnitChangeStatusAction value = BusinessUnitChangeStatusAction.of();
        value.setStatus("status");
        Assertions.assertThat(value.getStatus()).isEqualTo("status");
    }
}
