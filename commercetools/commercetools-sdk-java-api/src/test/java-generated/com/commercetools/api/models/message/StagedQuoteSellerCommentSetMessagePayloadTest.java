
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
public class StagedQuoteSellerCommentSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StagedQuoteSellerCommentSetMessagePayloadBuilder builder) {
        StagedQuoteSellerCommentSetMessagePayload stagedQuoteSellerCommentSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteSellerCommentSetMessagePayload)
                .isInstanceOf(StagedQuoteSellerCommentSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { StagedQuoteSellerCommentSetMessagePayload.builder().sellerComment("sellerComment") } };
    }

    @Test
    public void sellerComment() {
        StagedQuoteSellerCommentSetMessagePayload value = StagedQuoteSellerCommentSetMessagePayload.of();
        value.setSellerComment("sellerComment");
        Assertions.assertThat(value.getSellerComment()).isEqualTo("sellerComment");
    }
}
