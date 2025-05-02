
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitChangeNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitChangeNameActionBuilder builder) {
        BusinessUnitChangeNameAction businessUnitChangeNameAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitChangeNameAction).isInstanceOf(BusinessUnitChangeNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", BusinessUnitChangeNameAction.builder().name("name") } };
    }

    @Test
    public void name() {
        BusinessUnitChangeNameAction value = BusinessUnitChangeNameAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
