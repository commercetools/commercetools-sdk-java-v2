
package com.commercetools.api.models.product_discount;

import java.util.Collections;

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
public class ProductDiscountValueAbsoluteDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountValueAbsoluteDraftBuilder builder) {
        ProductDiscountValueAbsoluteDraft productDiscountValueAbsoluteDraft = builder.buildUnchecked();
        Assertions.assertThat(productDiscountValueAbsoluteDraft).isInstanceOf(ProductDiscountValueAbsoluteDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountValueAbsoluteDraft.builder()
                .money(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl())) } };
    }

    @Test
    public void money() {
        ProductDiscountValueAbsoluteDraft value = ProductDiscountValueAbsoluteDraft.of();
        value.setMoney(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
        Assertions.assertThat(value.getMoney())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.MoneyImpl()));
    }
}
