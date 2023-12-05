
package com.commercetools.api.models.shipping_method;

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
public class ShippingMethodChangeIsDefaultActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ShippingMethodChangeIsDefaultActionBuilder builder) {
        ShippingMethodChangeIsDefaultAction shippingMethodChangeIsDefaultAction = builder.buildUnchecked();
        Assertions.assertThat(shippingMethodChangeIsDefaultAction)
                .isInstanceOf(ShippingMethodChangeIsDefaultAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ShippingMethodChangeIsDefaultAction.builder().isDefault(true) } };
    }

    @Test
    public void isDefault() {
        ShippingMethodChangeIsDefaultAction value = ShippingMethodChangeIsDefaultAction.of();
        value.setIsDefault(true);
        Assertions.assertThat(value.getIsDefault()).isEqualTo(true);
    }
}
