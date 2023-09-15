
package com.commercetools.api.models.customer;

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
public class CustomerUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerUpdateBuilder builder) {
        CustomerUpdate customerUpdate = builder.buildUnchecked();
        Assertions.assertThat(customerUpdate).isInstanceOf(CustomerUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerUpdate.builder().version(2L) },
                new Object[] { CustomerUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.customer.CustomerUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        CustomerUpdate value = CustomerUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        CustomerUpdate value = CustomerUpdate.of();
        value.setActions(
            Collections.singletonList(new com.commercetools.api.models.customer.CustomerUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.customer.CustomerUpdateActionImpl()));
    }
}
