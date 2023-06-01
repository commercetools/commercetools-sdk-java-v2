package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetCountryAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCountryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCountryAction cartSetCountryAction = CartSetCountryAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartSetCountryActionBuilder implements Builder<CartSetCountryAction> {

    
    @Nullable
    private String country;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the Store's <code>countries</code>. Otherwise a CountryNotConfiguredInStore error is returned.</p>
     * @param country value to be set
     * @return Builder
     */
    
    public CartSetCountryActionBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the Store's <code>countries</code>. Otherwise a CountryNotConfiguredInStore error is returned.</p>
     * @return country
     */
    
    @Nullable
    public String getCountry(){
        return this.country;
    }

    /**
     * builds CartSetCountryAction with checking for non-null required values
     * @return CartSetCountryAction
     */
    public CartSetCountryAction build() {
        return new CartSetCountryActionImpl(country);
    }
    
    /**
     * builds CartSetCountryAction without checking for non-null required values
     * @return CartSetCountryAction
     */
    public CartSetCountryAction buildUnchecked() {
        return new CartSetCountryActionImpl(country);
    }

    /**
     * factory method for an instance of CartSetCountryActionBuilder
     * @return builder 
     */
    public static CartSetCountryActionBuilder of() {
        return new CartSetCountryActionBuilder();
    }

    /**
     * create builder for CartSetCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCountryActionBuilder of(final CartSetCountryAction template) {
        CartSetCountryActionBuilder builder = new CartSetCountryActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
