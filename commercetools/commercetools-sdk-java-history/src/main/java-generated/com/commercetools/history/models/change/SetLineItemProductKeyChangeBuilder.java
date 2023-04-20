
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
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .variant("{variant}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemProductKeyChangeBuilder implements Builder<SetLineItemProductKeyChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private String variant;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Update action for <code>setLineItemProductKey</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     * set the value to the lineItemId
     * @param lineItemId value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemProductKeyChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setLineItemProductKey</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of lineItem}
     * @return lineItem
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     * value of lineItemId}
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     * value of variant}
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetLineItemProductKeyChange with checking for non-null required values
     * @return SetLineItemProductKeyChange
     */
    public SetLineItemProductKeyChange build() {
        Objects.requireNonNull(change, SetLineItemProductKeyChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemProductKeyChange.class + ": lineItem is missing");
        Objects.requireNonNull(lineItemId, SetLineItemProductKeyChange.class + ": lineItemId is missing");
        Objects.requireNonNull(variant, SetLineItemProductKeyChange.class + ": variant is missing");
        Objects.requireNonNull(previousValue, SetLineItemProductKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLineItemProductKeyChange.class + ": nextValue is missing");
        return new SetLineItemProductKeyChangeImpl(change, lineItem, lineItemId, variant, previousValue, nextValue);
    }

    /**
     * builds SetLineItemProductKeyChange without checking for non-null required values
     * @return SetLineItemProductKeyChange
     */
    public SetLineItemProductKeyChange buildUnchecked() {
        return new SetLineItemProductKeyChangeImpl(change, lineItem, lineItemId, variant, previousValue, nextValue);
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
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        builder.variant = template.getVariant();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
