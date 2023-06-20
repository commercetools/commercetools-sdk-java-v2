
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeFieldDefinitionOrderChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeFieldDefinitionOrderChange changeFieldDefinitionOrderChange = ChangeFieldDefinitionOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeFieldDefinitionOrderChangeBuilder implements Builder<ChangeFieldDefinitionOrderChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> previousValue;

    private java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValue> builder) {
        return plusPreviousValue(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValue> builder) {
        return previousValue(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder addNextValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValue> builder) {
        return plusNextValue(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder setNextValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValue> builder) {
        return nextValue(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()));
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

    public java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeFieldDefinitionOrderChange with checking for non-null required values
     * @return ChangeFieldDefinitionOrderChange
     */
    public ChangeFieldDefinitionOrderChange build() {
        Objects.requireNonNull(change, ChangeFieldDefinitionOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeFieldDefinitionOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeFieldDefinitionOrderChange.class + ": nextValue is missing");
        return new ChangeFieldDefinitionOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeFieldDefinitionOrderChange without checking for non-null required values
     * @return ChangeFieldDefinitionOrderChange
     */
    public ChangeFieldDefinitionOrderChange buildUnchecked() {
        return new ChangeFieldDefinitionOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeFieldDefinitionOrderChangeBuilder
     * @return builder
     */
    public static ChangeFieldDefinitionOrderChangeBuilder of() {
        return new ChangeFieldDefinitionOrderChangeBuilder();
    }

    /**
     * create builder for ChangeFieldDefinitionOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeFieldDefinitionOrderChangeBuilder of(final ChangeFieldDefinitionOrderChange template) {
        ChangeFieldDefinitionOrderChangeBuilder builder = new ChangeFieldDefinitionOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
