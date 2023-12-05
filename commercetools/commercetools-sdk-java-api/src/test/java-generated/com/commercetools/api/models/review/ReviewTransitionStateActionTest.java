
package com.commercetools.api.models.review;

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
public class ReviewTransitionStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReviewTransitionStateActionBuilder builder) {
        ReviewTransitionStateAction reviewTransitionStateAction = builder.buildUnchecked();
        Assertions.assertThat(reviewTransitionStateAction).isInstanceOf(ReviewTransitionStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ReviewTransitionStateAction.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { ReviewTransitionStateAction.builder().force(true) } };
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
