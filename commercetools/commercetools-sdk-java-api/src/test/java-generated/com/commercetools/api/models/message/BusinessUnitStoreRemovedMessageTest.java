
package com.commercetools.api.models.message;

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
public class BusinessUnitStoreRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitStoreRemovedMessageBuilder builder) {
        BusinessUnitStoreRemovedMessage businessUnitStoreRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitStoreRemovedMessage).isInstanceOf(BusinessUnitStoreRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BusinessUnitStoreRemovedMessage.builder()
                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) } };
    }

    @Test
    public void store() {
        BusinessUnitStoreRemovedMessage value = BusinessUnitStoreRemovedMessage.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }
}
