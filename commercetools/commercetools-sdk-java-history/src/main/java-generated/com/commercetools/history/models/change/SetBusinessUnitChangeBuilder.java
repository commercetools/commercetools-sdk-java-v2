
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetBusinessUnitChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetBusinessUnitChange setBusinessUnitChange = SetBusinessUnitChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetBusinessUnitChangeBuilder implements Builder<SetBusinessUnitChange> {

    private String change;

    private com.commercetools.history.models.common.KeyReference previousValue;

    private com.commercetools.history.models.common.KeyReference nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetBusinessUnitChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetBusinessUnitChangeBuilder previousValue(
            final com.commercetools.history.models.common.KeyReference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetBusinessUnitChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetBusinessUnitChangeBuilder nextValue(
            final com.commercetools.history.models.common.KeyReference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetBusinessUnitChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
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

    public com.commercetools.history.models.common.KeyReference getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.KeyReference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetBusinessUnitChange with checking for non-null required values
     * @return SetBusinessUnitChange
     */
    public SetBusinessUnitChange build() {
        Objects.requireNonNull(change, SetBusinessUnitChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetBusinessUnitChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetBusinessUnitChange.class + ": nextValue is missing");
        return new SetBusinessUnitChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetBusinessUnitChange without checking for non-null required values
     * @return SetBusinessUnitChange
     */
    public SetBusinessUnitChange buildUnchecked() {
        return new SetBusinessUnitChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetBusinessUnitChangeBuilder
     * @return builder
     */
    public static SetBusinessUnitChangeBuilder of() {
        return new SetBusinessUnitChangeBuilder();
    }

    /**
     * create builder for SetBusinessUnitChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetBusinessUnitChangeBuilder of(final SetBusinessUnitChange template) {
        SetBusinessUnitChangeBuilder builder = new SetBusinessUnitChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
