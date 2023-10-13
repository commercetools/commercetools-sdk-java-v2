
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
public class CustomerFirstNameSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerFirstNameSetMessageBuilder builder) {
        CustomerFirstNameSetMessage customerFirstNameSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerFirstNameSetMessage).isInstanceOf(CustomerFirstNameSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerFirstNameSetMessage.builder().firstName("firstName") } };
    }

    @Test
    public void firstName() {
        CustomerFirstNameSetMessage value = CustomerFirstNameSetMessage.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }
}
