package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetAnonymousIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetAnonymousIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetAnonymousIdAction cartSetAnonymousIdAction = CartSetAnonymousIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetAnonymousIdActionBuilder implements Builder<CartSetAnonymousIdAction> {

    
    @Nullable
    private String anonymousId;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param anonymousId value to be set
     * @return Builder
     */
    
    public CartSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return anonymousId
     */
    
    @Nullable
    public String getAnonymousId(){
        return this.anonymousId;
    }

    /**
     * builds CartSetAnonymousIdAction with checking for non-null required values
     * @return CartSetAnonymousIdAction
     */
    public CartSetAnonymousIdAction build() {
        return new CartSetAnonymousIdActionImpl(anonymousId);
    }
    
    /**
     * builds CartSetAnonymousIdAction without checking for non-null required values
     * @return CartSetAnonymousIdAction
     */
    public CartSetAnonymousIdAction buildUnchecked() {
        return new CartSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * factory method for an instance of CartSetAnonymousIdActionBuilder
     * @return builder 
     */
    public static CartSetAnonymousIdActionBuilder of() {
        return new CartSetAnonymousIdActionBuilder();
    }

    /**
     * create builder for CartSetAnonymousIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetAnonymousIdActionBuilder of(final CartSetAnonymousIdAction template) {
        CartSetAnonymousIdActionBuilder builder = new CartSetAnonymousIdActionBuilder();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
