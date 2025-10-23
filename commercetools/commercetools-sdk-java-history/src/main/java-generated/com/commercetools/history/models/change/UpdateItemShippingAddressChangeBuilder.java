
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdateItemShippingAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdateItemShippingAddressChange updateItemShippingAddressChange = UpdateItemShippingAddressChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UpdateItemShippingAddressChangeBuilder implements Builder<UpdateItemShippingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address previousValue;

    private com.commercetools.history.models.common.Address nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public UpdateItemShippingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public UpdateItemShippingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public UpdateItemShippingAddressChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public UpdateItemShippingAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public UpdateItemShippingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public UpdateItemShippingAddressChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public UpdateItemShippingAddressChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
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

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    /**
     * builds UpdateItemShippingAddressChange with checking for non-null required values
     * @return UpdateItemShippingAddressChange
     */
    public UpdateItemShippingAddressChange build() {
        Objects.requireNonNull(change, UpdateItemShippingAddressChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, UpdateItemShippingAddressChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, UpdateItemShippingAddressChange.class + ": nextValue is missing");
        return new UpdateItemShippingAddressChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds UpdateItemShippingAddressChange without checking for non-null required values
     * @return UpdateItemShippingAddressChange
     */
    public UpdateItemShippingAddressChange buildUnchecked() {
        return new UpdateItemShippingAddressChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of UpdateItemShippingAddressChangeBuilder
     * @return builder
     */
    public static UpdateItemShippingAddressChangeBuilder of() {
        return new UpdateItemShippingAddressChangeBuilder();
    }

    /**
     * create builder for UpdateItemShippingAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdateItemShippingAddressChangeBuilder of(final UpdateItemShippingAddressChange template) {
        UpdateItemShippingAddressChangeBuilder builder = new UpdateItemShippingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
