
package com.commercetools.api.models.staged_quote;

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
public class StagedQuoteTransitionStateActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteTransitionStateActionBuilder builder) {
        StagedQuoteTransitionStateAction stagedQuoteTransitionStateAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteTransitionStateAction).isInstanceOf(StagedQuoteTransitionStateAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedQuoteTransitionStateAction.builder()
                        .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { StagedQuoteTransitionStateAction.builder().force(true) } };
    }

    @Test
    public void state() {
        StagedQuoteTransitionStateAction value = StagedQuoteTransitionStateAction.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void force() {
        StagedQuoteTransitionStateAction value = StagedQuoteTransitionStateAction.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
