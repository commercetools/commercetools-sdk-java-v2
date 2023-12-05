
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
public class ImageSearchResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ImageSearchResponseBuilder builder) {
        ImageSearchResponse imageSearchResponse = builder.buildUnchecked();
        Assertions.assertThat(imageSearchResponse).isInstanceOf(ImageSearchResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ImageSearchResponse.builder().count(2) },
                new Object[] { ImageSearchResponse.builder().offset(0.7475848) },
                new Object[] { ImageSearchResponse.builder().total(1) },
                new Object[] { ImageSearchResponse.builder()
                        .results(Collections
                                .singletonList(new com.commercetools.ml.models.image_search.ResultItemImpl())) } };
    }

    @Test
    public void count() {
        ImageSearchResponse value = ImageSearchResponse.of();
        value.setCount(2);
        Assertions.assertThat(value.getCount()).isEqualTo(2);
    }

    @Test
    public void offset() {
        ImageSearchResponse value = ImageSearchResponse.of();
        value.setOffset(0.7475848);
        Assertions.assertThat(value.getOffset()).isEqualTo(0.7475848);
    }

    @Test
    public void total() {
        ImageSearchResponse value = ImageSearchResponse.of();
        value.setTotal(1);
        Assertions.assertThat(value.getTotal()).isEqualTo(1);
    }

    @Test
    public void results() {
        ImageSearchResponse value = ImageSearchResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.ml.models.image_search.ResultItemImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.ml.models.image_search.ResultItemImpl()));
    }
}
