
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
public class BusinessUnitShippingAddressAddedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitShippingAddressAddedMessageBuilder builder) {
        BusinessUnitShippingAddressAddedMessage businessUnitShippingAddressAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitShippingAddressAddedMessage)
                .isInstanceOf(BusinessUnitShippingAddressAddedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitShippingAddressAddedMessage.builder()
                .address(new com.commercetools.api.models.common.AddressImpl()) } };
    }

    @Test
    public void address() {
        BusinessUnitShippingAddressAddedMessage value = BusinessUnitShippingAddressAddedMessage.of();
        value.setAddress(new com.commercetools.api.models.common.AddressImpl());
        Assertions.assertThat(value.getAddress()).isEqualTo(new com.commercetools.api.models.common.AddressImpl());
    }
}
