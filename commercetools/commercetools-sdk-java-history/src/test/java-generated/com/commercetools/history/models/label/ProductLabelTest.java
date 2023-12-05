
package com.commercetools.history.models.label;

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
public class ProductLabelTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductLabelBuilder builder) {
        ProductLabel productLabel = builder.buildUnchecked();
        Assertions.assertThat(productLabel).isInstanceOf(ProductLabel.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductLabel.builder()
                        .slug(new com.commercetools.history.models.common.LocalizedStringImpl()) },
                new Object[] { ProductLabel.builder()
                        .name(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void slug() {
        ProductLabel value = ProductLabel.of();
        value.setSlug(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }

    @Test
    public void name() {
        ProductLabel value = ProductLabel.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
