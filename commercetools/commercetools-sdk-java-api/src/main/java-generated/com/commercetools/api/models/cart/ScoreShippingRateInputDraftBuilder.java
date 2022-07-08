
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ScoreShippingRateInputDraftBuilder implements Builder<ScoreShippingRateInputDraft> {

    private Long score;

    public ScoreShippingRateInputDraftBuilder score(final Long score) {
        this.score = score;
        return this;
    }

    public Long getScore() {
        return this.score;
    }

    public ScoreShippingRateInputDraft build() {
        Objects.requireNonNull(score, ScoreShippingRateInputDraft.class + ": score is missing");
        return new ScoreShippingRateInputDraftImpl(score);
    }

    /**
     * builds ScoreShippingRateInputDraft without checking for non null required values
     */
    public ScoreShippingRateInputDraft buildUnchecked() {
        return new ScoreShippingRateInputDraftImpl(score);
    }

    public static ScoreShippingRateInputDraftBuilder of() {
        return new ScoreShippingRateInputDraftBuilder();
    }

    public static ScoreShippingRateInputDraftBuilder of(final ScoreShippingRateInputDraft template) {
        ScoreShippingRateInputDraftBuilder builder = new ScoreShippingRateInputDraftBuilder();
        builder.score = template.getScore();
        return builder;
    }

}
