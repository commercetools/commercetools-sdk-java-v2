
package com.commercetools.api.models.cart_discount;

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
public class CartDiscountValueRelativeDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CartDiscountValueRelativeDraftBuilder builder) {
        CartDiscountValueRelativeDraft cartDiscountValueRelativeDraft = builder.buildUnchecked();
        Assertions.assertThat(cartDiscountValueRelativeDraft).isInstanceOf(CartDiscountValueRelativeDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CartDiscountValueRelativeDraft.builder().permyriad(1L) } };
    }

    @Test
    public void permyriad() {
        CartDiscountValueRelativeDraft value = CartDiscountValueRelativeDraft.of();
        value.setPermyriad(1L);
        Assertions.assertThat(value.getPermyriad()).isEqualTo(1L);
    }
}
