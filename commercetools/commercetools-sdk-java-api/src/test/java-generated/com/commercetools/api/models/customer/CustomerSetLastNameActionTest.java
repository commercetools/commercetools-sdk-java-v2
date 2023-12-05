
package com.commercetools.api.models.customer;

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
public class CustomerSetLastNameActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetLastNameActionBuilder builder) {
        CustomerSetLastNameAction customerSetLastNameAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetLastNameAction).isInstanceOf(CustomerSetLastNameAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSetLastNameAction.builder().lastName("lastName") } };
    }

    @Test
    public void lastName() {
        CustomerSetLastNameAction value = CustomerSetLastNameAction.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }
}
