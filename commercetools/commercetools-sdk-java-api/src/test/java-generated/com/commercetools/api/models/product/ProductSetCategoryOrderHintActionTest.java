
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
public class ProductSetCategoryOrderHintActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetCategoryOrderHintActionBuilder builder) {
        ProductSetCategoryOrderHintAction productSetCategoryOrderHintAction = builder.buildUnchecked();
        Assertions.assertThat(productSetCategoryOrderHintAction).isInstanceOf(ProductSetCategoryOrderHintAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetCategoryOrderHintAction.builder().categoryId("categoryId") },
                new Object[] { ProductSetCategoryOrderHintAction.builder().orderHint("orderHint") },
                new Object[] { ProductSetCategoryOrderHintAction.builder().staged(true) } };
    }

    @Test
    public void categoryId() {
        ProductSetCategoryOrderHintAction value = ProductSetCategoryOrderHintAction.of();
        value.setCategoryId("categoryId");
        Assertions.assertThat(value.getCategoryId()).isEqualTo("categoryId");
    }

    @Test
    public void orderHint() {
        ProductSetCategoryOrderHintAction value = ProductSetCategoryOrderHintAction.of();
        value.setOrderHint("orderHint");
        Assertions.assertThat(value.getOrderHint()).isEqualTo("orderHint");
    }

    @Test
    public void staged() {
        ProductSetCategoryOrderHintAction value = ProductSetCategoryOrderHintAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
