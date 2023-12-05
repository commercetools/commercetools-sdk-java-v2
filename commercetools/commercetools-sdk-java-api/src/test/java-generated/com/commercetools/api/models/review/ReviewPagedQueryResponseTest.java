
package com.commercetools.api.models.review;

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
public class ReviewPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewPagedQueryResponseBuilder builder) {
        ReviewPagedQueryResponse reviewPagedQueryResponse = builder.buildUnchecked();
        Assertions.assertThat(reviewPagedQueryResponse).isInstanceOf(ReviewPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReviewPagedQueryResponse.builder().limit(7L) },
                new Object[] { ReviewPagedQueryResponse.builder().count(2L) },
                new Object[] { ReviewPagedQueryResponse.builder().total(1L) },
                new Object[] { ReviewPagedQueryResponse.builder().offset(3L) },
                new Object[] { ReviewPagedQueryResponse.builder()
                        .results(Collections.singletonList(new com.commercetools.api.models.review.ReviewImpl())) } };
    }

    @Test
    public void limit() {
        ReviewPagedQueryResponse value = ReviewPagedQueryResponse.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void count() {
        ReviewPagedQueryResponse value = ReviewPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ReviewPagedQueryResponse value = ReviewPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        ReviewPagedQueryResponse value = ReviewPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        ReviewPagedQueryResponse value = ReviewPagedQueryResponse.of();
        value.setResults(Collections.singletonList(new com.commercetools.api.models.review.ReviewImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.review.ReviewImpl()));
    }
}
