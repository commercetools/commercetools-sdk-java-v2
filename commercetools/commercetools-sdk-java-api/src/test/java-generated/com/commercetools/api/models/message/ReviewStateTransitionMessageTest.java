
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewStateTransitionMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewStateTransitionMessageBuilder builder) {
        ReviewStateTransitionMessage reviewStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(reviewStateTransitionMessage).isInstanceOf(ReviewStateTransitionMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldState",
                        ReviewStateTransitionMessage.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "newState",
                        ReviewStateTransitionMessage.builder()
                                .newState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldIncludedInStatistics",
                        ReviewStateTransitionMessage.builder().oldIncludedInStatistics(true) },
                new Object[] { "newIncludedInStatistics",
                        ReviewStateTransitionMessage.builder().newIncludedInStatistics(true) },
                new Object[] { "target",
                        ReviewStateTransitionMessage.builder()
                                .target(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { "force", ReviewStateTransitionMessage.builder().force(true) } };
    }

    @Test
    public void oldState() {
        ReviewStateTransitionMessage value = ReviewStateTransitionMessage.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void newState() {
        ReviewStateTransitionMessage value = ReviewStateTransitionMessage.of();
        value.setNewState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getNewState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldIncludedInStatistics() {
        ReviewStateTransitionMessage value = ReviewStateTransitionMessage.of();
        value.setOldIncludedInStatistics(true);
        Assertions.assertThat(value.getOldIncludedInStatistics()).isEqualTo(true);
    }

    @Test
    public void newIncludedInStatistics() {
        ReviewStateTransitionMessage value = ReviewStateTransitionMessage.of();
        value.setNewIncludedInStatistics(true);
        Assertions.assertThat(value.getNewIncludedInStatistics()).isEqualTo(true);
    }

    @Test
    public void target() {
        ReviewStateTransitionMessage value = ReviewStateTransitionMessage.of();
        value.setTarget(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getTarget()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void force() {
        ReviewStateTransitionMessage value = ReviewStateTransitionMessage.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
