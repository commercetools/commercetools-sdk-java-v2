
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
     *  <p>Update action for <code>changeFieldDefinitionOrder</code> on types</p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * add values to the previousValue
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
     * add the value to the previousValue using the builder function
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
     * set the value to the previousValue using the builder function
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
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeFieldDefinitionOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * add values to the nextValue
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
     * add the value to the nextValue using the builder function
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
     * set the value to the nextValue using the builder function
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
     *  <p>Update action for <code>changeFieldDefinitionOrder</code> on types</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
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
