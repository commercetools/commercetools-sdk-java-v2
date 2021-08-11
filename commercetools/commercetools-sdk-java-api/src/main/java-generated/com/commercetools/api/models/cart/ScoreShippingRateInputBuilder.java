
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ScoreShippingRateInputBuilder implements Builder<ScoreShippingRateInput> {

    private Double score;

    public ScoreShippingRateInputBuilder score(final Double score) {
        this.score = score;
        return this;
    }

    public Double getScore() {
        return this.score;
    }

    public ScoreShippingRateInput build() {
        Objects.requireNonNull(score, ScoreShippingRateInput.class + ": score is missing");
        return new ScoreShippingRateInputImpl(score);
    }

    /**
     * builds ScoreShippingRateInput without checking for non null required values
     */
    public ScoreShippingRateInput buildUnchecked() {
        return new ScoreShippingRateInputImpl(score);
    }

    public static ScoreShippingRateInputBuilder of() {
        return new ScoreShippingRateInputBuilder();
    }

    public static ScoreShippingRateInputBuilder of(final ScoreShippingRateInput template) {
        ScoreShippingRateInputBuilder builder = new ScoreShippingRateInputBuilder();
        builder.score = template.getScore();
        return builder;
    }

}
