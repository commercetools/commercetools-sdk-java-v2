
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLocalizedEnumValueLabelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedEnumValueLabelChange changeLocalizedEnumValueLabelChange = ChangeLocalizedEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .valueKey("{valueKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLocalizedEnumValueLabelChangeBuilder implements Builder<ChangeLocalizedEnumValueLabelChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private String fieldName;

    private String attributeName;

    private String valueKey;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *  <p>Key of the updated values.</p>
     * @param valueKey value to be set
     * @return Builder
     */

    public ChangeLocalizedEnumValueLabelChangeBuilder valueKey(final String valueKey) {
        this.valueKey = valueKey;
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

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
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
     *  <p>Key of the updated values.</p>
     * @return valueKey
     */

    public String getValueKey() {
        return this.valueKey;
    }

    /**
     * builds ChangeLocalizedEnumValueLabelChange with checking for non-null required values
     * @return ChangeLocalizedEnumValueLabelChange
     */
    public ChangeLocalizedEnumValueLabelChange build() {
        Objects.requireNonNull(change, ChangeLocalizedEnumValueLabelChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeLocalizedEnumValueLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLocalizedEnumValueLabelChange.class + ": nextValue is missing");
        Objects.requireNonNull(fieldName, ChangeLocalizedEnumValueLabelChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeLocalizedEnumValueLabelChange.class + ": attributeName is missing");
        Objects.requireNonNull(valueKey, ChangeLocalizedEnumValueLabelChange.class + ": valueKey is missing");
        return new ChangeLocalizedEnumValueLabelChangeImpl(change, previousValue, nextValue, fieldName, attributeName,
            valueKey);
    }

    /**
     * builds ChangeLocalizedEnumValueLabelChange without checking for non-null required values
     * @return ChangeLocalizedEnumValueLabelChange
     */
    public ChangeLocalizedEnumValueLabelChange buildUnchecked() {
        return new ChangeLocalizedEnumValueLabelChangeImpl(change, previousValue, nextValue, fieldName, attributeName,
            valueKey);
    }

    /**
     * factory method for an instance of ChangeLocalizedEnumValueLabelChangeBuilder
     * @return builder
     */
    public static ChangeLocalizedEnumValueLabelChangeBuilder of() {
        return new ChangeLocalizedEnumValueLabelChangeBuilder();
    }

    /**
     * create builder for ChangeLocalizedEnumValueLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLocalizedEnumValueLabelChangeBuilder of(final ChangeLocalizedEnumValueLabelChange template) {
        ChangeLocalizedEnumValueLabelChangeBuilder builder = new ChangeLocalizedEnumValueLabelChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.valueKey = template.getValueKey();
        return builder;
    }

}
