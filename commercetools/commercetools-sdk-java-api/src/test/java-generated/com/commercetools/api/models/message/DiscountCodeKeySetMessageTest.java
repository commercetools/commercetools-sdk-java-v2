
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
public class DiscountCodeKeySetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeKeySetMessageBuilder builder) {
        DiscountCodeKeySetMessage discountCodeKeySetMessage = builder.buildUnchecked();
        Assertions.assertThat(discountCodeKeySetMessage).isInstanceOf(DiscountCodeKeySetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeKeySetMessage.builder().key("key") },
                new Object[] { DiscountCodeKeySetMessage.builder().oldKey("oldKey") } };
    }

    @Test
    public void key() {
        DiscountCodeKeySetMessage value = DiscountCodeKeySetMessage.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void oldKey() {
        DiscountCodeKeySetMessage value = DiscountCodeKeySetMessage.of();
        value.setOldKey("oldKey");
        Assertions.assertThat(value.getOldKey()).isEqualTo("oldKey");
    }
}
