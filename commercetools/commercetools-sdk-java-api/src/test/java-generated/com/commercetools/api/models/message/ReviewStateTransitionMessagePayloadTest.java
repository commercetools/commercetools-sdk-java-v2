
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReviewStateTransitionMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReviewStateTransitionMessagePayloadBuilder builder) {
        ReviewStateTransitionMessagePayload reviewStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(reviewStateTransitionMessagePayload)
                .isInstanceOf(ReviewStateTransitionMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "oldState",
                        ReviewStateTransitionMessagePayload.builder()
                                .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "newState",
                        ReviewStateTransitionMessagePayload.builder()
                                .newState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "oldIncludedInStatistics",
                        ReviewStateTransitionMessagePayload.builder().oldIncludedInStatistics(true) },
                new Object[] { "newIncludedInStatistics",
                        ReviewStateTransitionMessagePayload.builder().newIncludedInStatistics(true) },
                new Object[] { "target",
                        ReviewStateTransitionMessagePayload.builder()
                                .target(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { "force", ReviewStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void oldState() {
        ReviewStateTransitionMessagePayload value = ReviewStateTransitionMessagePayload.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void newState() {
        ReviewStateTransitionMessagePayload value = ReviewStateTransitionMessagePayload.of();
        value.setNewState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getNewState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldIncludedInStatistics() {
        ReviewStateTransitionMessagePayload value = ReviewStateTransitionMessagePayload.of();
        value.setOldIncludedInStatistics(true);
        Assertions.assertThat(value.getOldIncludedInStatistics()).isEqualTo(true);
    }

    @Test
    public void newIncludedInStatistics() {
        ReviewStateTransitionMessagePayload value = ReviewStateTransitionMessagePayload.of();
        value.setNewIncludedInStatistics(true);
        Assertions.assertThat(value.getNewIncludedInStatistics()).isEqualTo(true);
    }

    @Test
    public void target() {
        ReviewStateTransitionMessagePayload value = ReviewStateTransitionMessagePayload.of();
        value.setTarget(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getTarget()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void force() {
        ReviewStateTransitionMessagePayload value = ReviewStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
