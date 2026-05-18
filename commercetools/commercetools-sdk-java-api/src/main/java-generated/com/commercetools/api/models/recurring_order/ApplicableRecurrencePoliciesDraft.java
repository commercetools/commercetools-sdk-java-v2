
package com.commercetools.api.models.recurring_order;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Applies Cart Discounts to recurring Orders that match the Recurrence Policies.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicableRecurrencePoliciesDraft applicableRecurrencePoliciesDraft = ApplicableRecurrencePoliciesDraft.builder()
 *             .plusRecurrencePolicies(recurrencePoliciesBuilder -> recurrencePoliciesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApplicableRecurrencePolicies")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicableRecurrencePoliciesDraftImpl.class)
public interface ApplicableRecurrencePoliciesDraft
        extends RecurringOrderScopeDraft, io.vrap.rmf.base.client.Draft<ApplicableRecurrencePoliciesDraft> {

    /**
     * discriminator value for ApplicableRecurrencePoliciesDraft
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
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @return recurrencePolicies
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicies")
    public List<RecurrencePolicyResourceIdentifier> getRecurrencePolicies();

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param recurrencePolicies values to be set
     */

    @JsonIgnore
    public void setRecurrencePolicies(final RecurrencePolicyResourceIdentifier... recurrencePolicies);

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param recurrencePolicies values to be set
     */

    public void setRecurrencePolicies(final List<RecurrencePolicyResourceIdentifier> recurrencePolicies);

    /**
     * factory method
     * @return instance of ApplicableRecurrencePoliciesDraft
     */
    public static ApplicableRecurrencePoliciesDraft of() {
        return new ApplicableRecurrencePoliciesDraftImpl();
    }

    /**
     * factory method to create a shallow copy ApplicableRecurrencePoliciesDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicableRecurrencePoliciesDraft of(final ApplicableRecurrencePoliciesDraft template) {
        ApplicableRecurrencePoliciesDraftImpl instance = new ApplicableRecurrencePoliciesDraftImpl();
        instance.setRecurrencePolicies(template.getRecurrencePolicies());
        return instance;
    }

    public ApplicableRecurrencePoliciesDraft copyDeep();

    /**
     * factory method to create a deep copy of ApplicableRecurrencePoliciesDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicableRecurrencePoliciesDraft deepCopy(
            @Nullable final ApplicableRecurrencePoliciesDraft template) {
        if (template == null) {
            return null;
        }
        ApplicableRecurrencePoliciesDraftImpl instance = new ApplicableRecurrencePoliciesDraftImpl();
        instance.setRecurrencePolicies(Optional.ofNullable(template.getRecurrencePolicies())
                .map(t -> t.stream()
                        .map(
                            com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ApplicableRecurrencePoliciesDraft
     * @return builder
     */
    public static ApplicableRecurrencePoliciesDraftBuilder builder() {
        return ApplicableRecurrencePoliciesDraftBuilder.of();
    }

    /**
     * create builder for ApplicableRecurrencePoliciesDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicableRecurrencePoliciesDraftBuilder builder(final ApplicableRecurrencePoliciesDraft template) {
        return ApplicableRecurrencePoliciesDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicableRecurrencePoliciesDraft(Function<ApplicableRecurrencePoliciesDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicableRecurrencePoliciesDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicableRecurrencePoliciesDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicableRecurrencePoliciesDraft>";
            }
        };
    }
}
