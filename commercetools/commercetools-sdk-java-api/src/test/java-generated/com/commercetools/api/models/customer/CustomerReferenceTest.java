
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
public class CustomerReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerReferenceBuilder builder) {
        CustomerReference customerReference = builder.buildUnchecked();
        Assertions.assertThat(customerReference).isInstanceOf(CustomerReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        CustomerReference.builder().obj(new com.commercetools.api.models.customer.CustomerImpl()) },
                new Object[] { CustomerReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CustomerReference value = CustomerReference.of();
        value.setObj(new com.commercetools.api.models.customer.CustomerImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.customer.CustomerImpl());
    }

    @Test
    public void id() {
        CustomerReference value = CustomerReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
