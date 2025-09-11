
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemProductKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemProductKeyChange setLineItemProductKeyChange = SetLineItemProductKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemProductKeyChangeBuilder implements Builder<SetLineItemProductKeyChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder variant(final String variant) {
        this.variant = variant;
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

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
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
     *  <p><code>sku</code> or <code>key</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     * builds SetLineItemProductKeyChange with checking for non-null required values
     * @return SetLineItemProductKeyChange
     */
    public SetLineItemProductKeyChange build() {
        Objects.requireNonNull(change, SetLineItemProductKeyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLineItemProductKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLineItemProductKeyChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItem, SetLineItemProductKeyChange.class + ": lineItem is missing");
        Objects.requireNonNull(lineItemId, SetLineItemProductKeyChange.class + ": lineItemId is missing");
        Objects.requireNonNull(variant, SetLineItemProductKeyChange.class + ": variant is missing");
        return new SetLineItemProductKeyChangeImpl(change, previousValue, nextValue, lineItem, lineItemId, variant);
    }

    /**
     * builds SetLineItemProductKeyChange without checking for non-null required values
     * @return SetLineItemProductKeyChange
     */
    public SetLineItemProductKeyChange buildUnchecked() {
        return new SetLineItemProductKeyChangeImpl(change, previousValue, nextValue, lineItem, lineItemId, variant);
    }

    /**
     * factory method for an instance of SetLineItemProductKeyChangeBuilder
     * @return builder
     */
    public static SetLineItemProductKeyChangeBuilder of() {
        return new SetLineItemProductKeyChangeBuilder();
    }

    /**
     * create builder for SetLineItemProductKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemProductKeyChangeBuilder of(final SetLineItemProductKeyChange template) {
        SetLineItemProductKeyChangeBuilder builder = new SetLineItemProductKeyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        builder.variant = template.getVariant();
        return builder;
    }

}
