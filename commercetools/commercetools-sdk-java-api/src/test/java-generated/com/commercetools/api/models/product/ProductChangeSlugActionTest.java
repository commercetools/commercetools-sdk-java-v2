
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
public class ProductChangeSlugActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductChangeSlugActionBuilder builder) {
        ProductChangeSlugAction productChangeSlugAction = builder.buildUnchecked();
        Assertions.assertThat(productChangeSlugAction).isInstanceOf(ProductChangeSlugAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductChangeSlugAction.builder()
                        .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductChangeSlugAction.builder().staged(true) } };
    }

    @Test
    public void slug() {
        ProductChangeSlugAction value = ProductChangeSlugAction.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductChangeSlugAction value = ProductChangeSlugAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
