
package com.commercetools.api.models.product;

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
public class ProductPublishActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductPublishActionBuilder builder) {
        ProductPublishAction productPublishAction = builder.buildUnchecked();
        Assertions.assertThat(productPublishAction).isInstanceOf(ProductPublishAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductPublishAction.builder()
                .scope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All")) } };
    }

    @Test
    public void scope() {
        ProductPublishAction value = ProductPublishAction.of();
        value.setScope(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
        Assertions.assertThat(value.getScope())
                .isEqualTo(com.commercetools.api.models.cart.ProductPublishScope.findEnum("All"));
    }
}
