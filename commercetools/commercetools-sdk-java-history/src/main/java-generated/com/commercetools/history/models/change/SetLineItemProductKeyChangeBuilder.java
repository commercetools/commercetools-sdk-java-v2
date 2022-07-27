
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
     */

    public SetLineItemProductKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetLineItemProductKeyChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public SetLineItemProductKeyChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *
     */

    public SetLineItemProductKeyChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *
     */

    public SetLineItemProductKeyChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *
     */

    public SetLineItemProductKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetLineItemProductKeyChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getVariant() {
        return this.variant;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

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
     * builds SetLineItemProductKeyChange without checking for non null required values
     */
    public SetLineItemProductKeyChange buildUnchecked() {
        return new SetLineItemProductKeyChangeImpl(change, lineItem, lineItemId, variant, previousValue, nextValue);
    }

    public static SetLineItemProductKeyChangeBuilder of() {
        return new SetLineItemProductKeyChangeBuilder();
    }

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
