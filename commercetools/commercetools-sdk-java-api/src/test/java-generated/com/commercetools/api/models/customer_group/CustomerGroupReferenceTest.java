
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
public class CustomerGroupReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupReferenceBuilder builder) {
        CustomerGroupReference customerGroupReference = builder.buildUnchecked();
        Assertions.assertThat(customerGroupReference).isInstanceOf(CustomerGroupReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerGroupReference.builder()
                        .obj(new com.commercetools.api.models.customer_group.CustomerGroupImpl()) },
                new Object[] { CustomerGroupReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CustomerGroupReference value = CustomerGroupReference.of();
        value.setObj(new com.commercetools.api.models.customer_group.CustomerGroupImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.customer_group.CustomerGroupImpl());
    }

    @Test
    public void id() {
        CustomerGroupReference value = CustomerGroupReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
