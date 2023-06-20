
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeValueChange changeValueChange = ChangeValueChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueChangeBuilder implements Builder<ChangeValueChange> {

    private String change;

    private com.commercetools.history.models.change_value.ChangeValueChangeValue previousValue;

    private com.commercetools.history.models.change_value.ChangeValueChangeValue nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeValueChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ChangeValueChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeValueChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeValueChangeValue>> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ChangeValueChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeValueChangeValue>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.ChangeValueChangeValueBuilder.of())
                .build();
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

    public com.commercetools.history.models.change_value.ChangeValueChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.ChangeValueChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeValueChange with checking for non-null required values
     * @return ChangeValueChange
     */
    public ChangeValueChange build() {
        Objects.requireNonNull(change, ChangeValueChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeValueChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeValueChange.class + ": nextValue is missing");
        return new ChangeValueChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeValueChange without checking for non-null required values
     * @return ChangeValueChange
     */
    public ChangeValueChange buildUnchecked() {
        return new ChangeValueChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeValueChangeBuilder
     * @return builder
     */
    public static ChangeValueChangeBuilder of() {
        return new ChangeValueChangeBuilder();
    }

    /**
     * create builder for ChangeValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeValueChangeBuilder of(final ChangeValueChange template) {
        ChangeValueChangeBuilder builder = new ChangeValueChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
