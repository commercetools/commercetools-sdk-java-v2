
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddOrderLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddOrderLineItemChange addOrderLineItemChange = AddOrderLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddOrderLineItemChangeBuilder implements Builder<AddOrderLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddOrderLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddOrderLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddOrderLineItemChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItem> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddOrderLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddOrderLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddOrderLineItemChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItem> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddOrderLineItemChangeBuilder nextValue(final com.commercetools.history.models.common.LineItem nextValue) {
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

    public com.commercetools.history.models.common.LineItem getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.LineItem getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddOrderLineItemChange with checking for non-null required values
     * @return AddOrderLineItemChange
     */
    public AddOrderLineItemChange build() {
        Objects.requireNonNull(change, AddOrderLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddOrderLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddOrderLineItemChange.class + ": nextValue is missing");
        return new AddOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddOrderLineItemChange without checking for non-null required values
     * @return AddOrderLineItemChange
     */
    public AddOrderLineItemChange buildUnchecked() {
        return new AddOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of AddOrderLineItemChangeBuilder
     * @return builder
     */
    public static AddOrderLineItemChangeBuilder of() {
        return new AddOrderLineItemChangeBuilder();
    }

    /**
     * create builder for AddOrderLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddOrderLineItemChangeBuilder of(final AddOrderLineItemChange template) {
        AddOrderLineItemChangeBuilder builder = new AddOrderLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
