
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
public class QuoteRequestStateTransitionMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(QuoteRequestStateTransitionMessageBuilder builder) {
        QuoteRequestStateTransitionMessage quoteRequestStateTransitionMessage = builder.buildUnchecked();
        Assertions.assertThat(quoteRequestStateTransitionMessage)
                .isInstanceOf(QuoteRequestStateTransitionMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { QuoteRequestStateTransitionMessage.builder()
                        .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { QuoteRequestStateTransitionMessage.builder()
                        .oldState(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { QuoteRequestStateTransitionMessage.builder().force(true) } };
    }

    @Test
    public void state() {
        QuoteRequestStateTransitionMessage value = QuoteRequestStateTransitionMessage.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void oldState() {
        QuoteRequestStateTransitionMessage value = QuoteRequestStateTransitionMessage.of();
        value.setOldState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getOldState())
                .isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        QuoteRequestStateTransitionMessage value = QuoteRequestStateTransitionMessage.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
