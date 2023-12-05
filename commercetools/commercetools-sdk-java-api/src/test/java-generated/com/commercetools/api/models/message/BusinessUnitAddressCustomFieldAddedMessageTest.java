
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
public class BusinessUnitAddressCustomFieldAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddressCustomFieldAddedMessageBuilder builder) {
        BusinessUnitAddressCustomFieldAddedMessage businessUnitAddressCustomFieldAddedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldAddedMessage)
                .isInstanceOf(BusinessUnitAddressCustomFieldAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitAddressCustomFieldAddedMessage.builder().name("name") },
                new Object[] { BusinessUnitAddressCustomFieldAddedMessage.builder().value("value") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldAddedMessage value = BusinessUnitAddressCustomFieldAddedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitAddressCustomFieldAddedMessage value = BusinessUnitAddressCustomFieldAddedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
