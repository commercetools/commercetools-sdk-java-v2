
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTransitionsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTransitionsChange setTransitionsChange = SetTransitionsChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTransitionsChangeBuilder implements Builder<SetTransitionsChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    /**
     *  <p>Shape of the action for <code>setTransitions</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetTransitionsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTransitionsChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTransitionsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTransitionsChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTransitionsChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTransitionsChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTransitionsChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTransitionsChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTransitionsChangeBuilder nextValue(final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTransitionsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTransitionsChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Reference... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTransitionsChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTransitionsChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTransitionsChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTransitionsChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()));
    }

    /**
     *  <p>Shape of the action for <code>setTransitions</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Reference> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetTransitionsChange with checking for non-null required values
     * @return SetTransitionsChange
     */
    public SetTransitionsChange build() {
        Objects.requireNonNull(change, SetTransitionsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTransitionsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTransitionsChange.class + ": nextValue is missing");
        return new SetTransitionsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTransitionsChange without checking for non-null required values
     * @return SetTransitionsChange
     */
    public SetTransitionsChange buildUnchecked() {
        return new SetTransitionsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTransitionsChangeBuilder
     * @return builder
     */
    public static SetTransitionsChangeBuilder of() {
        return new SetTransitionsChangeBuilder();
    }

    /**
     * create builder for SetTransitionsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTransitionsChangeBuilder of(final SetTransitionsChange template) {
        SetTransitionsChangeBuilder builder = new SetTransitionsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
