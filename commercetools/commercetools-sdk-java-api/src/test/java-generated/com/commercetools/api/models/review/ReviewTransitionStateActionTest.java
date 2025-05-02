
package com.commercetools.api.models.review;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewTransitionStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewTransitionStateActionBuilder builder) {
        ReviewTransitionStateAction reviewTransitionStateAction = builder.buildUnchecked();
        Assertions.assertThat(reviewTransitionStateAction).isInstanceOf(ReviewTransitionStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        ReviewTransitionStateAction.builder()
                                .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "force", ReviewTransitionStateAction.builder().force(true) } };
    }

    @Test
    public void state() {
        ReviewTransitionStateAction value = ReviewTransitionStateAction.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void force() {
        ReviewTransitionStateAction value = ReviewTransitionStateAction.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
