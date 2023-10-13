
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
public class CustomerGroupCustomTypeRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupCustomTypeRemovedMessageBuilder builder) {
        CustomerGroupCustomTypeRemovedMessage customerGroupCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomTypeRemovedMessage)
                .isInstanceOf(CustomerGroupCustomTypeRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerGroupCustomTypeRemovedMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        CustomerGroupCustomTypeRemovedMessage value = CustomerGroupCustomTypeRemovedMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
