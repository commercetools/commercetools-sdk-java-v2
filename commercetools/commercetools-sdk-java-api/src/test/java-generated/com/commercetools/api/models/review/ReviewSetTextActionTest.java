
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewSetTextActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewSetTextActionBuilder builder) {
        ReviewSetTextAction reviewSetTextAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetTextAction).isInstanceOf(ReviewSetTextAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "text", ReviewSetTextAction.builder().text("text") } };
    }

    @Test
    public void text() {
        ReviewSetTextAction value = ReviewSetTextAction.of();
        value.setText("text");
        Assertions.assertThat(value.getText()).isEqualTo("text");
    }
}
