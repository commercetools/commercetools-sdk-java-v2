
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
public class DiscountCodeKeySetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeKeySetMessagePayloadBuilder builder) {
        DiscountCodeKeySetMessagePayload discountCodeKeySetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(discountCodeKeySetMessagePayload).isInstanceOf(DiscountCodeKeySetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeKeySetMessagePayload.builder().key("key") },
                new Object[] { DiscountCodeKeySetMessagePayload.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        DiscountCodeKeySetMessagePayload value = DiscountCodeKeySetMessagePayload.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        DiscountCodeKeySetMessagePayload value = DiscountCodeKeySetMessagePayload.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
