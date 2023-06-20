
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
 *             .previousValue(1)
 *             .nextValue(1)
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTextLineItemQuantityChangeBuilder implements Builder<ChangeTextLineItemQuantityChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

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
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
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
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param builder function to build the textLineItem value
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder withTextLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of());
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param textLineItem value to be set
     * @return Builder
     */

    public ChangeTextLineItemQuantityChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @return textLineItem
     */

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    /**
     * builds ChangeTextLineItemQuantityChange with checking for non-null required values
     * @return ChangeTextLineItemQuantityChange
     */
    public ChangeTextLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeTextLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTextLineItemQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTextLineItemQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(textLineItem, ChangeTextLineItemQuantityChange.class + ": textLineItem is missing");
        return new ChangeTextLineItemQuantityChangeImpl(change, previousValue, nextValue, textLineItem);
    }

    /**
     * builds ChangeTextLineItemQuantityChange without checking for non-null required values
     * @return ChangeTextLineItemQuantityChange
     */
    public ChangeTextLineItemQuantityChange buildUnchecked() {
        return new ChangeTextLineItemQuantityChangeImpl(change, previousValue, nextValue, textLineItem);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.textLineItem = template.getTextLineItem();
        return builder;
    }

}
