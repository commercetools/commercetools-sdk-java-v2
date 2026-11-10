
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicableRecurrencePoliciesBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicableRecurrencePoliciesBuilder implements Builder<ApplicableRecurrencePolicies> {

    private java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference> recurrencePolicies;

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param recurrencePolicies value to be set
     * @return Builder
     */

    public ApplicableRecurrencePoliciesBuilder recurrencePolicies(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference... recurrencePolicies) {
        this.recurrencePolicies = new ArrayList<>(Arrays.asList(recurrencePolicies));
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param recurrencePolicies value to be set
     * @return Builder
     */

    public ApplicableRecurrencePoliciesBuilder recurrencePolicies(
            final java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference> recurrencePolicies) {
        this.recurrencePolicies = recurrencePolicies;
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param recurrencePolicies value to be set
     * @return Builder
     */

    public ApplicableRecurrencePoliciesBuilder plusRecurrencePolicies(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference... recurrencePolicies) {
        if (this.recurrencePolicies == null) {
            this.recurrencePolicies = new ArrayList<>();
        }
        this.recurrencePolicies.addAll(Arrays.asList(recurrencePolicies));
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param builder function to build the recurrencePolicies value
     * @return Builder
     */

    public ApplicableRecurrencePoliciesBuilder plusRecurrencePolicies(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder> builder) {
        if (this.recurrencePolicies == null) {
            this.recurrencePolicies = new ArrayList<>();
        }
        this.recurrencePolicies
                .add(builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param builder function to build the recurrencePolicies value
     * @return Builder
     */

    public ApplicableRecurrencePoliciesBuilder withRecurrencePolicies(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder> builder) {
        this.recurrencePolicies = new ArrayList<>();
        this.recurrencePolicies
                .add(builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder.of())
                        .build());
        return this;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param builder function to build the recurrencePolicies value
     * @return Builder
     */

    public ApplicableRecurrencePoliciesBuilder addRecurrencePolicies(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference> builder) {
        return plusRecurrencePolicies(
            builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder.of()));
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @param builder function to build the recurrencePolicies value
     * @return Builder
     */

    public ApplicableRecurrencePoliciesBuilder setRecurrencePolicies(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference> builder) {
        return recurrencePolicies(
            builder.apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder.of()));
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     * @return recurrencePolicies
     */

    public java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference> getRecurrencePolicies() {
        return this.recurrencePolicies;
    }

    /**
     * builds ApplicableRecurrencePolicies with checking for non-null required values
     * @return ApplicableRecurrencePolicies
     */
    public ApplicableRecurrencePolicies build() {
        Objects.requireNonNull(recurrencePolicies,
            ApplicableRecurrencePolicies.class + ": recurrencePolicies is missing");
        return new ApplicableRecurrencePoliciesImpl(recurrencePolicies);
    }

    /**
     * builds ApplicableRecurrencePolicies without checking for non-null required values
     * @return ApplicableRecurrencePolicies
     */
    public ApplicableRecurrencePolicies buildUnchecked() {
        return new ApplicableRecurrencePoliciesImpl(recurrencePolicies);
    }

    /**
     * factory method for an instance of ApplicableRecurrencePoliciesBuilder
     * @return builder
     */
    public static ApplicableRecurrencePoliciesBuilder of() {
        return new ApplicableRecurrencePoliciesBuilder();
    }

    /**
     * create builder for ApplicableRecurrencePolicies instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicableRecurrencePoliciesBuilder of(final ApplicableRecurrencePolicies template) {
        ApplicableRecurrencePoliciesBuilder builder = new ApplicableRecurrencePoliciesBuilder();
        builder.recurrencePolicies = template.getRecurrencePolicies();
        return builder;
    }

}
