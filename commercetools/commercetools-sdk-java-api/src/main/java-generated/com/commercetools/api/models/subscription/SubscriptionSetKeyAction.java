
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetKeyAction subscriptionSetKeyAction = SubscriptionSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SubscriptionSetKeyActionImpl.class)
public interface SubscriptionSetKeyAction extends SubscriptionUpdateAction {

    /**
     * discriminator value for SubscriptionSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of SubscriptionSetKeyAction
     */
    public static SubscriptionSetKeyAction of() {
        return new SubscriptionSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy SubscriptionSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SubscriptionSetKeyAction of(final SubscriptionSetKeyAction template) {
        SubscriptionSetKeyActionImpl instance = new SubscriptionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public SubscriptionSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of SubscriptionSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubscriptionSetKeyAction deepCopy(@Nullable final SubscriptionSetKeyAction template) {
        if (template == null) {
            return null;
        }
        SubscriptionSetKeyActionImpl instance = new SubscriptionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for SubscriptionSetKeyAction
     * @return builder
     */
    public static SubscriptionSetKeyActionBuilder builder() {
        return SubscriptionSetKeyActionBuilder.of();
    }

    /**
     * create builder for SubscriptionSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetKeyActionBuilder builder(final SubscriptionSetKeyAction template) {
        return SubscriptionSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionSetKeyAction(Function<SubscriptionSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionSetKeyAction>";
            }
        };
    }
}
