
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveOrderLineItemChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveOrderLineItemChange removeOrderLineItemChange = RemoveOrderLineItemChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveOrderLineItemChangeBuilder implements Builder<RemoveOrderLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.LineItem previousValue;

    private com.commercetools.history.models.common.LineItem nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveOrderLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveOrderLineItemChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveOrderLineItemChangeBuilder previousValue(
            final com.commercetools.history.models.common.LineItem previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveOrderLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LineItemBuilder, com.commercetools.history.models.common.LineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LineItemBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveOrderLineItemChangeBuilder nextValue(
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
     * builds RemoveOrderLineItemChange with checking for non-null required values
     * @return RemoveOrderLineItemChange
     */
    public RemoveOrderLineItemChange build() {
        Objects.requireNonNull(change, RemoveOrderLineItemChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveOrderLineItemChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveOrderLineItemChange.class + ": nextValue is missing");
        return new RemoveOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveOrderLineItemChange without checking for non-null required values
     * @return RemoveOrderLineItemChange
     */
    public RemoveOrderLineItemChange buildUnchecked() {
        return new RemoveOrderLineItemChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveOrderLineItemChangeBuilder
     * @return builder
     */
    public static RemoveOrderLineItemChangeBuilder of() {
        return new RemoveOrderLineItemChangeBuilder();
    }

    /**
     * create builder for RemoveOrderLineItemChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveOrderLineItemChangeBuilder of(final RemoveOrderLineItemChange template) {
        RemoveOrderLineItemChangeBuilder builder = new RemoveOrderLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
