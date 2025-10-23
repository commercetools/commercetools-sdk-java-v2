
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddShippingChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddShippingChange addShippingChange = AddShippingChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddShippingChangeBuilder implements Builder<AddShippingChange> {

    private String change;

    private com.commercetools.history.models.common.Shipping nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddShippingChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddShippingChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ShippingBuilder, com.commercetools.history.models.common.ShippingBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShippingBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddShippingChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ShippingBuilder, com.commercetools.history.models.common.Shipping> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ShippingBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddShippingChangeBuilder nextValue(final com.commercetools.history.models.common.Shipping nextValue) {
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Shipping getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddShippingChange with checking for non-null required values
     * @return AddShippingChange
     */
    public AddShippingChange build() {
        Objects.requireNonNull(change, AddShippingChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddShippingChange.class + ": nextValue is missing");
        return new AddShippingChangeImpl(change, nextValue);
    }

    /**
     * builds AddShippingChange without checking for non-null required values
     * @return AddShippingChange
     */
    public AddShippingChange buildUnchecked() {
        return new AddShippingChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddShippingChangeBuilder
     * @return builder
     */
    public static AddShippingChangeBuilder of() {
        return new AddShippingChangeBuilder();
    }

    /**
     * create builder for AddShippingChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddShippingChangeBuilder of(final AddShippingChange template) {
        AddShippingChangeBuilder builder = new AddShippingChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
