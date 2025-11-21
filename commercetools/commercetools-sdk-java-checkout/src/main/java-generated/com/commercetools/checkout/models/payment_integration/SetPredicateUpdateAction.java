
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the predicate of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPredicateUpdateAction setPredicateUpdateAction = SetPredicateUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPredicate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetPredicateUpdateActionImpl.class)
public interface SetPredicateUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetPredicateUpdateAction
     */
    String SET_PREDICATE = "setPredicate";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return predicate
     */

    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of SetPredicateUpdateAction
     */
    public static SetPredicateUpdateAction of() {
        return new SetPredicateUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetPredicateUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetPredicateUpdateAction of(final SetPredicateUpdateAction template) {
        SetPredicateUpdateActionImpl instance = new SetPredicateUpdateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public SetPredicateUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetPredicateUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetPredicateUpdateAction deepCopy(@Nullable final SetPredicateUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetPredicateUpdateActionImpl instance = new SetPredicateUpdateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for SetPredicateUpdateAction
     * @return builder
     */
    public static SetPredicateUpdateActionBuilder builder() {
        return SetPredicateUpdateActionBuilder.of();
    }

    /**
     * create builder for SetPredicateUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPredicateUpdateActionBuilder builder(final SetPredicateUpdateAction template) {
        return SetPredicateUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetPredicateUpdateAction(Function<SetPredicateUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetPredicateUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPredicateUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetPredicateUpdateAction>";
            }
        };
    }
}
