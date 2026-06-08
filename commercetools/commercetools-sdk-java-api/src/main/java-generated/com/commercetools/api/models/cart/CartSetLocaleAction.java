
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLocaleAction cartSetLocaleAction = CartSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLocale")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLocaleActionImpl.class)
public interface CartSetLocaleAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetLocaleAction
     */
    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. Must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>'s <code>languages</code>. If empty, any existing value will be removed.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Value to set. Must be one of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>'s <code>languages</code>. If empty, any existing value will be removed.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     * factory method
     * @return instance of CartSetLocaleAction
     */
    public static CartSetLocaleAction of() {
        return new CartSetLocaleActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetLocaleAction of(final CartSetLocaleAction template) {
        CartSetLocaleActionImpl instance = new CartSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public CartSetLocaleAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetLocaleAction deepCopy(@Nullable final CartSetLocaleAction template) {
        if (template == null) {
            return null;
        }
        CartSetLocaleActionImpl instance = new CartSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for CartSetLocaleAction
     * @return builder
     */
    public static CartSetLocaleActionBuilder builder() {
        return CartSetLocaleActionBuilder.of();
    }

    /**
     * create builder for CartSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetLocaleActionBuilder builder(final CartSetLocaleAction template) {
        return CartSetLocaleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetLocaleAction(Function<CartSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLocaleAction>";
            }
        };
    }
}
