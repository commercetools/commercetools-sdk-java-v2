
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAssociatesSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAssociatesSetMessagePayloadBuilder builder) {
        BusinessUnitAssociatesSetMessagePayload businessUnitAssociatesSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAssociatesSetMessagePayload)
                .isInstanceOf(BusinessUnitAssociatesSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associates", BusinessUnitAssociatesSetMessagePayload.builder()
                .associates(
                    Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateImpl())) } };
    }

    @Test
    public void associates() {
        BusinessUnitAssociatesSetMessagePayload value = BusinessUnitAssociatesSetMessagePayload.of();
        value.setAssociates(Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateImpl()));
        Assertions.assertThat(value.getAssociates())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateImpl()));
    }
}
