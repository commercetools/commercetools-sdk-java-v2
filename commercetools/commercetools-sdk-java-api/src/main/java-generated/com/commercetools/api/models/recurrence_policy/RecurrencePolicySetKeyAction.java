
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicySetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetKeyAction recurrencePolicySetKeyAction = RecurrencePolicySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurrencePolicySetKeyActionImpl.class)
public interface RecurrencePolicySetKeyAction extends RecurrencePolicyUpdateAction {

    /**
     * discriminator value for RecurrencePolicySetKeyAction
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
     * @return instance of RecurrencePolicySetKeyAction
     */
    public static RecurrencePolicySetKeyAction of() {
        return new RecurrencePolicySetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicySetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicySetKeyAction of(final RecurrencePolicySetKeyAction template) {
        RecurrencePolicySetKeyActionImpl instance = new RecurrencePolicySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public RecurrencePolicySetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicySetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicySetKeyAction deepCopy(@Nullable final RecurrencePolicySetKeyAction template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicySetKeyActionImpl instance = new RecurrencePolicySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicySetKeyAction
     * @return builder
     */
    public static RecurrencePolicySetKeyActionBuilder builder() {
        return RecurrencePolicySetKeyActionBuilder.of();
    }

    /**
     * create builder for RecurrencePolicySetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetKeyActionBuilder builder(final RecurrencePolicySetKeyAction template) {
        return RecurrencePolicySetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicySetKeyAction(Function<RecurrencePolicySetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicySetKeyAction>";
            }
        };
    }
}
