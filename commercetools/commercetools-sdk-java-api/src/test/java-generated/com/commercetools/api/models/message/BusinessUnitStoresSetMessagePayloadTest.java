
package com.commercetools.api.models.message;

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
public class BusinessUnitStoresSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitStoresSetMessagePayloadBuilder builder) {
        BusinessUnitStoresSetMessagePayload businessUnitStoresSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStoresSetMessagePayload)
                .isInstanceOf(BusinessUnitStoresSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitStoresSetMessagePayload.builder()
                .stores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl())) } };
    }

    @Test
    public void stores() {
        BusinessUnitStoresSetMessagePayload value = BusinessUnitStoresSetMessagePayload.of();
        value.setStores(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
        Assertions.assertThat(value.getStores())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.store.StoreKeyReferenceImpl()));
    }
}
