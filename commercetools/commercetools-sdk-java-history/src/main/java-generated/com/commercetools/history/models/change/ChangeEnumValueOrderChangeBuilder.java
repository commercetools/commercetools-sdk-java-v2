
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeEnumValueOrderChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeEnumValueOrderChange changeEnumValueOrderChange = ChangeEnumValueOrderChange.builder()
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
public class ChangeEnumValueOrderChangeBuilder implements Builder<ChangeEnumValueOrderChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.CustomFieldEnumValue> previousValue;

    private java.util.List<com.commercetools.history.models.common.CustomFieldEnumValue> nextValue;

    private String fieldName;

    private String attributeName;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFieldEnumValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.CustomFieldEnumValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.CustomFieldEnumValue... previousValue) {
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

    public ChangeEnumValueOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldEnumValueBuilder, com.commercetools.history.models.common.CustomFieldEnumValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldEnumValueBuilder, com.commercetools.history.models.common.CustomFieldEnumValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.common.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldEnumValueBuilder, com.commercetools.history.models.common.CustomFieldEnumValue> builder) {
        return plusPreviousValue(
            builder.apply(com.commercetools.history.models.common.CustomFieldEnumValueBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldEnumValueBuilder, com.commercetools.history.models.common.CustomFieldEnumValue> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.CustomFieldEnumValueBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFieldEnumValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.CustomFieldEnumValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.CustomFieldEnumValue... nextValue) {
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

    public ChangeEnumValueOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.CustomFieldEnumValueBuilder, com.commercetools.history.models.common.CustomFieldEnumValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue
                .add(builder.apply(com.commercetools.history.models.common.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldEnumValueBuilder, com.commercetools.history.models.common.CustomFieldEnumValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue
                .add(builder.apply(com.commercetools.history.models.common.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.CustomFieldEnumValueBuilder, com.commercetools.history.models.common.CustomFieldEnumValue> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.CustomFieldEnumValueBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.CustomFieldEnumValueBuilder, com.commercetools.history.models.common.CustomFieldEnumValue> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.CustomFieldEnumValueBuilder.of()));
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeEnumValueOrderChangeBuilder attributeName(final String attributeName) {
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

    public java.util.List<com.commercetools.history.models.common.CustomFieldEnumValue> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.CustomFieldEnumValue> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * builds ChangeEnumValueOrderChange with checking for non-null required values
     * @return ChangeEnumValueOrderChange
     */
    public ChangeEnumValueOrderChange build() {
        Objects.requireNonNull(change, ChangeEnumValueOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeEnumValueOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeEnumValueOrderChange.class + ": nextValue is missing");
        Objects.requireNonNull(fieldName, ChangeEnumValueOrderChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeEnumValueOrderChange.class + ": attributeName is missing");
        return new ChangeEnumValueOrderChangeImpl(change, previousValue, nextValue, fieldName, attributeName);
    }

    /**
     * builds ChangeEnumValueOrderChange without checking for non-null required values
     * @return ChangeEnumValueOrderChange
     */
    public ChangeEnumValueOrderChange buildUnchecked() {
        return new ChangeEnumValueOrderChangeImpl(change, previousValue, nextValue, fieldName, attributeName);
    }

    /**
     * factory method for an instance of ChangeEnumValueOrderChangeBuilder
     * @return builder
     */
    public static ChangeEnumValueOrderChangeBuilder of() {
        return new ChangeEnumValueOrderChangeBuilder();
    }

    /**
     * create builder for ChangeEnumValueOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeEnumValueOrderChangeBuilder of(final ChangeEnumValueOrderChange template) {
        ChangeEnumValueOrderChangeBuilder builder = new ChangeEnumValueOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        return builder;
    }

}
