
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetReturnInfoChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnInfoChange setReturnInfoChange = SetReturnInfoChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetReturnInfoChangeBuilder implements Builder<SetReturnInfoChange> {

    private String change;

    private com.commercetools.history.models.common.ReturnInfo previousValue;

    private com.commercetools.history.models.common.ReturnInfo nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetReturnInfoChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetReturnInfoChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReturnInfoBuilder, com.commercetools.history.models.common.ReturnInfoBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReturnInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetReturnInfoChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReturnInfoBuilder, com.commercetools.history.models.common.ReturnInfo> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReturnInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReturnInfoChangeBuilder previousValue(
            final com.commercetools.history.models.common.ReturnInfo previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetReturnInfoChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReturnInfoBuilder, com.commercetools.history.models.common.ReturnInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReturnInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetReturnInfoChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReturnInfoBuilder, com.commercetools.history.models.common.ReturnInfo> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReturnInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReturnInfoChangeBuilder nextValue(final com.commercetools.history.models.common.ReturnInfo nextValue) {
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

    public com.commercetools.history.models.common.ReturnInfo getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.ReturnInfo getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetReturnInfoChange with checking for non-null required values
     * @return SetReturnInfoChange
     */
    public SetReturnInfoChange build() {
        Objects.requireNonNull(change, SetReturnInfoChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetReturnInfoChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetReturnInfoChange.class + ": nextValue is missing");
        return new SetReturnInfoChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetReturnInfoChange without checking for non-null required values
     * @return SetReturnInfoChange
     */
    public SetReturnInfoChange buildUnchecked() {
        return new SetReturnInfoChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetReturnInfoChangeBuilder
     * @return builder
     */
    public static SetReturnInfoChangeBuilder of() {
        return new SetReturnInfoChangeBuilder();
    }

    /**
     * create builder for SetReturnInfoChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnInfoChangeBuilder of(final SetReturnInfoChange template) {
        SetReturnInfoChangeBuilder builder = new SetReturnInfoChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
