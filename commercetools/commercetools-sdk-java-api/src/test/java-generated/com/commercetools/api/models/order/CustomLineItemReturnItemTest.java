
package com.commercetools.api.models.order;

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
public class CustomLineItemReturnItemTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomLineItemReturnItemBuilder builder) {
        CustomLineItemReturnItem customLineItemReturnItem = builder.buildUnchecked();
        Assertions.assertThat(customLineItemReturnItem).isInstanceOf(CustomLineItemReturnItem.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomLineItemReturnItem.builder().key("key") },
                new Object[] { CustomLineItemReturnItem.builder().customLineItemId("customLineItemId") },
                new Object[] { CustomLineItemReturnItem.builder().quantity(8L) } };
    }

    @Test
    public void key() {
        CustomLineItemReturnItem value = CustomLineItemReturnItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void customLineItemId() {
        CustomLineItemReturnItem value = CustomLineItemReturnItem.of();
        value.setCustomLineItemId("customLineItemId");
        Assertions.assertThat(value.getCustomLineItemId()).isEqualTo("customLineItemId");
    }

    @Test
    public void quantity() {
        CustomLineItemReturnItem value = CustomLineItemReturnItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
