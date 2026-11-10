
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemRecurrenceInfoDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemRecurrenceInfoDraft lineItemRecurrenceInfoDraft = LineItemRecurrenceInfoDraft.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .priceSelectionMode(PriceSelectionMode.FIXED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemRecurrenceInfoDraftBuilder implements Builder<LineItemRecurrenceInfoDraft> {

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy;

    private com.commercetools.api.models.recurring_order.PriceSelectionMode priceSelectionMode;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a RecurrencePolicy.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public LineItemRecurrenceInfoDraftBuilder recurrencePolicy(
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

    public LineItemRecurrenceInfoDraftBuilder withRecurrencePolicy(
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

    public LineItemRecurrenceInfoDraftBuilder recurrencePolicy(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     *  <p>Determines how the price of a line item will be selected during order creation.</p>
     * @param priceSelectionMode value to be set
     * @return Builder
     */

    public LineItemRecurrenceInfoDraftBuilder priceSelectionMode(
            final com.commercetools.api.models.recurring_order.PriceSelectionMode priceSelectionMode) {
        this.priceSelectionMode = priceSelectionMode;
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
     *  <p>Determines how the price of a line item will be selected during order creation.</p>
     * @return priceSelectionMode
     */

    public com.commercetools.api.models.recurring_order.PriceSelectionMode getPriceSelectionMode() {
        return this.priceSelectionMode;
    }

    /**
     * builds LineItemRecurrenceInfoDraft with checking for non-null required values
     * @return LineItemRecurrenceInfoDraft
     */
    public LineItemRecurrenceInfoDraft build() {
        Objects.requireNonNull(recurrencePolicy, LineItemRecurrenceInfoDraft.class + ": recurrencePolicy is missing");
        Objects.requireNonNull(priceSelectionMode,
            LineItemRecurrenceInfoDraft.class + ": priceSelectionMode is missing");
        return new LineItemRecurrenceInfoDraftImpl(recurrencePolicy, priceSelectionMode);
    }

    /**
     * builds LineItemRecurrenceInfoDraft without checking for non-null required values
     * @return LineItemRecurrenceInfoDraft
     */
    public LineItemRecurrenceInfoDraft buildUnchecked() {
        return new LineItemRecurrenceInfoDraftImpl(recurrencePolicy, priceSelectionMode);
    }

    /**
     * factory method for an instance of LineItemRecurrenceInfoDraftBuilder
     * @return builder
     */
    public static LineItemRecurrenceInfoDraftBuilder of() {
        return new LineItemRecurrenceInfoDraftBuilder();
    }

    /**
     * create builder for LineItemRecurrenceInfoDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemRecurrenceInfoDraftBuilder of(final LineItemRecurrenceInfoDraft template) {
        LineItemRecurrenceInfoDraftBuilder builder = new LineItemRecurrenceInfoDraftBuilder();
        builder.recurrencePolicy = template.getRecurrencePolicy();
        builder.priceSelectionMode = template.getPriceSelectionMode();
        return builder;
    }

}
