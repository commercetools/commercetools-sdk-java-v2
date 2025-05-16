
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the country can lead to changes in the LineItem prices.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCountryAction myCartSetCountryAction = MyCartSetCountryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCountry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetCountryActionImpl.class)
public interface MyCartSetCountryAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetCountryAction
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
     * @return instance of MyCartSetCountryAction
     */
    public static MyCartSetCountryAction of() {
        return new MyCartSetCountryActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetCountryAction of(final MyCartSetCountryAction template) {
        MyCartSetCountryActionImpl instance = new MyCartSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public MyCartSetCountryAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetCountryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetCountryAction deepCopy(@Nullable final MyCartSetCountryAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetCountryActionImpl instance = new MyCartSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    /**
     * builder factory method for MyCartSetCountryAction
     * @return builder
     */
    public static MyCartSetCountryActionBuilder builder() {
        return MyCartSetCountryActionBuilder.of();
    }

    /**
     * create builder for MyCartSetCountryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetCountryActionBuilder builder(final MyCartSetCountryAction template) {
        return MyCartSetCountryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetCountryAction(Function<MyCartSetCountryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetCountryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetCountryAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetCountryAction>";
            }
        };
    }
}
