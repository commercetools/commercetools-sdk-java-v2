
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringMoveImageToPositionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringMoveImageToPositionActionBuilder builder) {
        ProductTailoringMoveImageToPositionAction productTailoringMoveImageToPositionAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringMoveImageToPositionAction)
                .isInstanceOf(ProductTailoringMoveImageToPositionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringMoveImageToPositionAction.builder().variantId(5L) },
                new Object[] { ProductTailoringMoveImageToPositionAction.builder().sku("sku") },
                new Object[] { ProductTailoringMoveImageToPositionAction.builder().imageUrl("imageUrl") },
                new Object[] { ProductTailoringMoveImageToPositionAction.builder().position(4L) },
                new Object[] { ProductTailoringMoveImageToPositionAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void imageUrl() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void position() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setPosition(4L);
        Assertions.assertThat(value.getPosition()).isEqualTo(4L);
    }

    @Test
    public void staged() {
        ProductTailoringMoveImageToPositionAction value = ProductTailoringMoveImageToPositionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
