
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
public class BusinessUnitCustomFieldRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitCustomFieldRemovedMessagePayloadBuilder builder) {
        BusinessUnitCustomFieldRemovedMessagePayload businessUnitCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldRemovedMessagePayload)
                .isInstanceOf(BusinessUnitCustomFieldRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitCustomFieldRemovedMessagePayload.builder().name("name") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldRemovedMessagePayload value = BusinessUnitCustomFieldRemovedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
