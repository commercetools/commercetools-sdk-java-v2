package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.ShippingRateInput;
import com.commercetools.importapi.models.orders.ShippingRateInputType;
import com.commercetools.importapi.models.orders.ScoreShippingRateInput;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ScoreShippingRateInputBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ScoreShippingRateInput scoreShippingRateInput = ScoreShippingRateInput.builder()
 *             .score(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ScoreShippingRateInputBuilder implements Builder<ScoreShippingRateInput> {

    
    
    private Double score;

    
    /**
     * set the value to the score
     * @param score value to be set
     * @return Builder
     */
    
    public ScoreShippingRateInputBuilder score( final Double score) {
        this.score = score;
        return this;
    }
    
    

    /**
     * value of score}
     * @return score
     */
    
    
    public Double getScore(){
        return this.score;
    }

    /**
     * builds ScoreShippingRateInput with checking for non-null required values
     * @return ScoreShippingRateInput
     */
    public ScoreShippingRateInput build() {
        Objects.requireNonNull(score, ScoreShippingRateInput.class + ": score is missing");
        return new ScoreShippingRateInputImpl(score);
    }
    
    /**
     * builds ScoreShippingRateInput without checking for non-null required values
     * @return ScoreShippingRateInput
     */
    public ScoreShippingRateInput buildUnchecked() {
        return new ScoreShippingRateInputImpl(score);
    }

    /**
     * factory method for an instance of ScoreShippingRateInputBuilder
     * @return builder 
     */
    public static ScoreShippingRateInputBuilder of() {
        return new ScoreShippingRateInputBuilder();
    }

    /**
     * create builder for ScoreShippingRateInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ScoreShippingRateInputBuilder of(final ScoreShippingRateInput template) {
        ScoreShippingRateInputBuilder builder = new ScoreShippingRateInputBuilder();
        builder.score = template.getScore();
        return builder;
    }

}
