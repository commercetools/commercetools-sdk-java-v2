
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddShoppingListLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddShoppingListLineItemChange addShoppingListLineItemChange = AddShoppingListLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddShoppingListLineItemChangeBuilder implements Builder<AddShoppingListLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.ShoppingListLineItem previousValue;

    private com.commercetools.history.models.common.ShoppingListLineItem nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ShoppingListLineItemBuilder, com.commercetools.history.models.common.ShoppingListLineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShoppingListLineItemBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ShoppingListLineItemBuilder, com.commercetools.history.models.common.ShoppingListLineItem> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShoppingListLineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.ShoppingListLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ShoppingListLineItemBuilder, com.commercetools.history.models.common.ShoppingListLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShoppingListLineItemBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ShoppingListLineItemBuilder, com.commercetools.history.models.common.ShoppingListLineItem> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShoppingListLineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.ShoppingListLineItem nextValue) {
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.ShoppingListLineItem getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ShoppingListLineItem getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddShoppingListLineItemChange with checking for non-null required values
     * @return AddShoppingListLineItemChange
     */
    public AddShoppingListLineItemChange build() {
        Objects.requireNonNull(change, AddShoppingListLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddShoppingListLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddShoppingListLineItemChange.class + ": nextValue is missing");
        return new AddShoppingListLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddShoppingListLineItemChange without checking for non-null required values
     * @return AddShoppingListLineItemChange
     */
    public AddShoppingListLineItemChange buildUnchecked() {
        return new AddShoppingListLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of AddShoppingListLineItemChangeBuilder
     * @return builder
     */
    public static AddShoppingListLineItemChangeBuilder of() {
        return new AddShoppingListLineItemChangeBuilder();
    }

    /**
     * create builder for AddShoppingListLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddShoppingListLineItemChangeBuilder of(final AddShoppingListLineItemChange template) {
        AddShoppingListLineItemChangeBuilder builder = new AddShoppingListLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
