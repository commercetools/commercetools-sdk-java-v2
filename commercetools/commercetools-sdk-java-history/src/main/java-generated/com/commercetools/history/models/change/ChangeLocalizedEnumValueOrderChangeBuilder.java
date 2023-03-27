
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLocalizedEnumValueOrderChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedEnumValueOrderChange changeLocalizedEnumValueOrderChange = ChangeLocalizedEnumValueOrderChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLocalizedEnumValueOrderChangeBuilder implements Builder<ChangeLocalizedEnumValueOrderChange> {

    private String change;

    private String fieldName;

    private String attributeName;

    private java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> nextValue;

    private java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> previousValue;

    /**
     *  <p>Update action for <code>changeLocalizedEnumValueOrder</code> on types and product types</p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the field definition updated.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue... nextValue) {
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

    public ChangeLocalizedEnumValueOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue... previousValue) {
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

    public ChangeLocalizedEnumValueOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update action for <code>changeLocalizedEnumValueOrder</code> on types and product types</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>The name of the field definition updated.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.change_value.LocalizedEnumValue> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangeLocalizedEnumValueOrderChange with checking for non-null required values
     * @return ChangeLocalizedEnumValueOrderChange
     */
    public ChangeLocalizedEnumValueOrderChange build() {
        Objects.requireNonNull(change, ChangeLocalizedEnumValueOrderChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeLocalizedEnumValueOrderChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeLocalizedEnumValueOrderChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeLocalizedEnumValueOrderChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeLocalizedEnumValueOrderChange.class + ": previousValue is missing");
        return new ChangeLocalizedEnumValueOrderChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangeLocalizedEnumValueOrderChange without checking for non-null required values
     * @return ChangeLocalizedEnumValueOrderChange
     */
    public ChangeLocalizedEnumValueOrderChange buildUnchecked() {
        return new ChangeLocalizedEnumValueOrderChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeLocalizedEnumValueOrderChangeBuilder
     * @return builder
     */
    public static ChangeLocalizedEnumValueOrderChangeBuilder of() {
        return new ChangeLocalizedEnumValueOrderChangeBuilder();
    }

    /**
     * create builder for ChangeLocalizedEnumValueOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLocalizedEnumValueOrderChangeBuilder of(final ChangeLocalizedEnumValueOrderChange template) {
        ChangeLocalizedEnumValueOrderChangeBuilder builder = new ChangeLocalizedEnumValueOrderChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
