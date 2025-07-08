
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
 * RecurrencePolicySetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicySetDescriptionAction recurrencePolicySetDescriptionAction = RecurrencePolicySetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurrencePolicySetDescriptionActionImpl.class)
public interface RecurrencePolicySetDescriptionAction extends RecurrencePolicyUpdateAction {

    /**
     * discriminator value for RecurrencePolicySetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of RecurrencePolicySetDescriptionAction
     */
    public static RecurrencePolicySetDescriptionAction of() {
        return new RecurrencePolicySetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicySetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicySetDescriptionAction of(final RecurrencePolicySetDescriptionAction template) {
        RecurrencePolicySetDescriptionActionImpl instance = new RecurrencePolicySetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public RecurrencePolicySetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicySetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicySetDescriptionAction deepCopy(
            @Nullable final RecurrencePolicySetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicySetDescriptionActionImpl instance = new RecurrencePolicySetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicySetDescriptionAction
     * @return builder
     */
    public static RecurrencePolicySetDescriptionActionBuilder builder() {
        return RecurrencePolicySetDescriptionActionBuilder.of();
    }

    /**
     * create builder for RecurrencePolicySetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicySetDescriptionActionBuilder builder(
            final RecurrencePolicySetDescriptionAction template) {
        return RecurrencePolicySetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicySetDescriptionAction(Function<RecurrencePolicySetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicySetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicySetDescriptionAction>";
            }
        };
    }
}
