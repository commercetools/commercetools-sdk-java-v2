
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
public class BusinessUnitAddressCustomFieldChangedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddressCustomFieldChangedMessageBuilder builder) {
        BusinessUnitAddressCustomFieldChangedMessage businessUnitAddressCustomFieldChangedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldChangedMessage)
                .isInstanceOf(BusinessUnitAddressCustomFieldChangedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitAddressCustomFieldChangedMessage.builder().name("name") },
                new Object[] { BusinessUnitAddressCustomFieldChangedMessage.builder().value("value") },
                new Object[] { BusinessUnitAddressCustomFieldChangedMessage.builder().oldValue("oldValue") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldChangedMessage value = BusinessUnitAddressCustomFieldChangedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitAddressCustomFieldChangedMessage value = BusinessUnitAddressCustomFieldChangedMessage.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void oldValue() {
        BusinessUnitAddressCustomFieldChangedMessage value = BusinessUnitAddressCustomFieldChangedMessage.of();
        value.setOldValue("oldValue");
        Assertions.assertThat(value.getOldValue()).isEqualTo("oldValue");
    }
}
