
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
public class LineItemReturnItemTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LineItemReturnItemBuilder builder) {
        LineItemReturnItem lineItemReturnItem = builder.buildUnchecked();
        Assertions.assertThat(lineItemReturnItem).isInstanceOf(LineItemReturnItem.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { LineItemReturnItem.builder().key("key") },
                new Object[] { LineItemReturnItem.builder().lineItemId("lineItemId") },
                new Object[] { LineItemReturnItem.builder().quantity(8L) } };
    }

    @Test
    public void key() {
        LineItemReturnItem value = LineItemReturnItem.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void lineItemId() {
        LineItemReturnItem value = LineItemReturnItem.of();
        value.setLineItemId("lineItemId");
        Assertions.assertThat(value.getLineItemId()).isEqualTo("lineItemId");
    }

    @Test
    public void quantity() {
        LineItemReturnItem value = LineItemReturnItem.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
