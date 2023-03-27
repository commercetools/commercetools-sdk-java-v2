
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetAnonymousIdAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetAnonymousIdAction cartSetAnonymousIdAction = CartSetAnonymousIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetAnonymousIdActionImpl.class)
public interface CartSetAnonymousIdAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetAnonymousIdAction
     */
    String SET_ANONYMOUS_ID = "setAnonymousId";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param anonymousId value to be set
     */

    public void setAnonymousId(final String anonymousId);

    /**
     * factory method
     * @return instance of CartSetAnonymousIdAction
     */
    public static CartSetAnonymousIdAction of() {
        return new CartSetAnonymousIdActionImpl();
    }

    /**
     * factory method to copy an instance of CartSetAnonymousIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetAnonymousIdAction of(final CartSetAnonymousIdAction template) {
        CartSetAnonymousIdActionImpl instance = new CartSetAnonymousIdActionImpl();
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    /**
     * builder factory method for CartSetAnonymousIdAction
     * @return builder
     */
    public static CartSetAnonymousIdActionBuilder builder() {
        return CartSetAnonymousIdActionBuilder.of();
    }

    /**
     * create builder for CartSetAnonymousIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetAnonymousIdActionBuilder builder(final CartSetAnonymousIdAction template) {
        return CartSetAnonymousIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetAnonymousIdAction(Function<CartSetAnonymousIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetAnonymousIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetAnonymousIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetAnonymousIdAction>";
            }
        };
    }
}
