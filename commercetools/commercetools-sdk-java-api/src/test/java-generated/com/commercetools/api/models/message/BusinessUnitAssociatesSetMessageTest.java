
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitAssociatesSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitAssociatesSetMessageBuilder builder) {
        BusinessUnitAssociatesSetMessage businessUnitAssociatesSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAssociatesSetMessage).isInstanceOf(BusinessUnitAssociatesSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "associates", BusinessUnitAssociatesSetMessage.builder()
                .associates(
                    Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateImpl())) } };
    }

    @Test
    public void associates() {
        BusinessUnitAssociatesSetMessage value = BusinessUnitAssociatesSetMessage.of();
        value.setAssociates(Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateImpl()));
        Assertions.assertThat(value.getAssociates())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.business_unit.AssociateImpl()));
    }
}
