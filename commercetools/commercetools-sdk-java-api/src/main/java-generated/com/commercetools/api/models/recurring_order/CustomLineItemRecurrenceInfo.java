
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Information about recurring orders and frequencies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemRecurrenceInfo customLineItemRecurrenceInfo = CustomLineItemRecurrenceInfo.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemRecurrenceInfoImpl.class)
public interface CustomLineItemRecurrenceInfo {

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @return recurrencePolicy
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyReference getRecurrencePolicy();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyReference recurrencePolicy);

    /**
     * factory method
     * @return instance of CustomLineItemRecurrenceInfo
     */
    public static CustomLineItemRecurrenceInfo of() {
        return new CustomLineItemRecurrenceInfoImpl();
    }

    /**
     * factory method to create a shallow copy CustomLineItemRecurrenceInfo
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomLineItemRecurrenceInfo of(final CustomLineItemRecurrenceInfo template) {
        CustomLineItemRecurrenceInfoImpl instance = new CustomLineItemRecurrenceInfoImpl();
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        return instance;
    }

    public CustomLineItemRecurrenceInfo copyDeep();

    /**
     * factory method to create a deep copy of CustomLineItemRecurrenceInfo
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItemRecurrenceInfo deepCopy(@Nullable final CustomLineItemRecurrenceInfo template) {
        if (template == null) {
            return null;
        }
        CustomLineItemRecurrenceInfoImpl instance = new CustomLineItemRecurrenceInfoImpl();
        instance.setRecurrencePolicy(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference
                .deepCopy(template.getRecurrencePolicy()));
        return instance;
    }

    /**
     * builder factory method for CustomLineItemRecurrenceInfo
     * @return builder
     */
    public static CustomLineItemRecurrenceInfoBuilder builder() {
        return CustomLineItemRecurrenceInfoBuilder.of();
    }

    /**
     * create builder for CustomLineItemRecurrenceInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemRecurrenceInfoBuilder builder(final CustomLineItemRecurrenceInfo template) {
        return CustomLineItemRecurrenceInfoBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItemRecurrenceInfo(Function<CustomLineItemRecurrenceInfo, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemRecurrenceInfo> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemRecurrenceInfo>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemRecurrenceInfo>";
            }
        };
    }
}
