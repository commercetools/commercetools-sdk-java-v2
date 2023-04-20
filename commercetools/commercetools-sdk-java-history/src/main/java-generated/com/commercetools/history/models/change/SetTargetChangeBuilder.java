
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTargetChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTargetChange setTargetChange = SetTargetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTargetChangeBuilder implements Builder<SetTargetChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     *  <p>Shape of the action for <code>setTarget</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetTargetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTargetChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTargetChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTargetChangeBuilder previousValue(final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTargetChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTargetChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTargetChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the action for <code>setTarget</code></p>
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
     * builds SetTargetChange with checking for non-null required values
     * @return SetTargetChange
     */
    public SetTargetChange build() {
        Objects.requireNonNull(change, SetTargetChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTargetChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTargetChange.class + ": nextValue is missing");
        return new SetTargetChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTargetChange without checking for non-null required values
     * @return SetTargetChange
     */
    public SetTargetChange buildUnchecked() {
        return new SetTargetChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTargetChangeBuilder
     * @return builder
     */
    public static SetTargetChangeBuilder of() {
        return new SetTargetChangeBuilder();
    }

    /**
     * create builder for SetTargetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTargetChangeBuilder of(final SetTargetChange template) {
        SetTargetChangeBuilder builder = new SetTargetChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
