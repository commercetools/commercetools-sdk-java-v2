
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
public class CustomerCustomTypeRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerCustomTypeRemovedMessageBuilder builder) {
        CustomerCustomTypeRemovedMessage customerCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerCustomTypeRemovedMessage).isInstanceOf(CustomerCustomTypeRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerCustomTypeRemovedMessage.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void previousTypeId() {
        CustomerCustomTypeRemovedMessage value = CustomerCustomTypeRemovedMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
