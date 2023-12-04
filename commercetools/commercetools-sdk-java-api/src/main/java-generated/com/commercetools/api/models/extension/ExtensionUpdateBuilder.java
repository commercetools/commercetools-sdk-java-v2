
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionUpdate extensionUpdate = ExtensionUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionUpdateBuilder implements Builder<ExtensionUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> actions;

    /**
     *  <p>Expected version of the Extension on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public ExtensionUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ExtensionUpdateBuilder actions(
            final com.commercetools.api.models.extension.ExtensionUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ExtensionUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @param actions value to be set
     * @return Builder
     */

    public ExtensionUpdateBuilder plusActions(
            final com.commercetools.api.models.extension.ExtensionUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ExtensionUpdateBuilder plusActions(
            Function<com.commercetools.api.models.extension.ExtensionUpdateActionBuilder, Builder<? extends com.commercetools.api.models.extension.ExtensionUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions
                .add(builder.apply(com.commercetools.api.models.extension.ExtensionUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public ExtensionUpdateBuilder withActions(
            Function<com.commercetools.api.models.extension.ExtensionUpdateActionBuilder, Builder<? extends com.commercetools.api.models.extension.ExtensionUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions
                .add(builder.apply(com.commercetools.api.models.extension.ExtensionUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Extension on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Extension.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.extension.ExtensionUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds ExtensionUpdate with checking for non-null required values
     * @return ExtensionUpdate
     */
    public ExtensionUpdate build() {
        Objects.requireNonNull(version, ExtensionUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ExtensionUpdate.class + ": actions is missing");
        return new ExtensionUpdateImpl(version, actions);
    }

    /**
     * builds ExtensionUpdate without checking for non-null required values
     * @return ExtensionUpdate
     */
    public ExtensionUpdate buildUnchecked() {
        return new ExtensionUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ExtensionUpdateBuilder
     * @return builder
     */
    public static ExtensionUpdateBuilder of() {
        return new ExtensionUpdateBuilder();
    }

    /**
     * create builder for ExtensionUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionUpdateBuilder of(final ExtensionUpdate template) {
        ExtensionUpdateBuilder builder = new ExtensionUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
