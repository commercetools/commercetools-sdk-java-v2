
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewSetTitleActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewSetTitleActionBuilder builder) {
        ReviewSetTitleAction reviewSetTitleAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetTitleAction).isInstanceOf(ReviewSetTitleAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "title", ReviewSetTitleAction.builder().title("title") } };
    }

    @Test
    public void title() {
        ReviewSetTitleAction value = ReviewSetTitleAction.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }
}
