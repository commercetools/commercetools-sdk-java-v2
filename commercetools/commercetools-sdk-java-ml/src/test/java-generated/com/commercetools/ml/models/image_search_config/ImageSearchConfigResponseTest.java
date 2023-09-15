
package com.commercetools.ml.models.image_search_config;

import java.time.ZonedDateTime;

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
public class ImageSearchConfigResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImageSearchConfigResponseBuilder builder) {
        ImageSearchConfigResponse imageSearchConfigResponse = builder.buildUnchecked();
        Assertions.assertThat(imageSearchConfigResponse).isInstanceOf(ImageSearchConfigResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ImageSearchConfigResponse.builder()
                                .status(com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus
                                        .findEnum("on")) },
                new Object[] { ImageSearchConfigResponse.builder()
                        .lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void status() {
        ImageSearchConfigResponse value = ImageSearchConfigResponse.of();
        value.setStatus(com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus.findEnum("on"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus.findEnum("on"));
    }

    @Test
    public void lastModifiedAt() {
        ImageSearchConfigResponse value = ImageSearchConfigResponse.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
