
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomLineItemDiscountedPricePerQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomLineItemDiscountedPricePerQuantityChange setCustomLineItemDiscountedPricePerQuantityChange = SetCustomLineItemDiscountedPricePerQuantityChange.builder()
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
public class SetCustomLineItemDiscountedPricePerQuantityChangeBuilder
        implements Builder<SetCustomLineItemDiscountedPricePerQuantityChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder customLineItem(
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

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder withCustomLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomLineItemDiscountedPricePerQuantityChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue) {
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

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetCustomLineItemDiscountedPricePerQuantityChange with checking for non-null required values
     * @return SetCustomLineItemDiscountedPricePerQuantityChange
     */
    public SetCustomLineItemDiscountedPricePerQuantityChange build() {
        Objects.requireNonNull(change, SetCustomLineItemDiscountedPricePerQuantityChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem,
            SetCustomLineItemDiscountedPricePerQuantityChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetCustomLineItemDiscountedPricePerQuantityChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(previousValue,
            SetCustomLineItemDiscountedPricePerQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue,
            SetCustomLineItemDiscountedPricePerQuantityChange.class + ": nextValue is missing");
        return new SetCustomLineItemDiscountedPricePerQuantityChangeImpl(change, customLineItem, customLineItemId,
            previousValue, nextValue);
    }

    /**
     * builds SetCustomLineItemDiscountedPricePerQuantityChange without checking for non-null required values
     * @return SetCustomLineItemDiscountedPricePerQuantityChange
     */
    public SetCustomLineItemDiscountedPricePerQuantityChange buildUnchecked() {
        return new SetCustomLineItemDiscountedPricePerQuantityChangeImpl(change, customLineItem, customLineItemId,
            previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCustomLineItemDiscountedPricePerQuantityChangeBuilder
     * @return builder
     */
    public static SetCustomLineItemDiscountedPricePerQuantityChangeBuilder of() {
        return new SetCustomLineItemDiscountedPricePerQuantityChangeBuilder();
    }

    /**
     * create builder for SetCustomLineItemDiscountedPricePerQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomLineItemDiscountedPricePerQuantityChangeBuilder of(
            final SetCustomLineItemDiscountedPricePerQuantityChange template) {
        SetCustomLineItemDiscountedPricePerQuantityChangeBuilder builder = new SetCustomLineItemDiscountedPricePerQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
