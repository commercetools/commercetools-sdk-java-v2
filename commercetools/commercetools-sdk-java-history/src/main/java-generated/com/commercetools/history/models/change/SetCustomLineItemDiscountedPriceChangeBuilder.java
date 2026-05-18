
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemDiscountedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemDiscountedPriceChange setCustomLineItemDiscountedPriceChange = SetCustomLineItemDiscountedPriceChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemDiscountedPriceChangeBuilder implements Builder<SetCustomLineItemDiscountedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.DiscountedLineItemPrice previousValue;

    private com.commercetools.history.models.common.DiscountedLineItemPrice nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder withCustomLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceBuilder, com.commercetools.history.models.common.DiscountedLineItemPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.DiscountedLineItemPriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPrice nextValue) {
        this.nextValue = nextValue;
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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItem
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.DiscountedLineItemPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.DiscountedLineItemPrice getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetCustomLineItemDiscountedPriceChange with checking for non-null required values
     * @return SetCustomLineItemDiscountedPriceChange
     */
    public SetCustomLineItemDiscountedPriceChange build() {
        Objects.requireNonNull(change, SetCustomLineItemDiscountedPriceChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem,
            SetCustomLineItemDiscountedPriceChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemDiscountedPriceChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(previousValue,
            SetCustomLineItemDiscountedPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemDiscountedPriceChange.class + ": nextValue is missing");
        return new SetCustomLineItemDiscountedPriceChangeImpl(change, customLineItem, customLineItemId, previousValue,
            nextValue);
    }

    /**
     * builds SetCustomLineItemDiscountedPriceChange without checking for non-null required values
     * @return SetCustomLineItemDiscountedPriceChange
     */
    public SetCustomLineItemDiscountedPriceChange buildUnchecked() {
        return new SetCustomLineItemDiscountedPriceChangeImpl(change, customLineItem, customLineItemId, previousValue,
            nextValue);
    }

    /**
     * factory method for an instance of SetCustomLineItemDiscountedPriceChangeBuilder
     * @return builder
     */
    public static SetCustomLineItemDiscountedPriceChangeBuilder of() {
        return new SetCustomLineItemDiscountedPriceChangeBuilder();
    }

    /**
     * create builder for SetCustomLineItemDiscountedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemDiscountedPriceChangeBuilder of(
            final SetCustomLineItemDiscountedPriceChange template) {
        SetCustomLineItemDiscountedPriceChangeBuilder builder = new SetCustomLineItemDiscountedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
