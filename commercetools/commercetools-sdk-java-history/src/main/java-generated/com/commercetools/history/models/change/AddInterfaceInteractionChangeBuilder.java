
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
     *  <p>Update action for <code>addInterfaceInteraction</code> on payments</p>
     * @param change
     * @return Builder
     */

    public AddInterfaceInteractionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Only available if <code>expand</code> is set to true</p>
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
     *  <p>Only available if <code>expand</code> is set to true</p>
     * @param nextValue
     * @return Builder
     */

    public AddInterfaceInteractionChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.CustomFieldExpandedValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.CustomFieldExpandedValue getNextValue() {
        return this.nextValue;
    }

    public AddInterfaceInteractionChange build() {
        Objects.requireNonNull(change, AddInterfaceInteractionChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddInterfaceInteractionChange.class + ": nextValue is missing");
        return new AddInterfaceInteractionChangeImpl(change, nextValue);
    }

    /**
     * builds AddInterfaceInteractionChange without checking for non null required values
     */
    public AddInterfaceInteractionChange buildUnchecked() {
        return new AddInterfaceInteractionChangeImpl(change, nextValue);
    }

    public static AddInterfaceInteractionChangeBuilder of() {
        return new AddInterfaceInteractionChangeBuilder();
    }

    public static AddInterfaceInteractionChangeBuilder of(final AddInterfaceInteractionChange template) {
        AddInterfaceInteractionChangeBuilder builder = new AddInterfaceInteractionChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
