
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValidFromAndUntilChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidFromAndUntilChange setValidFromAndUntilChange = SetValidFromAndUntilChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetValidFromAndUntilChangeBuilder implements Builder<SetValidFromAndUntilChange> {

    private String change;

    private com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue;

    private com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetValidFromAndUntilChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetValidFromAndUntilChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetValidFromAndUntilChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValue> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetValidFromAndUntilChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetValidFromAndUntilChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetValidFromAndUntilChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder, com.commercetools.history.models.change_value.ValidFromAndUntilValue> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ValidFromAndUntilValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetValidFromAndUntilChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue) {
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

    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetValidFromAndUntilChange with checking for non-null required values
     * @return SetValidFromAndUntilChange
     */
    public SetValidFromAndUntilChange build() {
        Objects.requireNonNull(change, SetValidFromAndUntilChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetValidFromAndUntilChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetValidFromAndUntilChange.class + ": nextValue is missing");
        return new SetValidFromAndUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValidFromAndUntilChange without checking for non-null required values
     * @return SetValidFromAndUntilChange
     */
    public SetValidFromAndUntilChange buildUnchecked() {
        return new SetValidFromAndUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetValidFromAndUntilChangeBuilder
     * @return builder
     */
    public static SetValidFromAndUntilChangeBuilder of() {
        return new SetValidFromAndUntilChangeBuilder();
    }

    /**
     * create builder for SetValidFromAndUntilChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValidFromAndUntilChangeBuilder of(final SetValidFromAndUntilChange template) {
        SetValidFromAndUntilChangeBuilder builder = new SetValidFromAndUntilChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
