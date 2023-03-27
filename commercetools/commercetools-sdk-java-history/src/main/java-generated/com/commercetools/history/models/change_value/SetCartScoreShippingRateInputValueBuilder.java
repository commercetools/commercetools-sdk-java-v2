
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCartScoreShippingRateInputValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCartScoreShippingRateInputValue setCartScoreShippingRateInputValue = SetCartScoreShippingRateInputValue.builder()
 *             .type("{type}")
 *             .score(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCartScoreShippingRateInputValueBuilder implements Builder<SetCartScoreShippingRateInputValue> {

    private String type;

    private Integer score;

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public SetCartScoreShippingRateInputValueBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     * set the value to the score
     * @param score value to be set
     * @return Builder
     */

    public SetCartScoreShippingRateInputValueBuilder score(final Integer score) {
        this.score = score;
        return this;
    }

    /**
     * value of type}
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     * value of score}
     * @return score
     */

    public Integer getScore() {
        return this.score;
    }

    /**
     * builds SetCartScoreShippingRateInputValue with checking for non-null required values
     * @return SetCartScoreShippingRateInputValue
     */
    public SetCartScoreShippingRateInputValue build() {
        Objects.requireNonNull(type, SetCartScoreShippingRateInputValue.class + ": type is missing");
        Objects.requireNonNull(score, SetCartScoreShippingRateInputValue.class + ": score is missing");
        return new SetCartScoreShippingRateInputValueImpl(type, score);
    }

    /**
     * builds SetCartScoreShippingRateInputValue without checking for non-null required values
     * @return SetCartScoreShippingRateInputValue
     */
    public SetCartScoreShippingRateInputValue buildUnchecked() {
        return new SetCartScoreShippingRateInputValueImpl(type, score);
    }

    /**
     * factory method for an instance of SetCartScoreShippingRateInputValueBuilder
     * @return builder
     */
    public static SetCartScoreShippingRateInputValueBuilder of() {
        return new SetCartScoreShippingRateInputValueBuilder();
    }

    /**
     * create builder for SetCartScoreShippingRateInputValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCartScoreShippingRateInputValueBuilder of(final SetCartScoreShippingRateInputValue template) {
        SetCartScoreShippingRateInputValueBuilder builder = new SetCartScoreShippingRateInputValueBuilder();
        builder.type = template.getType();
        builder.score = template.getScore();
        return builder;
    }

}
