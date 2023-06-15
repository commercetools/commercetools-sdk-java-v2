
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveFieldDefinitionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveFieldDefinitionChange removeFieldDefinitionChange = RemoveFieldDefinitionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveFieldDefinitionChangeBuilder implements Builder<RemoveFieldDefinitionChange> {

    private String change;

    private com.commercetools.history.models.common.FieldDefinition previousValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RemoveFieldDefinitionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveFieldDefinitionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinitionBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveFieldDefinitionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.FieldDefinitionBuilder, com.commercetools.history.models.common.FieldDefinition> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.FieldDefinitionBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveFieldDefinitionChangeBuilder previousValue(
            final com.commercetools.history.models.common.FieldDefinition previousValue) {
        this.previousValue = previousValue;
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

    public com.commercetools.history.models.common.FieldDefinition getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveFieldDefinitionChange with checking for non-null required values
     * @return RemoveFieldDefinitionChange
     */
    public RemoveFieldDefinitionChange build() {
        Objects.requireNonNull(change, RemoveFieldDefinitionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveFieldDefinitionChange.class + ": previousValue is missing");
        return new RemoveFieldDefinitionChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveFieldDefinitionChange without checking for non-null required values
     * @return RemoveFieldDefinitionChange
     */
    public RemoveFieldDefinitionChange buildUnchecked() {
        return new RemoveFieldDefinitionChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveFieldDefinitionChangeBuilder
     * @return builder
     */
    public static RemoveFieldDefinitionChangeBuilder of() {
        return new RemoveFieldDefinitionChangeBuilder();
    }

    /**
     * create builder for RemoveFieldDefinitionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveFieldDefinitionChangeBuilder of(final RemoveFieldDefinitionChange template) {
        RemoveFieldDefinitionChangeBuilder builder = new RemoveFieldDefinitionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
