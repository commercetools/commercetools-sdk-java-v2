
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
public class QuoteStateTransitionMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteStateTransitionMessagePayloadBuilder builder) {
        QuoteStateTransitionMessagePayload quoteStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(quoteStateTransitionMessagePayload)
                .isInstanceOf(QuoteStateTransitionMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { QuoteStateTransitionMessagePayload.builder()
                        .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { QuoteStateTransitionMessagePayload.builder()
                        .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { QuoteStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void state() {
        QuoteStateTransitionMessagePayload value = QuoteStateTransitionMessagePayload.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        QuoteStateTransitionMessagePayload value = QuoteStateTransitionMessagePayload.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        QuoteStateTransitionMessagePayload value = QuoteStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
