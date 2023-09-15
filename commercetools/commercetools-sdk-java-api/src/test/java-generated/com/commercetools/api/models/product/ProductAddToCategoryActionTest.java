
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
public class ProductAddToCategoryActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductAddToCategoryActionBuilder builder) {
        ProductAddToCategoryAction productAddToCategoryAction = builder.buildUnchecked();
        Assertions.assertThat(productAddToCategoryAction).isInstanceOf(ProductAddToCategoryAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductAddToCategoryAction.builder()
                        .category(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl()) },
                new Object[] { ProductAddToCategoryAction.builder().orderHint("orderHint") },
                new Object[] { ProductAddToCategoryAction.builder().staged(true) } };
    }

    @Test
    public void category() {
        ProductAddToCategoryAction value = ProductAddToCategoryAction.of();
        value.setCategory(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.api.models.category.CategoryResourceIdentifierImpl());
    }

    @Test
    public void orderHint() {
        ProductAddToCategoryAction value = ProductAddToCategoryAction.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }

    @Test
    public void staged() {
        ProductAddToCategoryAction value = ProductAddToCategoryAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
