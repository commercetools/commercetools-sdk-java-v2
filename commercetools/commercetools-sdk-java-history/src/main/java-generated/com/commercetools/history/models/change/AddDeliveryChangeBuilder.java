
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
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddDeliveryChangeBuilder implements Builder<AddDeliveryChange> {

    private String change;

    private com.commercetools.history.models.change_value.DeliveryChangeValue previousValue;

    private com.commercetools.history.models.change_value.DeliveryChangeValue nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddDeliveryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
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
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddDeliveryChangeBuilder withPreviousValue(
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

    public AddDeliveryChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.DeliveryChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
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
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddDeliveryChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.DeliveryChangeValueBuilder, com.commercetools.history.models.change_value.DeliveryChangeValue> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.DeliveryChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddDeliveryChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.DeliveryChangeValue nextValue) {
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

    public com.commercetools.history.models.change_value.DeliveryChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.DeliveryChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddDeliveryChange with checking for non-null required values
     * @return AddDeliveryChange
     */
    public AddDeliveryChange build() {
        Objects.requireNonNull(change, AddDeliveryChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddDeliveryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddDeliveryChange.class + ": nextValue is missing");
        return new AddDeliveryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddDeliveryChange without checking for non-null required values
     * @return AddDeliveryChange
     */
    public AddDeliveryChange buildUnchecked() {
        return new AddDeliveryChangeImpl(change, previousValue, nextValue);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
