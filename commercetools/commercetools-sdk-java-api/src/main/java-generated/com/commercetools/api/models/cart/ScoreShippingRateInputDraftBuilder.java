
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

    private Long score;

    /**
     *  <p>Abstract value for categorizing a Cart.</p>
     * @param score value to be set
     * @return Builder
     */

    public ScoreShippingRateInputDraftBuilder score(final Long score) {
        this.score = score;
        return this;
    }

    /**
     *  <p>Abstract value for categorizing a Cart.</p>
     * @return score
     */

    public Long getScore() {
        return this.score;
    }

    /**
     * builds ScoreShippingRateInputDraft with checking for non-null required values
     * @return ScoreShippingRateInputDraft
     */
    public ScoreShippingRateInputDraft build() {
        Objects.requireNonNull(score, ScoreShippingRateInputDraft.class + ": score is missing");
        return new ScoreShippingRateInputDraftImpl(score);
    }

    /**
     * builds ScoreShippingRateInputDraft without checking for non-null required values
     * @return ScoreShippingRateInputDraft
     */
    public ScoreShippingRateInputDraft buildUnchecked() {
        return new ScoreShippingRateInputDraftImpl(score);
    }

    /**
     * factory method for an instance of ScoreShippingRateInputDraftBuilder
     * @return builder
     */
    public static ScoreShippingRateInputDraftBuilder of() {
        return new ScoreShippingRateInputDraftBuilder();
    }

    /**
     * create builder for ScoreShippingRateInputDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ScoreShippingRateInputDraftBuilder of(final ScoreShippingRateInputDraft template) {
        ScoreShippingRateInputDraftBuilder builder = new ScoreShippingRateInputDraftBuilder();
        builder.score = template.getScore();
        return builder;
    }

}
