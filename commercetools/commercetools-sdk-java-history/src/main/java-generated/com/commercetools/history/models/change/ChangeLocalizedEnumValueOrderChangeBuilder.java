
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
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLocalizedEnumValueOrderChangeBuilder implements Builder<ChangeLocalizedEnumValueOrderChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.AttributeLocalizedEnumValue> previousValue;

    private java.util.List<com.commercetools.history.models.common.AttributeLocalizedEnumValue> nextValue;

    private String fieldName;

    private String attributeName;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder previousValue(
            final com.commercetools.history.models.common.AttributeLocalizedEnumValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.AttributeLocalizedEnumValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.AttributeLocalizedEnumValue... previousValue) {
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

    public ChangeLocalizedEnumValueOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder, com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder, com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder, com.commercetools.history.models.common.AttributeLocalizedEnumValue> builder) {
        return plusPreviousValue(
            builder.apply(com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder, com.commercetools.history.models.common.AttributeLocalizedEnumValue> builder) {
        return previousValue(
            builder.apply(com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder nextValue(
            final com.commercetools.history.models.common.AttributeLocalizedEnumValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.AttributeLocalizedEnumValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.AttributeLocalizedEnumValue... nextValue) {
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

    public ChangeLocalizedEnumValueOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder, com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder, com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder, com.commercetools.history.models.common.AttributeLocalizedEnumValue> builder) {
        return plusNextValue(
            builder.apply(com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder, com.commercetools.history.models.common.AttributeLocalizedEnumValue> builder) {
        return nextValue(
            builder.apply(com.commercetools.history.models.common.AttributeLocalizedEnumValueBuilder.of()));
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueOrderChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
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

    public java.util.List<com.commercetools.history.models.common.AttributeLocalizedEnumValue> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.AttributeLocalizedEnumValue> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * builds ChangeLocalizedEnumValueOrderChange with checking for non-null required values
     * @return ChangeLocalizedEnumValueOrderChange
     */
    public ChangeLocalizedEnumValueOrderChange build() {
        Objects.requireNonNull(change, ChangeLocalizedEnumValueOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeLocalizedEnumValueOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLocalizedEnumValueOrderChange.class + ": nextValue is missing");
        Objects.requireNonNull(fieldName, ChangeLocalizedEnumValueOrderChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeLocalizedEnumValueOrderChange.class + ": attributeName is missing");
        return new ChangeLocalizedEnumValueOrderChangeImpl(change, previousValue, nextValue, fieldName, attributeName);
    }

    /**
     * builds ChangeLocalizedEnumValueOrderChange without checking for non-null required values
     * @return ChangeLocalizedEnumValueOrderChange
     */
    public ChangeLocalizedEnumValueOrderChange buildUnchecked() {
        return new ChangeLocalizedEnumValueOrderChangeImpl(change, previousValue, nextValue, fieldName, attributeName);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        return builder;
    }

}
