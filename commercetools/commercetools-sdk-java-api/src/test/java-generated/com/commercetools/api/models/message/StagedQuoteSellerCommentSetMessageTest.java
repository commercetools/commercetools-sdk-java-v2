
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteSellerCommentSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteSellerCommentSetMessageBuilder builder) {
        StagedQuoteSellerCommentSetMessage stagedQuoteSellerCommentSetMessage = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteSellerCommentSetMessage)
                .isInstanceOf(StagedQuoteSellerCommentSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sellerComment",
                StagedQuoteSellerCommentSetMessage.builder().sellerComment("sellerComment") } };
    }

    @Test
    public void sellerComment() {
        StagedQuoteSellerCommentSetMessage value = StagedQuoteSellerCommentSetMessage.of();
        value.setSellerComment("sellerComment");
        Assertions.assertThat(value.getSellerComment()).isEqualTo("sellerComment");
    }
}
