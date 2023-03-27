
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
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemShippingDetailsChangeBuilder implements Builder<SetCustomLineItemShippingDetailsChange> {

    private String change;

    private String customLineItemId;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    /**
     *  <p>Update action for <code>setCustomLineItemShippingDetails</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ItemShippingDetailsBuilder, com.commercetools.history.models.common.ItemShippingDetailsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ItemShippingDetailsBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder nextValue(
            final com.commercetools.history.models.common.ItemShippingDetails nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
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
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomLineItemShippingDetailsChangeBuilder previousValue(
            final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setCustomLineItemShippingDetails</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of customLineItemId}
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.ItemShippingDetails getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.ItemShippingDetails getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetCustomLineItemShippingDetailsChange with checking for non-null required values
     * @return SetCustomLineItemShippingDetailsChange
     */
    public SetCustomLineItemShippingDetailsChange build() {
        Objects.requireNonNull(change, SetCustomLineItemShippingDetailsChange.class + ": change is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemShippingDetailsChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemShippingDetailsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue,
            SetCustomLineItemShippingDetailsChange.class + ": previousValue is missing");
        return new SetCustomLineItemShippingDetailsChangeImpl(change, customLineItemId, nextValue, previousValue);
    }

    /**
     * builds SetCustomLineItemShippingDetailsChange without checking for non-null required values
     * @return SetCustomLineItemShippingDetailsChange
     */
    public SetCustomLineItemShippingDetailsChange buildUnchecked() {
        return new SetCustomLineItemShippingDetailsChangeImpl(change, customLineItemId, nextValue, previousValue);
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
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
