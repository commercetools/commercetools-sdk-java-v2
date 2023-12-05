
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
public class ProductSetDescriptionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetDescriptionActionBuilder builder) {
        ProductSetDescriptionAction productSetDescriptionAction = builder.buildUnchecked();
        Assertions.assertThat(productSetDescriptionAction).isInstanceOf(ProductSetDescriptionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSetDescriptionAction.builder()
                        .description(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductSetDescriptionAction.builder().staged(true) } };
    }

    @Test
    public void description() {
        ProductSetDescriptionAction value = ProductSetDescriptionAction.of();
        value.setDescription(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void staged() {
        ProductSetDescriptionAction value = ProductSetDescriptionAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
