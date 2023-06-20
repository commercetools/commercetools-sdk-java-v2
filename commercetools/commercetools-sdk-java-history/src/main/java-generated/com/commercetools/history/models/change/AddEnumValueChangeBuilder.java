
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddEnumValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddEnumValueChange addEnumValueChange = AddEnumValueChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddEnumValueChangeBuilder implements Builder<AddEnumValueChange> {

    private String change;

    private com.commercetools.history.models.change_value.EnumValue nextValue;

    private String fieldName;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddEnumValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddEnumValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddEnumValueChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValue> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddEnumValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated FieldDefinition.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public AddEnumValueChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.EnumValue getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated FieldDefinition.</p>
     * @return fieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * builds AddEnumValueChange with checking for non-null required values
     * @return AddEnumValueChange
     */
    public AddEnumValueChange build() {
        Objects.requireNonNull(change, AddEnumValueChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddEnumValueChange.class + ": nextValue is missing");
        Objects.requireNonNull(fieldName, AddEnumValueChange.class + ": fieldName is missing");
        return new AddEnumValueChangeImpl(change, nextValue, fieldName);
    }

    /**
     * builds AddEnumValueChange without checking for non-null required values
     * @return AddEnumValueChange
     */
    public AddEnumValueChange buildUnchecked() {
        return new AddEnumValueChangeImpl(change, nextValue, fieldName);
    }

    /**
     * factory method for an instance of AddEnumValueChangeBuilder
     * @return builder
     */
    public static AddEnumValueChangeBuilder of() {
        return new AddEnumValueChangeBuilder();
    }

    /**
     * create builder for AddEnumValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddEnumValueChangeBuilder of(final AddEnumValueChange template) {
        AddEnumValueChangeBuilder builder = new AddEnumValueChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.fieldName = template.getFieldName();
        return builder;
    }

}
