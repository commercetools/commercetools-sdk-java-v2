
package com.commercetools.importapi.models.common;

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
public class ImageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImageBuilder builder) {
        Image image = builder.buildUnchecked();
        Assertions.assertThat(image).isInstanceOf(Image.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Image.builder().url("url") },
                new Object[] { Image.builder()
                        .dimensions(new com.commercetools.importapi.models.common.AssetDimensionsImpl()) },
                new Object[] { Image.builder().label("label") } };
    }

    @Test
    public void url() {
        Image value = Image.of();
        value.setUrl("url");
        Assertions.assertThat(value.getUrl()).isEqualTo("url");
    }

    @Test
    public void dimensions() {
        Image value = Image.of();
        value.setDimensions(new com.commercetools.importapi.models.common.AssetDimensionsImpl());
        Assertions.assertThat(value.getDimensions())
                .isEqualTo(new com.commercetools.importapi.models.common.AssetDimensionsImpl());
    }

    @Test
    public void label() {
        Image value = Image.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }
}
