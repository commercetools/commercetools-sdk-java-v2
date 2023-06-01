package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetLocaleAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLocaleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLocaleAction cartSetLocaleAction = CartSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetLocaleActionBuilder implements Builder<CartSetLocaleAction> {

    
    @Nullable
    private String locale;

    
    /**
     *  <p>Value to set. Must be one of the Project's <code>languages</code>. If empty, any existing value will be removed.</p>
     * @param locale value to be set
     * @return Builder
     */
    
    public CartSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }
    
    

    /**
     *  <p>Value to set. Must be one of the Project's <code>languages</code>. If empty, any existing value will be removed.</p>
     * @return locale
     */
    
    @Nullable
    public String getLocale(){
        return this.locale;
    }

    /**
     * builds CartSetLocaleAction with checking for non-null required values
     * @return CartSetLocaleAction
     */
    public CartSetLocaleAction build() {
        return new CartSetLocaleActionImpl(locale);
    }
    
    /**
     * builds CartSetLocaleAction without checking for non-null required values
     * @return CartSetLocaleAction
     */
    public CartSetLocaleAction buildUnchecked() {
        return new CartSetLocaleActionImpl(locale);
    }

    /**
     * factory method for an instance of CartSetLocaleActionBuilder
     * @return builder 
     */
    public static CartSetLocaleActionBuilder of() {
        return new CartSetLocaleActionBuilder();
    }

    /**
     * create builder for CartSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLocaleActionBuilder of(final CartSetLocaleAction template) {
        CartSetLocaleActionBuilder builder = new CartSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
