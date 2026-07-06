
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

    private com.commercetools.history.models.common.ShoppingListLineItem previousValue;

    private com.commercetools.history.models.common.ShoppingListLineItem nextValue;

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
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder previousValue(
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

    public RemoveShoppingListLineItemChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ShoppingListLineItemBuilder, com.commercetools.history.models.common.ShoppingListLineItem> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShoppingListLineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.ShoppingListLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder nextValue(
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

    public RemoveShoppingListLineItemChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ShoppingListLineItemBuilder, com.commercetools.history.models.common.ShoppingListLineItem> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShoppingListLineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveShoppingListLineItemChangeBuilder nextValue(
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
