
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTextLineItemQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTextLineItemQuantityChange changeTextLineItemQuantityChange = ChangeTextLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTextLineItemQuantityChangeBuilder implements Builder<ChangeTextLineItemQuantityChange> {

    private String change;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    private Integer previousValue;

    private Integer nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the textLineItem using the builder function
     * @param builder function to build the textLineItem value
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder textLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the textLineItem
     * @param textLineItem value to be set
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
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
     * value of textLineItem}
     * @return textLineItem
     */

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeTextLineItemQuantityChange with checking for non-null required values
     * @return ChangeTextLineItemQuantityChange
     */
    public ChangeTextLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeTextLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(textLineItem, ChangeTextLineItemQuantityChange.class + ": textLineItem is missing");
        Objects.requireNonNull(previousValue, ChangeTextLineItemQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTextLineItemQuantityChange.class + ": nextValue is missing");
        return new ChangeTextLineItemQuantityChangeImpl(change, textLineItem, previousValue, nextValue);
    }

    /**
     * builds ChangeTextLineItemQuantityChange without checking for non-null required values
     * @return ChangeTextLineItemQuantityChange
     */
    public ChangeTextLineItemQuantityChange buildUnchecked() {
        return new ChangeTextLineItemQuantityChangeImpl(change, textLineItem, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeTextLineItemQuantityChangeBuilder
     * @return builder
     */
    public static ChangeTextLineItemQuantityChangeBuilder of() {
        return new ChangeTextLineItemQuantityChangeBuilder();
    }

    /**
     * create builder for ChangeTextLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTextLineItemQuantityChangeBuilder of(final ChangeTextLineItemQuantityChange template) {
        ChangeTextLineItemQuantityChangeBuilder builder = new ChangeTextLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
