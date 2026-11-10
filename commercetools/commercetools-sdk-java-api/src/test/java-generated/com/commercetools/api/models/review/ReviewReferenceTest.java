
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewReferenceTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewReferenceBuilder builder) {
        ReviewReference reviewReference = builder.buildUnchecked();
        Assertions.assertThat(reviewReference).isInstanceOf(ReviewReference.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "obj",
                        ReviewReference.builder().obj(new com.commercetools.api.models.review.ReviewImpl()) },
                new Object[] { "id", ReviewReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        ReviewReference value = ReviewReference.of();
        value.setObj(new com.commercetools.api.models.review.ReviewImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.review.ReviewImpl());
    }

    @Test
    public void id() {
        ReviewReference value = ReviewReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
