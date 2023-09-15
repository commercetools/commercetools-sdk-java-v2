
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
public class StagedQuoteSetSellerCommentActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteSetSellerCommentActionBuilder builder) {
        StagedQuoteSetSellerCommentAction stagedQuoteSetSellerCommentAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteSetSellerCommentAction).isInstanceOf(StagedQuoteSetSellerCommentAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedQuoteSetSellerCommentAction.builder().sellerComment("sellerComment") } };
    }

    @Test
    public void sellerComment() {
        StagedQuoteSetSellerCommentAction value = StagedQuoteSetSellerCommentAction.of();
        value.setSellerComment("sellerComment");
        Assertions.assertThat(value.getSellerComment()).isEqualTo("sellerComment");
    }
}
