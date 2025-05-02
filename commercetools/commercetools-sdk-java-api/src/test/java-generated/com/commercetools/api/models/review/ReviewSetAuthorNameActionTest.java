
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewSetAuthorNameActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewSetAuthorNameActionBuilder builder) {
        ReviewSetAuthorNameAction reviewSetAuthorNameAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetAuthorNameAction).isInstanceOf(ReviewSetAuthorNameAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "authorName", ReviewSetAuthorNameAction.builder().authorName("authorName") } };
    }

    @Test
    public void authorName() {
        ReviewSetAuthorNameAction value = ReviewSetAuthorNameAction.of();
        value.setAuthorName("authorName");
        Assertions.assertThat(value.getAuthorName()).isEqualTo("authorName");
    }
}
