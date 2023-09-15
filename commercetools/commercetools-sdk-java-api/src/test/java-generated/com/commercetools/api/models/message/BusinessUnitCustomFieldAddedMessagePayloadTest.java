
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
public class BusinessUnitCustomFieldAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitCustomFieldAddedMessagePayloadBuilder builder) {
        BusinessUnitCustomFieldAddedMessagePayload businessUnitCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomFieldAddedMessagePayload)
                .isInstanceOf(BusinessUnitCustomFieldAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { BusinessUnitCustomFieldAddedMessagePayload.builder().value("value") } };
    }

    @Test
    public void name() {
        BusinessUnitCustomFieldAddedMessagePayload value = BusinessUnitCustomFieldAddedMessagePayload.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitCustomFieldAddedMessagePayload value = BusinessUnitCustomFieldAddedMessagePayload.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
