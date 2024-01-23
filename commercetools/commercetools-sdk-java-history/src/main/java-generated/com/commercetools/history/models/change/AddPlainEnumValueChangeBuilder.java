
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPlainEnumValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPlainEnumValueChange addPlainEnumValueChange = AddPlainEnumValueChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddPlainEnumValueChangeBuilder implements Builder<AddPlainEnumValueChange> {

    private String change;

    private com.commercetools.history.models.common.AttributePlainEnumValue nextValue;

    private String attributeName;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddPlainEnumValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddPlainEnumValueChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AttributePlainEnumValueBuilder, com.commercetools.history.models.common.AttributePlainEnumValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AttributePlainEnumValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddPlainEnumValueChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AttributePlainEnumValueBuilder, com.commercetools.history.models.common.AttributePlainEnumValue> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AttributePlainEnumValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddPlainEnumValueChangeBuilder nextValue(
            final com.commercetools.history.models.common.AttributePlainEnumValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public AddPlainEnumValueChangeBuilder attributeName(final String attributeName) {
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.AttributePlainEnumValue getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     * @return attributeName
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * builds AddPlainEnumValueChange with checking for non-null required values
     * @return AddPlainEnumValueChange
     */
    public AddPlainEnumValueChange build() {
        Objects.requireNonNull(change, AddPlainEnumValueChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddPlainEnumValueChange.class + ": nextValue is missing");
        Objects.requireNonNull(attributeName, AddPlainEnumValueChange.class + ": attributeName is missing");
        return new AddPlainEnumValueChangeImpl(change, nextValue, attributeName);
    }

    /**
     * builds AddPlainEnumValueChange without checking for non-null required values
     * @return AddPlainEnumValueChange
     */
    public AddPlainEnumValueChange buildUnchecked() {
        return new AddPlainEnumValueChangeImpl(change, nextValue, attributeName);
    }

    /**
     * factory method for an instance of AddPlainEnumValueChangeBuilder
     * @return builder
     */
    public static AddPlainEnumValueChangeBuilder of() {
        return new AddPlainEnumValueChangeBuilder();
    }

    /**
     * create builder for AddPlainEnumValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPlainEnumValueChangeBuilder of(final AddPlainEnumValueChange template) {
        AddPlainEnumValueChangeBuilder builder = new AddPlainEnumValueChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.attributeName = template.getAttributeName();
        return builder;
    }

}
