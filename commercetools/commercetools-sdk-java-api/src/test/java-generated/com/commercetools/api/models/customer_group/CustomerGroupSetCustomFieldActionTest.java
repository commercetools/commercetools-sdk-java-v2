
package com.commercetools.api.models.customer_group;

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
public class CustomerGroupSetCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupSetCustomFieldActionBuilder builder) {
        CustomerGroupSetCustomFieldAction customerGroupSetCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(customerGroupSetCustomFieldAction).isInstanceOf(CustomerGroupSetCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupSetCustomFieldAction.builder().name("name") },
                new Object[] { CustomerGroupSetCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void name() {
        CustomerGroupSetCustomFieldAction value = CustomerGroupSetCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        CustomerGroupSetCustomFieldAction value = CustomerGroupSetCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
