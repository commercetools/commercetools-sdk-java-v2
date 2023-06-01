package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetCountryActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Setting the country can lead to changes in the LineItem prices.</p>
 *
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
@JsonDeserialize(as = CartSetCountryActionImpl.class)
public interface CartSetCountryAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCountryAction
     */
    String SET_COUNTRY = "setCountry";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the Store's <code>countries</code>. Otherwise a CountryNotConfiguredInStore error is returned.</p>
     * @return country
     */
    
    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the Cart is bound to a <code>store</code>, the provided value must be included in the Store's <code>countries</code>. Otherwise a CountryNotConfiguredInStore error is returned.</p>
     * @param country value to be set
     */
    
    public void setCountry(final String country);
    

    /**
     * factory method
     * @return instance of CartSetCountryAction
     */
    public static CartSetCountryAction of(){
        return new CartSetCountryActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CartSetCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCountryAction of(final CartSetCountryAction template) {
        CartSetCountryActionImpl instance = new CartSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCountryAction deepCopy(@Nullable final CartSetCountryAction template) {
        if (template == null) {
            return null;
        }
        CartSetCountryActionImpl instance = new CartSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * builder factory method for CartSetCountryAction
     * @return builder
     */
    public static CartSetCountryActionBuilder builder() {
        return CartSetCountryActionBuilder.of();
    }
    
    /**
     * create builder for CartSetCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCountryActionBuilder builder(final CartSetCountryAction template) {
        return CartSetCountryActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCountryAction(Function<CartSetCountryAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCountryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCountryAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCountryAction>";
            }
        };
    }
}
