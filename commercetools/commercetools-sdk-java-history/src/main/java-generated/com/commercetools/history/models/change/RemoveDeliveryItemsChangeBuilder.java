
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveDeliveryItemsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveDeliveryItemsChange removeDeliveryItemsChange = RemoveDeliveryItemsChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveDeliveryItemsChangeBuilder implements Builder<RemoveDeliveryItemsChange> {

    private String change;

    private com.commercetools.history.models.change_value.DeliveryChangeValue previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveDeliveryItemsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveDeliveryItemsChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.DeliveryChangeValueBuilder, com.commercetools.history.models.change_value.DeliveryChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.DeliveryChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveDeliveryItemsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.DeliveryChangeValueBuilder, com.commercetools.history.models.change_value.DeliveryChangeValue> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.DeliveryChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveDeliveryItemsChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.DeliveryChangeValue previousValue) {
        this.previousValue = previousValue;
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

    public com.commercetools.history.models.change_value.DeliveryChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveDeliveryItemsChange with checking for non-null required values
     * @return RemoveDeliveryItemsChange
     */
    public RemoveDeliveryItemsChange build() {
        Objects.requireNonNull(change, RemoveDeliveryItemsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveDeliveryItemsChange.class + ": previousValue is missing");
        return new RemoveDeliveryItemsChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveDeliveryItemsChange without checking for non-null required values
     * @return RemoveDeliveryItemsChange
     */
    public RemoveDeliveryItemsChange buildUnchecked() {
        return new RemoveDeliveryItemsChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveDeliveryItemsChangeBuilder
     * @return builder
     */
    public static RemoveDeliveryItemsChangeBuilder of() {
        return new RemoveDeliveryItemsChangeBuilder();
    }

    /**
     * create builder for RemoveDeliveryItemsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveDeliveryItemsChangeBuilder of(final RemoveDeliveryItemsChange template) {
        RemoveDeliveryItemsChangeBuilder builder = new RemoveDeliveryItemsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
