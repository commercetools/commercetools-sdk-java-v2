
package com.commercetools.ml.models.similar_products;

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
public class SimilarProductsTaskStatusTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SimilarProductsTaskStatusBuilder builder) {
        SimilarProductsTaskStatus similarProductsTaskStatus = builder.buildUnchecked();
        Assertions.assertThat(similarProductsTaskStatus).isInstanceOf(SimilarProductsTaskStatus.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { SimilarProductsTaskStatus.builder()
                        .state(com.commercetools.ml.models.common.TaskStatusEnum.findEnum("PENDING")) },
                new Object[] { SimilarProductsTaskStatus.builder().expires(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { SimilarProductsTaskStatus.builder()
                        .result(
                            new com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultImpl()) } };
    }

    @Test
    public void state() {
        SimilarProductsTaskStatus value = SimilarProductsTaskStatus.of();
        value.setState(com.commercetools.ml.models.common.TaskStatusEnum.findEnum("PENDING"));
        Assertions.assertThat(value.getState())
                .isEqualTo(com.commercetools.ml.models.common.TaskStatusEnum.findEnum("PENDING"));
    }

    @Test
    public void expires() {
        SimilarProductsTaskStatus value = SimilarProductsTaskStatus.of();
        value.setExpires(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getExpires()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void result() {
        SimilarProductsTaskStatus value = SimilarProductsTaskStatus.of();
        value.setResult(new com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultImpl());
        Assertions.assertThat(value.getResult())
                .isEqualTo(new com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultImpl());
    }
}
