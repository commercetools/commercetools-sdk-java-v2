
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddLocalizedEnumValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddLocalizedEnumValueChange addLocalizedEnumValueChange = AddLocalizedEnumValueChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddLocalizedEnumValueChangeBuilder implements Builder<AddLocalizedEnumValueChange> {

    private String change;

    private String fieldName;

    private String attributeName;

    private com.commercetools.history.models.change_value.LocalizedEnumValue nextValue;

    /**
     *  <p>Update action for <code>addLocalizedEnumValue</code> on types</p>
     * @param change value to be set
     * @return Builder
     */

    public AddLocalizedEnumValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the field definition updated.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public AddLocalizedEnumValueChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public AddLocalizedEnumValueChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddLocalizedEnumValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddLocalizedEnumValueChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.LocalizedEnumValueBuilder, com.commercetools.history.models.change_value.LocalizedEnumValue> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.LocalizedEnumValueBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddLocalizedEnumValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.LocalizedEnumValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>addLocalizedEnumValue</code> on types</p>
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

    public com.commercetools.history.models.change_value.LocalizedEnumValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddLocalizedEnumValueChange with checking for non-null required values
     * @return AddLocalizedEnumValueChange
     */
    public AddLocalizedEnumValueChange build() {
        Objects.requireNonNull(change, AddLocalizedEnumValueChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, AddLocalizedEnumValueChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, AddLocalizedEnumValueChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, AddLocalizedEnumValueChange.class + ": nextValue is missing");
        return new AddLocalizedEnumValueChangeImpl(change, fieldName, attributeName, nextValue);
    }

    /**
     * builds AddLocalizedEnumValueChange without checking for non-null required values
     * @return AddLocalizedEnumValueChange
     */
    public AddLocalizedEnumValueChange buildUnchecked() {
        return new AddLocalizedEnumValueChangeImpl(change, fieldName, attributeName, nextValue);
    }

    /**
     * factory method for an instance of AddLocalizedEnumValueChangeBuilder
     * @return builder
     */
    public static AddLocalizedEnumValueChangeBuilder of() {
        return new AddLocalizedEnumValueChangeBuilder();
    }

    /**
     * create builder for AddLocalizedEnumValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddLocalizedEnumValueChangeBuilder of(final AddLocalizedEnumValueChange template) {
        AddLocalizedEnumValueChangeBuilder builder = new AddLocalizedEnumValueChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
