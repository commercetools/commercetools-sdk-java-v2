
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

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

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
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddShoppingListLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.LineItem nextValue) {
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
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.LineItem getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.LineItem getNextValue() {
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
