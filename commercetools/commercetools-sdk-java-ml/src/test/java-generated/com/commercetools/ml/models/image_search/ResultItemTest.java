
package com.commercetools.ml.models.image_search;

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
public class ResultItemTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ResultItemBuilder builder) {
        ResultItem resultItem = builder.buildUnchecked();
        Assertions.assertThat(resultItem).isInstanceOf(ResultItem.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ResultItem.builder().imageUrl("imageUrl") },
                new Object[] { ResultItem.builder()
                        .productVariants(
                            Collections.singletonList(new com.commercetools.ml.models.common.ProductVariantImpl())) } };
    }

    @Test
    public void imageUrl() {
        ResultItem value = ResultItem.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void productVariants() {
        ResultItem value = ResultItem.of();
        value.setProductVariants(
            Collections.singletonList(new com.commercetools.ml.models.common.ProductVariantImpl()));
        Assertions.assertThat(value.getProductVariants())
                .isEqualTo(Collections.singletonList(new com.commercetools.ml.models.common.ProductVariantImpl()));
    }
}
