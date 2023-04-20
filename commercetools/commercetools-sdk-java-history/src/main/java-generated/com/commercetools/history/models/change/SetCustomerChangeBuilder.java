
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerChange setCustomerChange = SetCustomerChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomerChangeBuilder implements Builder<SetCustomerChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     *  <p>Shape of the action for <code>setCustomer</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetCustomerChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomerChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomerChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomerChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomerChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomerChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomerChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setCustomer</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetCustomerChange with checking for non-null required values
     * @return SetCustomerChange
     */
    public SetCustomerChange build() {
        Objects.requireNonNull(change, SetCustomerChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerChange.class + ": nextValue is missing");
        return new SetCustomerChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomerChange without checking for non-null required values
     * @return SetCustomerChange
     */
    public SetCustomerChange buildUnchecked() {
        return new SetCustomerChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCustomerChangeBuilder
     * @return builder
     */
    public static SetCustomerChangeBuilder of() {
        return new SetCustomerChangeBuilder();
    }

    /**
     * create builder for SetCustomerChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerChangeBuilder of(final SetCustomerChange template) {
        SetCustomerChangeBuilder builder = new SetCustomerChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
