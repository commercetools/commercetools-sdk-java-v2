
package com.commercetools.api.models.business_unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitSetContactEmailActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitSetContactEmailActionBuilder builder) {
        BusinessUnitSetContactEmailAction businessUnitSetContactEmailAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetContactEmailAction).isInstanceOf(BusinessUnitSetContactEmailAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "contactEmail",
                BusinessUnitSetContactEmailAction.builder().contactEmail("contactEmail") } };
    }

    @Test
    public void contactEmail() {
        BusinessUnitSetContactEmailAction value = BusinessUnitSetContactEmailAction.of();
        value.setContactEmail("contactEmail");
        Assertions.assertThat(value.getContactEmail()).isEqualTo("contactEmail");
    }
}
