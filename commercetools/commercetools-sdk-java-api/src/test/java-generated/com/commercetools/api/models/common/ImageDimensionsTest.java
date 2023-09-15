
package com.commercetools.api.models.common;

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
public class ImageDimensionsTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImageDimensionsBuilder builder) {
        ImageDimensions imageDimensions = builder.buildUnchecked();
        Assertions.assertThat(imageDimensions).isInstanceOf(ImageDimensions.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImageDimensions.builder().w(5) },
                new Object[] { ImageDimensions.builder().h(6) } };
    }

    @Test
    public void w() {
        ImageDimensions value = ImageDimensions.of();
        value.setW(5);
        Assertions.assertThat(value.getW()).isEqualTo(5);
    }

    @Test
    public void h() {
        ImageDimensions value = ImageDimensions.of();
        value.setH(6);
        Assertions.assertThat(value.getH()).isEqualTo(6);
    }
}
