
package com.commercetools.ml.models.image_search_config;

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
public class ImageSearchConfigRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImageSearchConfigRequestBuilder builder) {
        ImageSearchConfigRequest imageSearchConfigRequest = builder.buildUnchecked();
        Assertions.assertThat(imageSearchConfigRequest).isInstanceOf(ImageSearchConfigRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImageSearchConfigRequest.builder()
                .actions(Collections.singletonList(
                    new com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionImpl())) } };
    }

    @Test
    public void actions() {
        ImageSearchConfigRequest value = ImageSearchConfigRequest.of();
        value.setActions(Collections.singletonList(
            new com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateActionImpl()));
    }
}
