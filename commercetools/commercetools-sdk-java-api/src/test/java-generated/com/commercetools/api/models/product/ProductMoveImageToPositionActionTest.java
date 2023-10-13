
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
public class ProductMoveImageToPositionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductMoveImageToPositionActionBuilder builder) {
        ProductMoveImageToPositionAction productMoveImageToPositionAction = builder.buildUnchecked();
        Assertions.assertThat(productMoveImageToPositionAction).isInstanceOf(ProductMoveImageToPositionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductMoveImageToPositionAction.builder().variantId(5L) },
                new Object[] { ProductMoveImageToPositionAction.builder().sku("sku") },
                new Object[] { ProductMoveImageToPositionAction.builder().imageUrl("imageUrl") },
                new Object[] { ProductMoveImageToPositionAction.builder().position(4L) },
                new Object[] { ProductMoveImageToPositionAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void imageUrl() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void position() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setPosition(4L);
        Assertions.assertThat(value.getPosition()).isEqualTo(4L);
    }

    @Test
    public void staged() {
        ProductMoveImageToPositionAction value = ProductMoveImageToPositionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
