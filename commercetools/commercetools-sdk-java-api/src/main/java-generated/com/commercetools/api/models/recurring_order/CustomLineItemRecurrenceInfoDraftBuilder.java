
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemRecurrenceInfoDraftBuilder
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
public class CustomLineItemRecurrenceInfoDraftBuilder implements Builder<CustomLineItemRecurrenceInfoDraft> {

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a RecurrencePolicy.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public CustomLineItemRecurrenceInfoDraftBuilder recurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a RecurrencePolicy.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public CustomLineItemRecurrenceInfoDraftBuilder withRecurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a RecurrencePolicy.</p>
     * @param recurrencePolicy value to be set
     * @return Builder
     */

    public CustomLineItemRecurrenceInfoDraftBuilder recurrencePolicy(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a RecurrencePolicy.</p>
     * @return recurrencePolicy
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     * builds CustomLineItemRecurrenceInfoDraft with checking for non-null required values
     * @return CustomLineItemRecurrenceInfoDraft
     */
    public CustomLineItemRecurrenceInfoDraft build() {
        Objects.requireNonNull(recurrencePolicy,
            CustomLineItemRecurrenceInfoDraft.class + ": recurrencePolicy is missing");
        return new CustomLineItemRecurrenceInfoDraftImpl(recurrencePolicy);
    }

    /**
     * builds CustomLineItemRecurrenceInfoDraft without checking for non-null required values
     * @return CustomLineItemRecurrenceInfoDraft
     */
    public CustomLineItemRecurrenceInfoDraft buildUnchecked() {
        return new CustomLineItemRecurrenceInfoDraftImpl(recurrencePolicy);
    }

    /**
     * factory method for an instance of CustomLineItemRecurrenceInfoDraftBuilder
     * @return builder
     */
    public static CustomLineItemRecurrenceInfoDraftBuilder of() {
        return new CustomLineItemRecurrenceInfoDraftBuilder();
    }

    /**
     * create builder for CustomLineItemRecurrenceInfoDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemRecurrenceInfoDraftBuilder of(final CustomLineItemRecurrenceInfoDraft template) {
        CustomLineItemRecurrenceInfoDraftBuilder builder = new CustomLineItemRecurrenceInfoDraftBuilder();
        builder.recurrencePolicy = template.getRecurrencePolicy();
        return builder;
    }

}
