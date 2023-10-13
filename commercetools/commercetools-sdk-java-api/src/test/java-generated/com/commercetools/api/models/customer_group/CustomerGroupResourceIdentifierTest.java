
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
public class CustomerGroupResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupResourceIdentifierBuilder builder) {
        CustomerGroupResourceIdentifier customerGroupResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(customerGroupResourceIdentifier).isInstanceOf(CustomerGroupResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupResourceIdentifier.builder().id("id") },
                new Object[] { CustomerGroupResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        CustomerGroupResourceIdentifier value = CustomerGroupResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        CustomerGroupResourceIdentifier value = CustomerGroupResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
