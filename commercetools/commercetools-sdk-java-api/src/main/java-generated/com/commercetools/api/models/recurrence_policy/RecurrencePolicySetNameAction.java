
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * RecurrencePolicySetNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetNameAction recurrencePolicySetNameAction = RecurrencePolicySetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurrencePolicySetNameActionImpl.class)
public interface RecurrencePolicySetNameAction extends RecurrencePolicyUpdateAction {

    /**
     * discriminator value for RecurrencePolicySetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of RecurrencePolicySetNameAction
     */
    public static RecurrencePolicySetNameAction of() {
        return new RecurrencePolicySetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicySetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicySetNameAction of(final RecurrencePolicySetNameAction template) {
        RecurrencePolicySetNameActionImpl instance = new RecurrencePolicySetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public RecurrencePolicySetNameAction copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicySetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicySetNameAction deepCopy(@Nullable final RecurrencePolicySetNameAction template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicySetNameActionImpl instance = new RecurrencePolicySetNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicySetNameAction
     * @return builder
     */
    public static RecurrencePolicySetNameActionBuilder builder() {
        return RecurrencePolicySetNameActionBuilder.of();
    }

    /**
     * create builder for RecurrencePolicySetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetNameActionBuilder builder(final RecurrencePolicySetNameAction template) {
        return RecurrencePolicySetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicySetNameAction(Function<RecurrencePolicySetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicySetNameAction>";
            }
        };
    }
}
