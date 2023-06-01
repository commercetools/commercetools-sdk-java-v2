package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetPredicateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetPredicateAction shippingMethodSetPredicateAction = ShippingMethodSetPredicateAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingMethodSetPredicateActionBuilder implements Builder<ShippingMethodSetPredicateAction> {

    
    @Nullable
    private String predicate;

    
    /**
     *  <p>A valid Cart predicate. If <code>predicate</code> is absent or <code>null</code>, it is removed if it exists.</p>
     * @param predicate value to be set
     * @return Builder
     */
    
    public ShippingMethodSetPredicateActionBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }
    
    

    /**
     *  <p>A valid Cart predicate. If <code>predicate</code> is absent or <code>null</code>, it is removed if it exists.</p>
     * @return predicate
     */
    
    @Nullable
    public String getPredicate(){
        return this.predicate;
    }

    /**
     * builds ShippingMethodSetPredicateAction with checking for non-null required values
     * @return ShippingMethodSetPredicateAction
     */
    public ShippingMethodSetPredicateAction build() {
        return new ShippingMethodSetPredicateActionImpl(predicate);
    }
    
    /**
     * builds ShippingMethodSetPredicateAction without checking for non-null required values
     * @return ShippingMethodSetPredicateAction
     */
    public ShippingMethodSetPredicateAction buildUnchecked() {
        return new ShippingMethodSetPredicateActionImpl(predicate);
    }

    /**
     * factory method for an instance of ShippingMethodSetPredicateActionBuilder
     * @return builder 
     */
    public static ShippingMethodSetPredicateActionBuilder of() {
        return new ShippingMethodSetPredicateActionBuilder();
    }

    /**
     * create builder for ShippingMethodSetPredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetPredicateActionBuilder of(final ShippingMethodSetPredicateAction template) {
        ShippingMethodSetPredicateActionBuilder builder = new ShippingMethodSetPredicateActionBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
