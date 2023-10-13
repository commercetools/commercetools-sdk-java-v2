
package com.commercetools.api.models.business_unit;

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
public class BusinessUnitSetStoresActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitSetStoresActionBuilder builder) {
        BusinessUnitSetStoresAction businessUnitSetStoresAction = builder.buildUnchecked();
        Assertions.assertThat(businessUnitSetStoresAction).isInstanceOf(BusinessUnitSetStoresAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitSetStoresAction.builder()
                .stores(Collections
                        .singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl())) } };
    }

    @Test
    public void stores() {
        BusinessUnitSetStoresAction value = BusinessUnitSetStoresAction.of();
        value.setStores(
            Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.store.StoreResourceIdentifierImpl()));
    }
}
