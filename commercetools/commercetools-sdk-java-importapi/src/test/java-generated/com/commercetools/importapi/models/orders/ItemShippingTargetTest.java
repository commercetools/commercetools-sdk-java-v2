
package com.commercetools.importapi.models.orders;

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
public class ItemShippingTargetTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ItemShippingTargetBuilder builder) {
        ItemShippingTarget itemShippingTarget = builder.buildUnchecked();
        Assertions.assertThat(itemShippingTarget).isInstanceOf(ItemShippingTarget.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ItemShippingTarget.builder().addressKey("addressKey") },
                new Object[] { ItemShippingTarget.builder().quantity(8L) } };
    }

    @Test
    public void addressKey() {
        ItemShippingTarget value = ItemShippingTarget.of();
        value.setAddressKey("addressKey");
        Assertions.assertThat(value.getAddressKey()).isEqualTo("addressKey");
    }

    @Test
    public void quantity() {
        ItemShippingTarget value = ItemShippingTarget.of();
        value.setQuantity(8L);
        Assertions.assertThat(value.getQuantity()).isEqualTo(8L);
    }
}
