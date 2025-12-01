
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveShippingChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveShippingChange removeShippingChange = RemoveShippingChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveShippingChangeBuilder implements Builder<RemoveShippingChange> {

    private String change;

    private com.commercetools.history.models.common.Shipping previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveShippingChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveShippingChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ShippingBuilder, com.commercetools.history.models.common.ShippingBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShippingBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveShippingChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ShippingBuilder, com.commercetools.history.models.common.Shipping> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ShippingBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveShippingChangeBuilder previousValue(
            final com.commercetools.history.models.common.Shipping previousValue) {
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

    public com.commercetools.history.models.common.Shipping getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveShippingChange with checking for non-null required values
     * @return RemoveShippingChange
     */
    public RemoveShippingChange build() {
        Objects.requireNonNull(change, RemoveShippingChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveShippingChange.class + ": previousValue is missing");
        return new RemoveShippingChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveShippingChange without checking for non-null required values
     * @return RemoveShippingChange
     */
    public RemoveShippingChange buildUnchecked() {
        return new RemoveShippingChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveShippingChangeBuilder
     * @return builder
     */
    public static RemoveShippingChangeBuilder of() {
        return new RemoveShippingChangeBuilder();
    }

    /**
     * create builder for RemoveShippingChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveShippingChangeBuilder of(final RemoveShippingChange template) {
        RemoveShippingChangeBuilder builder = new RemoveShippingChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
