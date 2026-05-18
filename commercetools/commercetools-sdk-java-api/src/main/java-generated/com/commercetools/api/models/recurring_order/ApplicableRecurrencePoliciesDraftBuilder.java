
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicableRecurrencePoliciesDraftBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicableRecurrencePoliciesDraftBuilder implements Builder<ApplicableRecurrencePoliciesDraft> {

    private java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> recurrencePolicies;

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param recurrencePolicies value to be set
     * @return Builder
     */

    public ApplicableRecurrencePoliciesDraftBuilder recurrencePolicies(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier... recurrencePolicies) {
        this.recurrencePolicies = new ArrayList<>(Arrays.asList(recurrencePolicies));
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param recurrencePolicies value to be set
     * @return Builder
     */

    public ApplicableRecurrencePoliciesDraftBuilder recurrencePolicies(
            final java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> recurrencePolicies) {
        this.recurrencePolicies = recurrencePolicies;
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param recurrencePolicies value to be set
     * @return Builder
     */

    public ApplicableRecurrencePoliciesDraftBuilder plusRecurrencePolicies(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier... recurrencePolicies) {
        if (this.recurrencePolicies == null) {
            this.recurrencePolicies = new ArrayList<>();
        }
        this.recurrencePolicies.addAll(Arrays.asList(recurrencePolicies));
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param builder function to build the recurrencePolicies value
     * @return Builder
     */

    public ApplicableRecurrencePoliciesDraftBuilder plusRecurrencePolicies(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder> builder) {
        if (this.recurrencePolicies == null) {
            this.recurrencePolicies = new ArrayList<>();
        }
        this.recurrencePolicies.add(
            builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param builder function to build the recurrencePolicies value
     * @return Builder
     */

    public ApplicableRecurrencePoliciesDraftBuilder withRecurrencePolicies(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder> builder) {
        this.recurrencePolicies = new ArrayList<>();
        this.recurrencePolicies.add(
            builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param builder function to build the recurrencePolicies value
     * @return Builder
     */

    public ApplicableRecurrencePoliciesDraftBuilder addRecurrencePolicies(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> builder) {
        return plusRecurrencePolicies(builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @param builder function to build the recurrencePolicies value
     * @return Builder
     */

    public ApplicableRecurrencePoliciesDraftBuilder setRecurrencePolicies(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> builder) {
        return recurrencePolicies(builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     * @return recurrencePolicies
     */

    public java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> getRecurrencePolicies() {
        return this.recurrencePolicies;
    }

    /**
     * builds ApplicableRecurrencePoliciesDraft with checking for non-null required values
     * @return ApplicableRecurrencePoliciesDraft
     */
    public ApplicableRecurrencePoliciesDraft build() {
        Objects.requireNonNull(recurrencePolicies,
            ApplicableRecurrencePoliciesDraft.class + ": recurrencePolicies is missing");
        return new ApplicableRecurrencePoliciesDraftImpl(recurrencePolicies);
    }

    /**
     * builds ApplicableRecurrencePoliciesDraft without checking for non-null required values
     * @return ApplicableRecurrencePoliciesDraft
     */
    public ApplicableRecurrencePoliciesDraft buildUnchecked() {
        return new ApplicableRecurrencePoliciesDraftImpl(recurrencePolicies);
    }

    /**
     * factory method for an instance of ApplicableRecurrencePoliciesDraftBuilder
     * @return builder
     */
    public static ApplicableRecurrencePoliciesDraftBuilder of() {
        return new ApplicableRecurrencePoliciesDraftBuilder();
    }

    /**
     * create builder for ApplicableRecurrencePoliciesDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicableRecurrencePoliciesDraftBuilder of(final ApplicableRecurrencePoliciesDraft template) {
        ApplicableRecurrencePoliciesDraftBuilder builder = new ApplicableRecurrencePoliciesDraftBuilder();
        builder.recurrencePolicies = template.getRecurrencePolicies();
        return builder;
    }

}
