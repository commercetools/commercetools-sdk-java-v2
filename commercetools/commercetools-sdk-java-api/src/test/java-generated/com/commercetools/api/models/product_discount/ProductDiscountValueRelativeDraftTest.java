
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
public class ProductDiscountValueRelativeDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductDiscountValueRelativeDraftBuilder builder) {
        ProductDiscountValueRelativeDraft productDiscountValueRelativeDraft = builder.buildUnchecked();
        Assertions.assertThat(productDiscountValueRelativeDraft).isInstanceOf(ProductDiscountValueRelativeDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductDiscountValueRelativeDraft.builder().permyriad(1L) } };
    }

    @Test
    public void permyriad() {
        ProductDiscountValueRelativeDraft value = ProductDiscountValueRelativeDraft.of();
        value.setPermyriad(1L);
        Assertions.assertThat(value.getPermyriad()).isEqualTo(1L);
    }
}
