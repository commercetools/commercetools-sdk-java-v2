
package com.commercetools.api.models.message;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ReviewStateTransitionMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewStateTransitionMessageBuilder builder) {
        ReviewStateTransitionMessage reviewStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(reviewStateTransitionMessage).isInstanceOf(ReviewStateTransitionMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ReviewStateTransitionMessage.builder()
                        .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { ReviewStateTransitionMessage.builder()
                        .newState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { ReviewStateTransitionMessage.builder().oldIncludedInStatistics(true) },
                new Object[] { ReviewStateTransitionMessage.builder().newIncludedInStatistics(true) },
                new Object[] { ReviewStateTransitionMessage.builder()
                        .target(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { ReviewStateTransitionMessage.builder().force(true) } };
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
