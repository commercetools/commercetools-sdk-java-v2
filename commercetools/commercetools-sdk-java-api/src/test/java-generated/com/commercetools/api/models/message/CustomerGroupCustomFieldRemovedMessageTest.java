
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
public class CustomerGroupCustomFieldRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupCustomFieldRemovedMessageBuilder builder) {
        CustomerGroupCustomFieldRemovedMessage customerGroupCustomFieldRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomFieldRemovedMessage)
                .isInstanceOf(CustomerGroupCustomFieldRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupCustomFieldRemovedMessage.builder().name("name") } };
    }

    @Test
    public void name() {
        CustomerGroupCustomFieldRemovedMessage value = CustomerGroupCustomFieldRemovedMessage.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }
}
