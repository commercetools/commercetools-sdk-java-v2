
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitContactEmailSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitContactEmailSetMessagePayloadBuilder builder) {
        BusinessUnitContactEmailSetMessagePayload businessUnitContactEmailSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitContactEmailSetMessagePayload)
                .isInstanceOf(BusinessUnitContactEmailSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "contactEmail",
                BusinessUnitContactEmailSetMessagePayload.builder().contactEmail("contactEmail") } };
    }

    @Test
    public void contactEmail() {
        BusinessUnitContactEmailSetMessagePayload value = BusinessUnitContactEmailSetMessagePayload.of();
        value.setContactEmail("contactEmail");
        Assertions.assertThat(value.getContactEmail()).isEqualTo("contactEmail");
    }
}
