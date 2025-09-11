
package com.commercetools.importapi.models.importrequests;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class BusinessUnitImportRequestTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, BusinessUnitImportRequestBuilder builder) {
        BusinessUnitImportRequest businessUnitImportRequest = builder.buildUnchecked();
        Assertions.assertThat(businessUnitImportRequest).isInstanceOf(BusinessUnitImportRequest.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "resources",
                BusinessUnitImportRequest.builder()
                        .resources(Collections.singletonList(
                            new com.commercetools.importapi.models.business_units.BusinessUnitImportImpl())) } };
    }

    @Test
    public void resources() {
        BusinessUnitImportRequest value = BusinessUnitImportRequest.of();
        value.setResources(
            Collections.singletonList(new com.commercetools.importapi.models.business_units.BusinessUnitImportImpl()));
        Assertions.assertThat(value.getResources())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.importapi.models.business_units.BusinessUnitImportImpl()));
    }
}
