
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLineItemPriceRoundingModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemPriceRoundingModeChange changeLineItemPriceRoundingModeChange = ChangeLineItemPriceRoundingModeChange.builder()
 *             .change("{change}")
 *             .variant("{variant}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .previousValue(RoundingMode.HALF_EVEN)
 *             .nextValue(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLineItemPriceRoundingModeChangeBuilder implements Builder<ChangeLineItemPriceRoundingModeChange> {

    private String change;

    private String variant;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private com.commercetools.history.models.common.RoundingMode previousValue;

    private com.commercetools.history.models.common.RoundingMode nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeLineItemPriceRoundingModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public ChangeLineItemPriceRoundingModeChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ChangeLineItemPriceRoundingModeChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ChangeLineItemPriceRoundingModeChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public ChangeLineItemPriceRoundingModeChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ChangeLineItemPriceRoundingModeChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLineItemPriceRoundingModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.RoundingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLineItemPriceRoundingModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.RoundingMode nextValue) {
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
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @return lineItem
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.RoundingMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.RoundingMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeLineItemPriceRoundingModeChange with checking for non-null required values
     * @return ChangeLineItemPriceRoundingModeChange
     */
    public ChangeLineItemPriceRoundingModeChange build() {
        Objects.requireNonNull(change, ChangeLineItemPriceRoundingModeChange.class + ": change is missing");
        Objects.requireNonNull(variant, ChangeLineItemPriceRoundingModeChange.class + ": variant is missing");
        Objects.requireNonNull(lineItem, ChangeLineItemPriceRoundingModeChange.class + ": lineItem is missing");
        Objects.requireNonNull(lineItemId, ChangeLineItemPriceRoundingModeChange.class + ": lineItemId is missing");
        Objects.requireNonNull(previousValue,
            ChangeLineItemPriceRoundingModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLineItemPriceRoundingModeChange.class + ": nextValue is missing");
        return new ChangeLineItemPriceRoundingModeChangeImpl(change, variant, lineItem, lineItemId, previousValue,
            nextValue);
    }

    /**
     * builds ChangeLineItemPriceRoundingModeChange without checking for non-null required values
     * @return ChangeLineItemPriceRoundingModeChange
     */
    public ChangeLineItemPriceRoundingModeChange buildUnchecked() {
        return new ChangeLineItemPriceRoundingModeChangeImpl(change, variant, lineItem, lineItemId, previousValue,
            nextValue);
    }

    /**
     * factory method for an instance of ChangeLineItemPriceRoundingModeChangeBuilder
     * @return builder
     */
    public static ChangeLineItemPriceRoundingModeChangeBuilder of() {
        return new ChangeLineItemPriceRoundingModeChangeBuilder();
    }

    /**
     * create builder for ChangeLineItemPriceRoundingModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemPriceRoundingModeChangeBuilder of(
            final ChangeLineItemPriceRoundingModeChange template) {
        ChangeLineItemPriceRoundingModeChangeBuilder builder = new ChangeLineItemPriceRoundingModeChangeBuilder();
        builder.change = template.getChange();
        builder.variant = template.getVariant();
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
