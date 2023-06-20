
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemShippingDetailsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemShippingDetailsChange setLineItemShippingDetailsChange = SetLineItemShippingDetailsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemShippingDetailsChangeBuilder implements Builder<SetLineItemShippingDetailsChange> {

    private String change;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private String lineItemId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemShippingDetailsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemShippingDetailsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemShippingDetailsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetails> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemShippingDetailsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemShippingDetailsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemShippingDetailsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetails> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemShippingDetailsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemShippingDetails nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated LineItem.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public SetLineItemShippingDetailsChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.ItemShippingDetails getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ItemShippingDetails getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the updated LineItem.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     * builds SetLineItemShippingDetailsChange with checking for non-null required values
     * @return SetLineItemShippingDetailsChange
     */
    public SetLineItemShippingDetailsChange build() {
        Objects.requireNonNull(change, SetLineItemShippingDetailsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLineItemShippingDetailsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLineItemShippingDetailsChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItemId, SetLineItemShippingDetailsChange.class + ": lineItemId is missing");
        return new SetLineItemShippingDetailsChangeImpl(change, previousValue, nextValue, lineItemId);
    }

    /**
     * builds SetLineItemShippingDetailsChange without checking for non-null required values
     * @return SetLineItemShippingDetailsChange
     */
    public SetLineItemShippingDetailsChange buildUnchecked() {
        return new SetLineItemShippingDetailsChangeImpl(change, previousValue, nextValue, lineItemId);
    }

    /**
     * factory method for an instance of SetLineItemShippingDetailsChangeBuilder
     * @return builder
     */
    public static SetLineItemShippingDetailsChangeBuilder of() {
        return new SetLineItemShippingDetailsChangeBuilder();
    }

    /**
     * create builder for SetLineItemShippingDetailsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemShippingDetailsChangeBuilder of(final SetLineItemShippingDetailsChange template) {
        SetLineItemShippingDetailsChangeBuilder builder = new SetLineItemShippingDetailsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItemId = template.getLineItemId();
        return builder;
    }

}
