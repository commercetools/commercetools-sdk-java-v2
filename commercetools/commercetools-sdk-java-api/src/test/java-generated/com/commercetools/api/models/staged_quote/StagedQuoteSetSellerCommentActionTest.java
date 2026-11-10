
package com.commercetools.api.models.staged_quote;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StagedQuoteSetSellerCommentActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StagedQuoteSetSellerCommentActionBuilder builder) {
        StagedQuoteSetSellerCommentAction stagedQuoteSetSellerCommentAction = builder.buildUnchecked();
        Assertions.assertThat(stagedQuoteSetSellerCommentAction).isInstanceOf(StagedQuoteSetSellerCommentAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "sellerComment",
                StagedQuoteSetSellerCommentAction.builder().sellerComment("sellerComment") } };
    }

    @Test
    public void sellerComment() {
        StagedQuoteSetSellerCommentAction value = StagedQuoteSetSellerCommentAction.of();
        value.setSellerComment("sellerComment");
        Assertions.assertThat(value.getSellerComment()).isEqualTo("sellerComment");
    }
}
