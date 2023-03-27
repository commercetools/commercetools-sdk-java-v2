
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddDeliveryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddDeliveryChange addDeliveryChange = AddDeliveryChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddDeliveryChangeBuilder implements Builder<AddDeliveryChange> {

    private String change;

    private com.commercetools.history.models.change_value.DeliveryChangeValue nextValue;

    private com.commercetools.history.models.change_value.DeliveryChangeValue previousValue;

    /**
     *  <p>Update action for <code>addDelivery</code></p>
     * @param change value to be set
     * @return Builder
     */

    public AddDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddDeliveryChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.DeliveryChangeValueBuilder, com.commercetools.history.models.change_value.DeliveryChangeValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.DeliveryChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddDeliveryChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.DeliveryChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddDeliveryChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.DeliveryChangeValueBuilder, com.commercetools.history.models.change_value.DeliveryChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.DeliveryChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public AddDeliveryChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.DeliveryChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>addDelivery</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.DeliveryChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.change_value.DeliveryChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds AddDeliveryChange with checking for non-null required values
     * @return AddDeliveryChange
     */
    public AddDeliveryChange build() {
        Objects.requireNonNull(change, AddDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddDeliveryChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddDeliveryChange.class + ": previousValue is missing");
        return new AddDeliveryChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddDeliveryChange without checking for non-null required values
     * @return AddDeliveryChange
     */
    public AddDeliveryChange buildUnchecked() {
        return new AddDeliveryChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of AddDeliveryChangeBuilder
     * @return builder
     */
    public static AddDeliveryChangeBuilder of() {
        return new AddDeliveryChangeBuilder();
    }

    /**
     * create builder for AddDeliveryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddDeliveryChangeBuilder of(final AddDeliveryChange template) {
        AddDeliveryChangeBuilder builder = new AddDeliveryChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
