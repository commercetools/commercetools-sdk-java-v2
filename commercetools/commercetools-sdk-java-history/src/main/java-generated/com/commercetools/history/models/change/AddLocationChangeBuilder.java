
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddLocationChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddLocationChange addLocationChange = AddLocationChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddLocationChangeBuilder implements Builder<AddLocationChange> {

    private String change;

    private com.commercetools.history.models.common.Location previousValue;

    private com.commercetools.history.models.common.Location nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddLocationChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.LocationBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddLocationChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.Location> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public AddLocationChangeBuilder previousValue(
            final com.commercetools.history.models.common.Location previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddLocationChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.LocationBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddLocationChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.Location> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddLocationChangeBuilder nextValue(final com.commercetools.history.models.common.Location nextValue) {
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

    public com.commercetools.history.models.common.Location getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Location getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddLocationChange with checking for non-null required values
     * @return AddLocationChange
     */
    public AddLocationChange build() {
        Objects.requireNonNull(change, AddLocationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddLocationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddLocationChange.class + ": nextValue is missing");
        return new AddLocationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddLocationChange without checking for non-null required values
     * @return AddLocationChange
     */
    public AddLocationChange buildUnchecked() {
        return new AddLocationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of AddLocationChangeBuilder
     * @return builder
     */
    public static AddLocationChangeBuilder of() {
        return new AddLocationChangeBuilder();
    }

    /**
     * create builder for AddLocationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddLocationChangeBuilder of(final AddLocationChange template) {
        AddLocationChangeBuilder builder = new AddLocationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
