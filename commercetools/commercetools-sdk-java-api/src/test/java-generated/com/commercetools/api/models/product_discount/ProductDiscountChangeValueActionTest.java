
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
public class ProductDiscountChangeValueActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountChangeValueActionBuilder builder) {
        ProductDiscountChangeValueAction productDiscountChangeValueAction = builder.buildUnchecked();
        Assertions.assertThat(productDiscountChangeValueAction).isInstanceOf(ProductDiscountChangeValueAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountChangeValueAction.builder()
                .value(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl()) } };
    }

    @Test
    public void value() {
        ProductDiscountChangeValueAction value = ProductDiscountChangeValueAction.of();
        value.setValue(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.product_discount.ProductDiscountValueDraftImpl());
    }
}
