
package com.commercetools.api.models.recurring_order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * LineItemRecurrenceInfoBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemRecurrenceInfo lineItemRecurrenceInfo = LineItemRecurrenceInfo.builder()
 *             .recurrencePolicy(recurrencePolicyBuilder -> recurrencePolicyBuilder)
 *             .priceSelectionMode(PriceSelectionMode.FIXED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemRecurrenceInfoBuilder implements Builder<LineItemRecurrenceInfo> {

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy;

    private com.commercetools.api.models.recurring_order.PriceSelectionMode priceSelectionMode;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public LineItemRecurrenceInfoBuilder recurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @param builder function to build the recurrencePolicy value
     * @return Builder
     */

    public LineItemRecurrenceInfoBuilder withRecurrencePolicy(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder, com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference> builder) {
        this.recurrencePolicy = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @param recurrencePolicy value to be set
     * @return Builder
     */

    public LineItemRecurrenceInfoBuilder recurrencePolicy(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     *  <p>Indicates how the price of a line item will be selected during order creation.</p>
     * @param priceSelectionMode value to be set
     * @return Builder
     */

    public LineItemRecurrenceInfoBuilder priceSelectionMode(
            final com.commercetools.api.models.recurring_order.PriceSelectionMode priceSelectionMode) {
        this.priceSelectionMode = priceSelectionMode;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     * @return recurrencePolicy
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyReference getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     *  <p>Indicates how the price of a line item will be selected during order creation.</p>
     * @return priceSelectionMode
     */

    public com.commercetools.api.models.recurring_order.PriceSelectionMode getPriceSelectionMode() {
        return this.priceSelectionMode;
    }

    /**
     * builds LineItemRecurrenceInfo with checking for non-null required values
     * @return LineItemRecurrenceInfo
     */
    public LineItemRecurrenceInfo build() {
        Objects.requireNonNull(recurrencePolicy, LineItemRecurrenceInfo.class + ": recurrencePolicy is missing");
        Objects.requireNonNull(priceSelectionMode, LineItemRecurrenceInfo.class + ": priceSelectionMode is missing");
        return new LineItemRecurrenceInfoImpl(recurrencePolicy, priceSelectionMode);
    }

    /**
     * builds LineItemRecurrenceInfo without checking for non-null required values
     * @return LineItemRecurrenceInfo
     */
    public LineItemRecurrenceInfo buildUnchecked() {
        return new LineItemRecurrenceInfoImpl(recurrencePolicy, priceSelectionMode);
    }

    /**
     * factory method for an instance of LineItemRecurrenceInfoBuilder
     * @return builder
     */
    public static LineItemRecurrenceInfoBuilder of() {
        return new LineItemRecurrenceInfoBuilder();
    }

    /**
     * create builder for LineItemRecurrenceInfo instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemRecurrenceInfoBuilder of(final LineItemRecurrenceInfo template) {
        LineItemRecurrenceInfoBuilder builder = new LineItemRecurrenceInfoBuilder();
        builder.recurrencePolicy = template.getRecurrencePolicy();
        builder.priceSelectionMode = template.getPriceSelectionMode();
        return builder;
    }

}
