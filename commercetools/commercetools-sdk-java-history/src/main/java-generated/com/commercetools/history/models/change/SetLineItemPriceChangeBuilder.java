
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemPriceChange setLineItemPriceChange = SetLineItemPriceChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemPriceChangeBuilder implements Builder<SetLineItemPriceChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private com.commercetools.history.models.common.Price nextValue;

    private com.commercetools.history.models.common.Price previousValue;

    /**
     *  <p>Update action for <code>setLineItemPrice</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemPriceChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param lineItem value to be set
     * @return Builder
     */

    public SetLineItemPriceChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Price getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetLineItemPriceChange with checking for non-null required values
     * @return SetLineItemPriceChange
     */
    public SetLineItemPriceChange build() {
        Objects.requireNonNull(change, SetLineItemPriceChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemPriceChange.class + ": lineItem is missing");
        Objects.requireNonNull(nextValue, SetLineItemPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemPriceChange.class + ": previousValue is missing");
        return new SetLineItemPriceChangeImpl(change, lineItem, nextValue, previousValue);
    }

    /**
     * builds SetLineItemPriceChange without checking for non-null required values
     * @return SetLineItemPriceChange
     */
    public SetLineItemPriceChange buildUnchecked() {
        return new SetLineItemPriceChangeImpl(change, lineItem, nextValue, previousValue);
    }

    public static SetLineItemPriceChangeBuilder of() {
        return new SetLineItemPriceChangeBuilder();
    }

    public static SetLineItemPriceChangeBuilder of(final SetLineItemPriceChange template) {
        SetLineItemPriceChangeBuilder builder = new SetLineItemPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
