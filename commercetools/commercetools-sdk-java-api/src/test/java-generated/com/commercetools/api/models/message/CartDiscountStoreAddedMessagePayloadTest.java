
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
public class CartDiscountStoreAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountStoreAddedMessagePayloadBuilder builder) {
        CartDiscountStoreAddedMessagePayload cartDiscountStoreAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountStoreAddedMessagePayload)
                .isInstanceOf(CartDiscountStoreAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountStoreAddedMessagePayload.builder()
                .store(new com.commercetools.api.models.store.StoreKeyReferenceImpl()) } };
    }

    @Test
    public void store() {
        CartDiscountStoreAddedMessagePayload value = CartDiscountStoreAddedMessagePayload.of();
        value.setStore(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
        Assertions.assertThat(value.getStore())
                .isEqualTo(new com.commercetools.api.models.store.StoreKeyReferenceImpl());
    }
}
