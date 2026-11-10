
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteSellerCommentSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteSellerCommentSetMessagePayloadBuilder builder) {
        StagedQuoteSellerCommentSetMessagePayload stagedQuoteSellerCommentSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteSellerCommentSetMessagePayload)
                .isInstanceOf(StagedQuoteSellerCommentSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sellerComment",
                StagedQuoteSellerCommentSetMessagePayload.builder().sellerComment("sellerComment") } };
    }

    @Test
    public void sellerComment() {
        StagedQuoteSellerCommentSetMessagePayload value = StagedQuoteSellerCommentSetMessagePayload.of();
        value.setSellerComment("sellerComment");
        Assertions.assertThat(value.getSellerComment()).isEqualTo("sellerComment");
    }
}
