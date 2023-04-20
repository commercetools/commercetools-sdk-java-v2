
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddFieldDefinitionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddFieldDefinitionChange addFieldDefinitionChange = AddFieldDefinitionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddFieldDefinitionChangeBuilder implements Builder<AddFieldDefinitionChange> {

    private String change;

    private com.commercetools.history.models.common.FieldDefinition nextValue;

    /**
     *  <p>Update action for <code>addFieldDefinition</code> on payments</p>
     * @param change value to be set
     * @return Builder
     */

    public AddFieldDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddFieldDefinitionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinitionBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddFieldDefinitionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinition> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddFieldDefinitionChangeBuilder nextValue(
            final com.commercetools.history.models.common.FieldDefinition nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>addFieldDefinition</code> on payments</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.FieldDefinition getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddFieldDefinitionChange with checking for non-null required values
     * @return AddFieldDefinitionChange
     */
    public AddFieldDefinitionChange build() {
        Objects.requireNonNull(change, AddFieldDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddFieldDefinitionChange.class + ": nextValue is missing");
        return new AddFieldDefinitionChangeImpl(change, nextValue);
    }

    /**
     * builds AddFieldDefinitionChange without checking for non-null required values
     * @return AddFieldDefinitionChange
     */
    public AddFieldDefinitionChange buildUnchecked() {
        return new AddFieldDefinitionChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddFieldDefinitionChangeBuilder
     * @return builder
     */
    public static AddFieldDefinitionChangeBuilder of() {
        return new AddFieldDefinitionChangeBuilder();
    }

    /**
     * create builder for AddFieldDefinitionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddFieldDefinitionChangeBuilder of(final AddFieldDefinitionChange template) {
        AddFieldDefinitionChangeBuilder builder = new AddFieldDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
