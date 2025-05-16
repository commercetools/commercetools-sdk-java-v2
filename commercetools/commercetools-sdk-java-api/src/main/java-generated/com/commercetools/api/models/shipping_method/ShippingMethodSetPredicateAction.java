
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetPredicateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetPredicateAction shippingMethodSetPredicateAction = ShippingMethodSetPredicateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPredicate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetPredicateActionImpl.class)
public interface ShippingMethodSetPredicateAction extends ShippingMethodUpdateAction {

    /**
     * discriminator value for ShippingMethodSetPredicateAction
     */
    String SET_PREDICATE = "setPredicate";

    /**
     *  <p>A valid Cart predicate. If <code>predicate</code> is absent or <code>null</code>, it is removed if it exists.</p>
     * @return predicate
     */

    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>A valid Cart predicate. If <code>predicate</code> is absent or <code>null</code>, it is removed if it exists.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of ShippingMethodSetPredicateAction
     */
    public static ShippingMethodSetPredicateAction of() {
        return new ShippingMethodSetPredicateActionImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetPredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetPredicateAction of(final ShippingMethodSetPredicateAction template) {
        ShippingMethodSetPredicateActionImpl instance = new ShippingMethodSetPredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public ShippingMethodSetPredicateAction copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetPredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetPredicateAction deepCopy(@Nullable final ShippingMethodSetPredicateAction template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetPredicateActionImpl instance = new ShippingMethodSetPredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetPredicateAction
     * @return builder
     */
    public static ShippingMethodSetPredicateActionBuilder builder() {
        return ShippingMethodSetPredicateActionBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetPredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetPredicateActionBuilder builder(final ShippingMethodSetPredicateAction template) {
        return ShippingMethodSetPredicateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetPredicateAction(Function<ShippingMethodSetPredicateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetPredicateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetPredicateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetPredicateAction>";
            }
        };
    }
}
