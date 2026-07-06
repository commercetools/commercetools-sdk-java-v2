
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStoreChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStoreChange setStoreChange = SetStoreChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetStoreChangeBuilder implements Builder<SetStoreChange> {

    private String change;

    private com.commercetools.history.models.common.KeyReference previousValue;

    private com.commercetools.history.models.common.KeyReference nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetStoreChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetStoreChangeBuilder previousValue(
            final com.commercetools.history.models.common.KeyReference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetStoreChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, Builder<? extends com.commercetools.history.models.common.KeyReference>> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetStoreChangeBuilder nextValue(final com.commercetools.history.models.common.KeyReference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetStoreChangeBuilder nextValue(
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
     * builds SetStoreChange with checking for non-null required values
     * @return SetStoreChange
     */
    public SetStoreChange build() {
        Objects.requireNonNull(change, SetStoreChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStoreChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStoreChange.class + ": nextValue is missing");
        return new SetStoreChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStoreChange without checking for non-null required values
     * @return SetStoreChange
     */
    public SetStoreChange buildUnchecked() {
        return new SetStoreChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetStoreChangeBuilder
     * @return builder
     */
    public static SetStoreChangeBuilder of() {
        return new SetStoreChangeBuilder();
    }

    /**
     * create builder for SetStoreChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetStoreChangeBuilder of(final SetStoreChange template) {
        SetStoreChangeBuilder builder = new SetStoreChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
