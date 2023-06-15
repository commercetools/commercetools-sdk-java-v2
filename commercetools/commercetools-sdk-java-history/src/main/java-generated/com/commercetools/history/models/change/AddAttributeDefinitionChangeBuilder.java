
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddAttributeDefinitionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAttributeDefinitionChange addAttributeDefinitionChange = AddAttributeDefinitionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddAttributeDefinitionChangeBuilder implements Builder<AddAttributeDefinitionChange> {

    private String change;

    private com.commercetools.history.models.common.AttributeDefinition nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddAttributeDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddAttributeDefinitionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AttributeDefinitionBuilder, com.commercetools.history.models.common.AttributeDefinitionBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AttributeDefinitionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddAttributeDefinitionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AttributeDefinitionBuilder, com.commercetools.history.models.common.AttributeDefinition> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AttributeDefinitionBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddAttributeDefinitionChangeBuilder nextValue(
            final com.commercetools.history.models.common.AttributeDefinition nextValue) {
        this.nextValue = nextValue;
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

    public com.commercetools.history.models.common.AttributeDefinition getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddAttributeDefinitionChange with checking for non-null required values
     * @return AddAttributeDefinitionChange
     */
    public AddAttributeDefinitionChange build() {
        Objects.requireNonNull(change, AddAttributeDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddAttributeDefinitionChange.class + ": nextValue is missing");
        return new AddAttributeDefinitionChangeImpl(change, nextValue);
    }

    /**
     * builds AddAttributeDefinitionChange without checking for non-null required values
     * @return AddAttributeDefinitionChange
     */
    public AddAttributeDefinitionChange buildUnchecked() {
        return new AddAttributeDefinitionChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddAttributeDefinitionChangeBuilder
     * @return builder
     */
    public static AddAttributeDefinitionChangeBuilder of() {
        return new AddAttributeDefinitionChangeBuilder();
    }

    /**
     * create builder for AddAttributeDefinitionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAttributeDefinitionChangeBuilder of(final AddAttributeDefinitionChange template) {
        AddAttributeDefinitionChangeBuilder builder = new AddAttributeDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
