
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddCustomLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddCustomLineItemChange addCustomLineItemChange = AddCustomLineItemChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddCustomLineItemChangeBuilder implements Builder<AddCustomLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.CustomLineItem nextValue;

    private com.commercetools.history.models.common.CustomLineItem previousValue;

    /**
     *  <p>Update action for adding and removing custom line items</p>
     * @param change value to be set
     * @return Builder
     */

    public AddCustomLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddCustomLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddCustomLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomLineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddCustomLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomLineItemBuilder, com.commercetools.history.models.common.CustomLineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public AddCustomLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomLineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for adding and removing custom line items</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomLineItem getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.CustomLineItem getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds AddCustomLineItemChange with checking for non-null required values
     * @return AddCustomLineItemChange
     */
    public AddCustomLineItemChange build() {
        Objects.requireNonNull(change, AddCustomLineItemChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddCustomLineItemChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddCustomLineItemChange.class + ": previousValue is missing");
        return new AddCustomLineItemChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddCustomLineItemChange without checking for non-null required values
     * @return AddCustomLineItemChange
     */
    public AddCustomLineItemChange buildUnchecked() {
        return new AddCustomLineItemChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of AddCustomLineItemChangeBuilder
     * @return builder
     */
    public static AddCustomLineItemChangeBuilder of() {
        return new AddCustomLineItemChangeBuilder();
    }

    /**
     * create builder for AddCustomLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddCustomLineItemChangeBuilder of(final AddCustomLineItemChange template) {
        AddCustomLineItemChangeBuilder builder = new AddCustomLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
