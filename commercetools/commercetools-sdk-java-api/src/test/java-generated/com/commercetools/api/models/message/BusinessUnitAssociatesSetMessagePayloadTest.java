
package com.commercetools.api.models.message;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class BusinessUnitAssociatesSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAssociatesSetMessagePayloadBuilder builder) {
        BusinessUnitAssociatesSetMessagePayload businessUnitAssociatesSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitAssociatesSetMessagePayload)
                .isInstanceOf(BusinessUnitAssociatesSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitAssociatesSetMessagePayload.builder()
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
