
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemTotalPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemTotalPriceChange setCustomLineItemTotalPriceChange = SetCustomLineItemTotalPriceChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemTotalPriceChangeBuilder implements Builder<SetCustomLineItemTotalPriceChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    /**
     *  <p>Update action for <code>setCustomLineItemTotalPrice</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetCustomLineItemTotalPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the customLineItem using the builder function
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetCustomLineItemTotalPriceChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the customLineItem
     * @param customLineItem value to be set
     * @return Builder
     */

    public SetCustomLineItemTotalPriceChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     * set the value to the customLineItemId
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetCustomLineItemTotalPriceChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemTotalPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomLineItemTotalPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomLineItemTotalPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomLineItemTotalPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setCustomLineItemTotalPrice</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of customLineItem}
     * @return customLineItem
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
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

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetCustomLineItemTotalPriceChange with checking for non-null required values
     * @return SetCustomLineItemTotalPriceChange
     */
    public SetCustomLineItemTotalPriceChange build() {
        Objects.requireNonNull(change, SetCustomLineItemTotalPriceChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem, SetCustomLineItemTotalPriceChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemTotalPriceChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemTotalPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemTotalPriceChange.class + ": previousValue is missing");
        return new SetCustomLineItemTotalPriceChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    /**
     * builds SetCustomLineItemTotalPriceChange without checking for non-null required values
     * @return SetCustomLineItemTotalPriceChange
     */
    public SetCustomLineItemTotalPriceChange buildUnchecked() {
        return new SetCustomLineItemTotalPriceChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    /**
     * factory method for an instance of SetCustomLineItemTotalPriceChangeBuilder
     * @return builder
     */
    public static SetCustomLineItemTotalPriceChangeBuilder of() {
        return new SetCustomLineItemTotalPriceChangeBuilder();
    }

    /**
     * create builder for SetCustomLineItemTotalPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemTotalPriceChangeBuilder of(final SetCustomLineItemTotalPriceChange template) {
        SetCustomLineItemTotalPriceChangeBuilder builder = new SetCustomLineItemTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
