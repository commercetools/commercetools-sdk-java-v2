
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLineItemQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemQuantityChange changeLineItemQuantityChange = ChangeLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLineItemQuantityChangeBuilder implements Builder<ChangeLineItemQuantityChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ChangeLineItemQuantityChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ChangeLineItemQuantityChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public ChangeLineItemQuantityChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ChangeLineItemQuantityChangeBuilder lineItemId(final String lineItemId) {
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

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change</p>
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
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
     * builds ChangeLineItemQuantityChange with checking for non-null required values
     * @return ChangeLineItemQuantityChange
     */
    public ChangeLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeLineItemQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLineItemQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItem, ChangeLineItemQuantityChange.class + ": lineItem is missing");
        Objects.requireNonNull(lineItemId, ChangeLineItemQuantityChange.class + ": lineItemId is missing");
        return new ChangeLineItemQuantityChangeImpl(change, previousValue, nextValue, lineItem, lineItemId);
    }

    /**
     * builds ChangeLineItemQuantityChange without checking for non-null required values
     * @return ChangeLineItemQuantityChange
     */
    public ChangeLineItemQuantityChange buildUnchecked() {
        return new ChangeLineItemQuantityChangeImpl(change, previousValue, nextValue, lineItem, lineItemId);
    }

    /**
     * factory method for an instance of ChangeLineItemQuantityChangeBuilder
     * @return builder
     */
    public static ChangeLineItemQuantityChangeBuilder of() {
        return new ChangeLineItemQuantityChangeBuilder();
    }

    /**
     * create builder for ChangeLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemQuantityChangeBuilder of(final ChangeLineItemQuantityChange template) {
        ChangeLineItemQuantityChangeBuilder builder = new ChangeLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        return builder;
    }

}
