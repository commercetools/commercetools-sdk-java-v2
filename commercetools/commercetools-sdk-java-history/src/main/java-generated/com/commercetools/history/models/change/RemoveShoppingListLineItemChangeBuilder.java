
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveShoppingListLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveShoppingListLineItemChange removeShoppingListLineItemChange = RemoveShoppingListLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveShoppingListLineItemChangeBuilder implements Builder<RemoveShoppingListLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItem> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItem> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder nextValue(
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
     * builds RemoveShoppingListLineItemChange with checking for non-null required values
     * @return RemoveShoppingListLineItemChange
     */
    public RemoveShoppingListLineItemChange build() {
        Objects.requireNonNull(change, RemoveShoppingListLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveShoppingListLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveShoppingListLineItemChange.class + ": nextValue is missing");
        return new RemoveShoppingListLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveShoppingListLineItemChange without checking for non-null required values
     * @return RemoveShoppingListLineItemChange
     */
    public RemoveShoppingListLineItemChange buildUnchecked() {
        return new RemoveShoppingListLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveShoppingListLineItemChangeBuilder
     * @return builder
     */
    public static RemoveShoppingListLineItemChangeBuilder of() {
        return new RemoveShoppingListLineItemChangeBuilder();
    }

    /**
     * create builder for RemoveShoppingListLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveShoppingListLineItemChangeBuilder of(final RemoveShoppingListLineItemChange template) {
        RemoveShoppingListLineItemChangeBuilder builder = new RemoveShoppingListLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
