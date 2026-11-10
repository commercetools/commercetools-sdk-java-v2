
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitNameChangedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitNameChangedMessagePayloadBuilder builder) {
        BusinessUnitNameChangedMessagePayload businessUnitNameChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitNameChangedMessagePayload)
                .isInstanceOf(BusinessUnitNameChangedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "name", BusinessUnitNameChangedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        BusinessUnitNameChangedMessagePayload value = BusinessUnitNameChangedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
