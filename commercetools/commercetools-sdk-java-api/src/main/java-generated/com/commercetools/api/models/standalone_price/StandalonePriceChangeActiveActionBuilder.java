package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction;
import com.commercetools.api.models.standalone_price.StandalonePriceChangeActiveAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceChangeActiveActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeActiveAction standalonePriceChangeActiveAction = StandalonePriceChangeActiveAction.builder()
 *             .active(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceChangeActiveActionBuilder implements Builder<StandalonePriceChangeActiveAction> {

    
    
    private Boolean active;

    
    /**
     *  <p>New value to set for the <code>active</code> field of the StandalonePrice.</p>
     * @param active value to be set
     * @return Builder
     */
    
    public StandalonePriceChangeActiveActionBuilder active( final Boolean active) {
        this.active = active;
        return this;
    }
    
    

    /**
     *  <p>New value to set for the <code>active</code> field of the StandalonePrice.</p>
     * @return active
     */
    
    
    public Boolean getActive(){
        return this.active;
    }

    /**
     * builds StandalonePriceChangeActiveAction with checking for non-null required values
     * @return StandalonePriceChangeActiveAction
     */
    public StandalonePriceChangeActiveAction build() {
        Objects.requireNonNull(active, StandalonePriceChangeActiveAction.class + ": active is missing");
        return new StandalonePriceChangeActiveActionImpl(active);
    }
    
    /**
     * builds StandalonePriceChangeActiveAction without checking for non-null required values
     * @return StandalonePriceChangeActiveAction
     */
    public StandalonePriceChangeActiveAction buildUnchecked() {
        return new StandalonePriceChangeActiveActionImpl(active);
    }

    /**
     * factory method for an instance of StandalonePriceChangeActiveActionBuilder
     * @return builder 
     */
    public static StandalonePriceChangeActiveActionBuilder of() {
        return new StandalonePriceChangeActiveActionBuilder();
    }

    /**
     * create builder for StandalonePriceChangeActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceChangeActiveActionBuilder of(final StandalonePriceChangeActiveAction template) {
        StandalonePriceChangeActiveActionBuilder builder = new StandalonePriceChangeActiveActionBuilder();
        builder.active = template.getActive();
        return builder;
    }

}
