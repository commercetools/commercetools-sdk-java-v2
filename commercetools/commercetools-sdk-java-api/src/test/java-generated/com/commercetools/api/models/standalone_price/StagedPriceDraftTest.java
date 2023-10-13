
package com.commercetools.api.models.standalone_price;

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
public class StagedPriceDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedPriceDraftBuilder builder) {
        StagedPriceDraft stagedPriceDraft = builder.buildUnchecked();
        Assertions.assertThat(stagedPriceDraft).isInstanceOf(StagedPriceDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] {
                StagedPriceDraft.builder().value(new com.commercetools.api.models.common.TypedMoneyDraftImpl()) } };
    }

    @Test
    public void value() {
        StagedPriceDraft value = StagedPriceDraft.of();
        value.setValue(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
        Assertions.assertThat(value.getValue())
                .isEqualTo(new com.commercetools.api.models.common.TypedMoneyDraftImpl());
    }
}
