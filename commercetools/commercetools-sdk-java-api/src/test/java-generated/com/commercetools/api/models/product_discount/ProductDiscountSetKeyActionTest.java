
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountSetKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountSetKeyActionBuilder builder) {
        ProductDiscountSetKeyAction productDiscountSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountSetKeyAction).isInstanceOf(ProductDiscountSetKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ProductDiscountSetKeyAction value = ProductDiscountSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
