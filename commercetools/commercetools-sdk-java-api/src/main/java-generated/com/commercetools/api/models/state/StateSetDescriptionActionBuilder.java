
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateSetDescriptionAction stateSetDescriptionAction = StateSetDescriptionAction.builder()
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StateSetDescriptionActionBuilder implements Builder<StateSetDescriptionAction> {

    private com.commercetools.api.models.common.LocalizedString description;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public StateSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public StateSetDescriptionActionBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     * @return Builder
     */

    public StateSetDescriptionActionBuilder description(
            final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     * builds StateSetDescriptionAction with checking for non-null required values
     * @return StateSetDescriptionAction
     */
    public StateSetDescriptionAction build() {
        Objects.requireNonNull(description, StateSetDescriptionAction.class + ": description is missing");
        return new StateSetDescriptionActionImpl(description);
    }

    /**
     * builds StateSetDescriptionAction without checking for non-null required values
     * @return StateSetDescriptionAction
     */
    public StateSetDescriptionAction buildUnchecked() {
        return new StateSetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of StateSetDescriptionActionBuilder
     * @return builder
     */
    public static StateSetDescriptionActionBuilder of() {
        return new StateSetDescriptionActionBuilder();
    }

    /**
     * create builder for StateSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateSetDescriptionActionBuilder of(final StateSetDescriptionAction template) {
        StateSetDescriptionActionBuilder builder = new StateSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
