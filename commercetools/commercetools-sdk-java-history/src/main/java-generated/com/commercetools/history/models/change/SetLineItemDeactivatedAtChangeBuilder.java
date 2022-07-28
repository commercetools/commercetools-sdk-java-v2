
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDeactivatedAtChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDeactivatedAtChange setLineItemDeactivatedAtChange = SetLineItemDeactivatedAtChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemDeactivatedAtChangeBuilder implements Builder<SetLineItemDeactivatedAtChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Update action for <code>setLineItemDeactivatedAt</code></p>
     */

    public SetLineItemDeactivatedAtChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     */

    public SetLineItemDeactivatedAtChangeBuilder lineItem(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.lineItem = builder
                .apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public SetLineItemDeactivatedAtChangeBuilder lineItem(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *
     */

    public SetLineItemDeactivatedAtChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     */

    public SetLineItemDeactivatedAtChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetLineItemDeactivatedAtChange build() {
        Objects.requireNonNull(change, SetLineItemDeactivatedAtChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemDeactivatedAtChange.class + ": lineItem is missing");
        Objects.requireNonNull(previousValue, SetLineItemDeactivatedAtChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLineItemDeactivatedAtChange.class + ": nextValue is missing");
        return new SetLineItemDeactivatedAtChangeImpl(change, lineItem, previousValue, nextValue);
    }

    /**
     * builds SetLineItemDeactivatedAtChange without checking for non null required values
     */
    public SetLineItemDeactivatedAtChange buildUnchecked() {
        return new SetLineItemDeactivatedAtChangeImpl(change, lineItem, previousValue, nextValue);
    }

    public static SetLineItemDeactivatedAtChangeBuilder of() {
        return new SetLineItemDeactivatedAtChangeBuilder();
    }

    public static SetLineItemDeactivatedAtChangeBuilder of(final SetLineItemDeactivatedAtChange template) {
        SetLineItemDeactivatedAtChangeBuilder builder = new SetLineItemDeactivatedAtChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
