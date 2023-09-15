
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
public class CustomerSetStoresActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerSetStoresActionBuilder builder) {
        CustomerSetStoresAction customerSetStoresAction = builder.buildUnchecked();
        Assertions.assertThat(customerSetStoresAction).isInstanceOf(CustomerSetStoresAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerSetStoresAction.builder()
                .stores(Collections
                        .singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void stores() {
        CustomerSetStoresAction value = CustomerSetStoresAction.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
