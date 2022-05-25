
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScoreShippingRateInputDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScoreShippingRateInputDraft scoreShippingRateInputDraft = ScoreShippingRateInputDraft.builder()
 *             .score(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ScoreShippingRateInputDraftBuilder implements Builder<ScoreShippingRateInputDraft> {

    private Double score;

    /**
     *
     */

    public ScoreShippingRateInputDraftBuilder score(final Double score) {
        this.score = score;
        return this;
    }

    public Double getScore() {
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
