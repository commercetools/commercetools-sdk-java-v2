
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitContactEmailSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitContactEmailSetMessageBuilder builder) {
        BusinessUnitContactEmailSetMessage businessUnitContactEmailSetMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitContactEmailSetMessage)
                .isInstanceOf(BusinessUnitContactEmailSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "contactEmail",
                BusinessUnitContactEmailSetMessage.builder().contactEmail("contactEmail") } };
    }

    @Test
    public void contactEmail() {
        BusinessUnitContactEmailSetMessage value = BusinessUnitContactEmailSetMessage.of();
        value.setContactEmail("contactEmail");
        Assertions.assertThat(value.getContactEmail()).isEqualTo("contactEmail");
    }
}
