
package com.commercetools.api.models.message;

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
public class BusinessUnitStatusChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitStatusChangedMessagePayloadBuilder builder) {
        BusinessUnitStatusChangedMessagePayload businessUnitStatusChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStatusChangedMessagePayload)
                .isInstanceOf(BusinessUnitStatusChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitStatusChangedMessagePayload.builder()
                .active(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active")) } };
    }

    @Test
    public void active() {
        BusinessUnitStatusChangedMessagePayload value = BusinessUnitStatusChangedMessagePayload.of();
        value.setActive(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active"));
        Assertions.assertThat(value.getActive())
                .isEqualTo(com.commercetools.api.models.business_unit.BusinessUnitStatus.findEnum("Active"));
    }
}
