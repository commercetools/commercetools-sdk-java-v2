
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddAssociateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAssociateChange addAssociateChange = AddAssociateChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddAssociateChangeBuilder implements Builder<AddAssociateChange> {

    private String change;

    private com.commercetools.history.models.common.Associate nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddAssociateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddAssociateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddAssociateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddAssociateChangeBuilder nextValue(final com.commercetools.history.models.common.Associate nextValue) {
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

    public com.commercetools.history.models.common.Associate getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddAssociateChange with checking for non-null required values
     * @return AddAssociateChange
     */
    public AddAssociateChange build() {
        Objects.requireNonNull(change, AddAssociateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddAssociateChange.class + ": nextValue is missing");
        return new AddAssociateChangeImpl(change, nextValue);
    }

    /**
     * builds AddAssociateChange without checking for non-null required values
     * @return AddAssociateChange
     */
    public AddAssociateChange buildUnchecked() {
        return new AddAssociateChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddAssociateChangeBuilder
     * @return builder
     */
    public static AddAssociateChangeBuilder of() {
        return new AddAssociateChangeBuilder();
    }

    /**
     * create builder for AddAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAssociateChangeBuilder of(final AddAssociateChange template) {
        AddAssociateChangeBuilder builder = new AddAssociateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
