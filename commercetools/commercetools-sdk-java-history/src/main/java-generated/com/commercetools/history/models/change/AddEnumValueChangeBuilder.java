
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
 *             .fieldName("{fieldName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddEnumValueChangeBuilder implements Builder<AddEnumValueChange> {

    private String change;

    private String fieldName;

    private com.commercetools.history.models.change_value.EnumValue nextValue;

    /**
     *  <p>Update action for <code>addEnumValue</code> on types</p>
     * @param change value to be set
     * @return Builder
     */

    public AddEnumValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the field/attribute definition updated.</p>
     * @param fieldName value to be set
     * @return Builder
     */

    public AddEnumValueChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddEnumValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public AddEnumValueChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.history.models.change_value.EnumValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddEnumValueChange with checking for non-null required values
     * @return AddEnumValueChange
     */
    public AddEnumValueChange build() {
        Objects.requireNonNull(change, AddEnumValueChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, AddEnumValueChange.class + ": fieldName is missing");
        Objects.requireNonNull(nextValue, AddEnumValueChange.class + ": nextValue is missing");
        return new AddEnumValueChangeImpl(change, fieldName, nextValue);
    }

    /**
     * builds AddEnumValueChange without checking for non-null required values
     * @return AddEnumValueChange
     */
    public AddEnumValueChange buildUnchecked() {
        return new AddEnumValueChangeImpl(change, fieldName, nextValue);
    }

    public static AddEnumValueChangeBuilder of() {
        return new AddEnumValueChangeBuilder();
    }

    public static AddEnumValueChangeBuilder of(final AddEnumValueChange template) {
        AddEnumValueChangeBuilder builder = new AddEnumValueChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
