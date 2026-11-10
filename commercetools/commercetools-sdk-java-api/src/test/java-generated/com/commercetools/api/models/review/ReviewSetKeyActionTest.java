
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewSetKeyActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewSetKeyActionBuilder builder) {
        ReviewSetKeyAction reviewSetKeyAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetKeyAction).isInstanceOf(ReviewSetKeyAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", ReviewSetKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        ReviewSetKeyAction value = ReviewSetKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
