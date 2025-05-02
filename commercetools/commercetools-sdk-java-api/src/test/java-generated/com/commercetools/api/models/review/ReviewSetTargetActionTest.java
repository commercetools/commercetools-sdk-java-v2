
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewSetTargetActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewSetTargetActionBuilder builder) {
        ReviewSetTargetAction reviewSetTargetAction = builder.buildUnchecked();
        Assertions.assertThat(reviewSetTargetAction).isInstanceOf(ReviewSetTargetAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "target", ReviewSetTargetAction.builder().target("target") } };
    }

    @Test
    public void target() {
        ReviewSetTargetAction value = ReviewSetTargetAction.of();
        value.setTarget("target");
        Assertions.assertThat(value.getTarget()).isEqualTo("target");
    }
}
