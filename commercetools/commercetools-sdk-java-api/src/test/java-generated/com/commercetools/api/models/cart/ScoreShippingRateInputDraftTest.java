
package com.commercetools.api.models.cart;

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
public class ScoreShippingRateInputDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ScoreShippingRateInputDraftBuilder builder) {
        ScoreShippingRateInputDraft scoreShippingRateInputDraft = builder.buildUnchecked();
        Assertions.assertThat(scoreShippingRateInputDraft).isInstanceOf(ScoreShippingRateInputDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ScoreShippingRateInputDraft.builder().score(9L) } };
    }

    @Test
    public void score() {
        ScoreShippingRateInputDraft value = ScoreShippingRateInputDraft.of();
        value.setScore(9L);
        Assertions.assertThat(value.getScore()).isEqualTo(9L);
    }
}
