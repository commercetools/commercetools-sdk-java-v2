
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddInterfaceInteractionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddInterfaceInteractionChange addInterfaceInteractionChange = AddInterfaceInteractionChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddInterfaceInteractionChangeBuilder implements Builder<AddInterfaceInteractionChange> {

    private String change;

    private com.commercetools.history.models.change_value.CustomFieldExpandedValue nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddInterfaceInteractionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddInterfaceInteractionChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.CustomFieldExpandedValueBuilder, com.commercetools.history.models.change_value.CustomFieldExpandedValueBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.CustomFieldExpandedValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddInterfaceInteractionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.CustomFieldExpandedValueBuilder, com.commercetools.history.models.change_value.CustomFieldExpandedValue> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.CustomFieldExpandedValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddInterfaceInteractionChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.CustomFieldExpandedValue nextValue) {
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

    public com.commercetools.history.models.change_value.CustomFieldExpandedValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddInterfaceInteractionChange with checking for non-null required values
     * @return AddInterfaceInteractionChange
     */
    public AddInterfaceInteractionChange build() {
        Objects.requireNonNull(change, AddInterfaceInteractionChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddInterfaceInteractionChange.class + ": nextValue is missing");
        return new AddInterfaceInteractionChangeImpl(change, nextValue);
    }

    /**
     * builds AddInterfaceInteractionChange without checking for non-null required values
     * @return AddInterfaceInteractionChange
     */
    public AddInterfaceInteractionChange buildUnchecked() {
        return new AddInterfaceInteractionChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddInterfaceInteractionChangeBuilder
     * @return builder
     */
    public static AddInterfaceInteractionChangeBuilder of() {
        return new AddInterfaceInteractionChangeBuilder();
    }

    /**
     * create builder for AddInterfaceInteractionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddInterfaceInteractionChangeBuilder of(final AddInterfaceInteractionChange template) {
        AddInterfaceInteractionChangeBuilder builder = new AddInterfaceInteractionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
