
package com.commercetools.api.models.review;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewUpdateTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewUpdateBuilder builder) {
        ReviewUpdate reviewUpdate = builder.buildUnchecked();
        Assertions.assertThat(reviewUpdate).isInstanceOf(ReviewUpdate.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "version", ReviewUpdate.builder().version(2L) },
                new Object[] { "actions",
                        ReviewUpdate.builder()
                                .actions(Collections.singletonList(
                                    new com.commercetools.api.models.review.ReviewUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ReviewUpdate value = ReviewUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ReviewUpdate value = ReviewUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.review.ReviewUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.review.ReviewUpdateActionImpl()));
    }
}
