
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Cart Discounts are applied to recurring Orders that match the Recurrence Policies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicableRecurrencePolicies applicableRecurrencePolicies = ApplicableRecurrencePolicies.builder()
 *             .plusRecurrencePolicies(recurrencePoliciesBuilder -> recurrencePoliciesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApplicableRecurrencePolicies")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicableRecurrencePoliciesImpl.class)
public interface ApplicableRecurrencePolicies extends RecurringOrderScope {

    /**
     * discriminator value for ApplicableRecurrencePolicies
     */
    String APPLICABLE_RECURRENCE_POLICIES = "ApplicableRecurrencePolicies";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @return recurrencePolicies
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicies")
    public List<RecurrencePolicyReference> getRecurrencePolicies();

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param recurrencePolicies values to be set
     */

    @JsonIgnore
    public void setRecurrencePolicies(final RecurrencePolicyReference... recurrencePolicies);

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param recurrencePolicies values to be set
     */

    public void setRecurrencePolicies(final List<RecurrencePolicyReference> recurrencePolicies);

    /**
     * factory method
     * @return instance of ApplicableRecurrencePolicies
     */
    public static ApplicableRecurrencePolicies of() {
        return new ApplicableRecurrencePoliciesImpl();
    }

    /**
     * factory method to create a shallow copy ApplicableRecurrencePolicies
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicableRecurrencePolicies of(final ApplicableRecurrencePolicies template) {
        ApplicableRecurrencePoliciesImpl instance = new ApplicableRecurrencePoliciesImpl();
        instance.setRecurrencePolicies(template.getRecurrencePolicies());
        return instance;
    }

    public ApplicableRecurrencePolicies copyDeep();

    /**
     * factory method to create a deep copy of ApplicableRecurrencePolicies
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicableRecurrencePolicies deepCopy(@Nullable final ApplicableRecurrencePolicies template) {
        if (template == null) {
            return null;
        }
        ApplicableRecurrencePoliciesImpl instance = new ApplicableRecurrencePoliciesImpl();
        instance.setRecurrencePolicies(Optional.ofNullable(template.getRecurrencePolicies())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApplicableRecurrencePolicies
     * @return builder
     */
    public static ApplicableRecurrencePoliciesBuilder builder() {
        return ApplicableRecurrencePoliciesBuilder.of();
    }

    /**
     * create builder for ApplicableRecurrencePolicies instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicableRecurrencePoliciesBuilder builder(final ApplicableRecurrencePolicies template) {
        return ApplicableRecurrencePoliciesBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicableRecurrencePolicies(Function<ApplicableRecurrencePolicies, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicableRecurrencePolicies> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicableRecurrencePolicies>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicableRecurrencePolicies>";
            }
        };
    }
}
