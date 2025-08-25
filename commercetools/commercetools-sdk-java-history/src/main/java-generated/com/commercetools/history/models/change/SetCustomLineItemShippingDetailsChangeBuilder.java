
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemShippingDetailsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemShippingDetailsChange setCustomLineItemShippingDetailsChange = SetCustomLineItemShippingDetailsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemShippingDetailsChangeBuilder implements Builder<SetCustomLineItemShippingDetailsChange> {

    private String change;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private String customLineItemId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder previousValue(
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

    public SetCustomLineItemShippingDetailsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetails> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetails> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemShippingDetails nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * builds SetCustomLineItemShippingDetailsChange with checking for non-null required values
     * @return SetCustomLineItemShippingDetailsChange
     */
    public SetCustomLineItemShippingDetailsChange build() {
        Objects.requireNonNull(change, SetCustomLineItemShippingDetailsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            SetCustomLineItemShippingDetailsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemShippingDetailsChange.class + ": nextValue is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemShippingDetailsChange.class + ": customLineItemId is missing");
        return new SetCustomLineItemShippingDetailsChangeImpl(change, previousValue, nextValue, customLineItemId);
    }

    /**
     * builds SetCustomLineItemShippingDetailsChange without checking for non-null required values
     * @return SetCustomLineItemShippingDetailsChange
     */
    public SetCustomLineItemShippingDetailsChange buildUnchecked() {
        return new SetCustomLineItemShippingDetailsChangeImpl(change, previousValue, nextValue, customLineItemId);
    }

    /**
     * factory method for an instance of SetCustomLineItemShippingDetailsChangeBuilder
     * @return builder
     */
    public static SetCustomLineItemShippingDetailsChangeBuilder of() {
        return new SetCustomLineItemShippingDetailsChangeBuilder();
    }

    /**
     * create builder for SetCustomLineItemShippingDetailsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemShippingDetailsChangeBuilder of(
            final SetCustomLineItemShippingDetailsChange template) {
        SetCustomLineItemShippingDetailsChangeBuilder builder = new SetCustomLineItemShippingDetailsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
