
package com.commercetools.api.models.message;

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
public class ProductSlugChangedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSlugChangedMessagePayloadBuilder builder) {
        ProductSlugChangedMessagePayload productSlugChangedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productSlugChangedMessagePayload).isInstanceOf(ProductSlugChangedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductSlugChangedMessagePayload.builder()
                        .slug(new com.commercetools.api.models.common.LocalizedStringImpl()) },
                new Object[] { ProductSlugChangedMessagePayload.builder()
                        .oldSlug(new com.commercetools.api.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void slug() {
        ProductSlugChangedMessagePayload value = ProductSlugChangedMessagePayload.of();
        value.setSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getSlug()).isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }

    @Test
    public void oldSlug() {
        ProductSlugChangedMessagePayload value = ProductSlugChangedMessagePayload.of();
        value.setOldSlug(new com.commercetools.api.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getOldSlug())
                .isEqualTo(new com.commercetools.api.models.common.LocalizedStringImpl());
    }
}
