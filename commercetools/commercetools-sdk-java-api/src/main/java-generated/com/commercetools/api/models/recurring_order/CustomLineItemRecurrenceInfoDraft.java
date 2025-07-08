
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier;
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
 *     CustomLineItemRecurrenceInfoDraft customLineItemRecurrenceInfoDraft = CustomLineItemRecurrenceInfoDraft.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomLineItemRecurrenceInfoDraftImpl.class)
public interface CustomLineItemRecurrenceInfoDraft
        extends io.vrap.rmf.base.client.Draft<CustomLineItemRecurrenceInfoDraft> {

    /**
     *  <p>ResourceIdentifier to a RecurrencePolicy.</p>
     * @return recurrencePolicy
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicy")
    public RecurrencePolicyResourceIdentifier getRecurrencePolicy();

    /**
     *  <p>ResourceIdentifier to a RecurrencePolicy.</p>
     * @param recurrencePolicy value to be set
     */

    public void setRecurrencePolicy(final RecurrencePolicyResourceIdentifier recurrencePolicy);

    /**
     * factory method
     * @return instance of CustomLineItemRecurrenceInfoDraft
     */
    public static CustomLineItemRecurrenceInfoDraft of() {
        return new CustomLineItemRecurrenceInfoDraftImpl();
    }

    /**
     * factory method to create a shallow copy CustomLineItemRecurrenceInfoDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomLineItemRecurrenceInfoDraft of(final CustomLineItemRecurrenceInfoDraft template) {
        CustomLineItemRecurrenceInfoDraftImpl instance = new CustomLineItemRecurrenceInfoDraftImpl();
        instance.setRecurrencePolicy(template.getRecurrencePolicy());
        return instance;
    }

    public CustomLineItemRecurrenceInfoDraft copyDeep();

    /**
     * factory method to create a deep copy of CustomLineItemRecurrenceInfoDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomLineItemRecurrenceInfoDraft deepCopy(
            @Nullable final CustomLineItemRecurrenceInfoDraft template) {
        if (template == null) {
            return null;
        }
        CustomLineItemRecurrenceInfoDraftImpl instance = new CustomLineItemRecurrenceInfoDraftImpl();
        instance.setRecurrencePolicy(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier
                .deepCopy(template.getRecurrencePolicy()));
        return instance;
    }

    /**
     * builder factory method for CustomLineItemRecurrenceInfoDraft
     * @return builder
     */
    public static CustomLineItemRecurrenceInfoDraftBuilder builder() {
        return CustomLineItemRecurrenceInfoDraftBuilder.of();
    }

    /**
     * create builder for CustomLineItemRecurrenceInfoDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemRecurrenceInfoDraftBuilder builder(final CustomLineItemRecurrenceInfoDraft template) {
        return CustomLineItemRecurrenceInfoDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomLineItemRecurrenceInfoDraft(Function<CustomLineItemRecurrenceInfoDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomLineItemRecurrenceInfoDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomLineItemRecurrenceInfoDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomLineItemRecurrenceInfoDraft>";
            }
        };
    }
}
