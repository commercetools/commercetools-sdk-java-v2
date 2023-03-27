
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerGroupChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerGroupChange setCustomerGroupChange = SetCustomerGroupChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomerGroupChangeBuilder implements Builder<SetCustomerGroupChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     *  <p>Shape of the action for <code>setCustomerGroup</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetCustomerGroupChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCustomerGroupChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCustomerGroupChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCustomerGroupChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCustomerGroupChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setCustomerGroup</code></p>
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
     * builds SetCustomerGroupChange with checking for non-null required values
     * @return SetCustomerGroupChange
     */
    public SetCustomerGroupChange build() {
        Objects.requireNonNull(change, SetCustomerGroupChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerGroupChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerGroupChange.class + ": nextValue is missing");
        return new SetCustomerGroupChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomerGroupChange without checking for non-null required values
     * @return SetCustomerGroupChange
     */
    public SetCustomerGroupChange buildUnchecked() {
        return new SetCustomerGroupChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetCustomerGroupChangeBuilder
     * @return builder
     */
    public static SetCustomerGroupChangeBuilder of() {
        return new SetCustomerGroupChangeBuilder();
    }

    /**
     * create builder for SetCustomerGroupChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerGroupChangeBuilder of(final SetCustomerGroupChange template) {
        SetCustomerGroupChangeBuilder builder = new SetCustomerGroupChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
