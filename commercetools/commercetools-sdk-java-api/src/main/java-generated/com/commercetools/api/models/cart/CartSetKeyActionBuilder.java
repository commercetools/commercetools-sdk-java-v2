package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetKeyAction cartSetKeyAction = CartSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetKeyActionBuilder implements Builder<CartSetKeyAction> {

    
    @Nullable
    private String key;

    
    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public CartSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds CartSetKeyAction with checking for non-null required values
     * @return CartSetKeyAction
     */
    public CartSetKeyAction build() {
        return new CartSetKeyActionImpl(key);
    }
    
    /**
     * builds CartSetKeyAction without checking for non-null required values
     * @return CartSetKeyAction
     */
    public CartSetKeyAction buildUnchecked() {
        return new CartSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of CartSetKeyActionBuilder
     * @return builder 
     */
    public static CartSetKeyActionBuilder of() {
        return new CartSetKeyActionBuilder();
    }

    /**
     * create builder for CartSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetKeyActionBuilder of(final CartSetKeyAction template) {
        CartSetKeyActionBuilder builder = new CartSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
