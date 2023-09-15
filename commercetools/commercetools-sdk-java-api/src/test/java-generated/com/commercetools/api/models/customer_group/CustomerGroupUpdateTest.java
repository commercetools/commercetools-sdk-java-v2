
package com.commercetools.api.models.customer_group;

import java.util.Collections;

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
public class CustomerGroupUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupUpdateBuilder builder) {
        CustomerGroupUpdate customerGroupUpdate = builder.buildUnchecked();
        Assertions.assertThat(customerGroupUpdate).isInstanceOf(CustomerGroupUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerGroupUpdate.builder().version(2L) },
                new Object[] { CustomerGroupUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.customer_group.CustomerGroupUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CustomerGroupUpdate value = CustomerGroupUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CustomerGroupUpdate value = CustomerGroupUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.customer_group.CustomerGroupUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.customer_group.CustomerGroupUpdateActionImpl()));
    }
}
