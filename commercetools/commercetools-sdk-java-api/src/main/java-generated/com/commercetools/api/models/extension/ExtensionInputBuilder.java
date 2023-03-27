
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionInputBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionInput extensionInput = ExtensionInput.builder()
 *             .action(ExtensionAction.CREATE)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionInputBuilder implements Builder<ExtensionInput> {

    private com.commercetools.api.models.extension.ExtensionAction action;

    private com.commercetools.api.models.common.Reference resource;

    /**
     *  <p><code>Create</code> or <code>Update</code> request.</p>
     * @param action value to be set
     * @return Builder
     */

    public ExtensionInputBuilder action(final com.commercetools.api.models.extension.ExtensionAction action) {
        this.action = action;
        return this;
    }

    /**
     *  <p>Expanded reference to the resource that triggered the Extension.</p>
     * @param resource value to be set
     * @return Builder
     */

    public ExtensionInputBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Expanded reference to the resource that triggered the Extension.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public ExtensionInputBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>Create</code> or <code>Update</code> request.</p>
     * @return action
     */

    public com.commercetools.api.models.extension.ExtensionAction getAction() {
        return this.action;
    }

    /**
     *  <p>Expanded reference to the resource that triggered the Extension.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     * builds ExtensionInput with checking for non-null required values
     * @return ExtensionInput
     */
    public ExtensionInput build() {
        Objects.requireNonNull(action, ExtensionInput.class + ": action is missing");
        Objects.requireNonNull(resource, ExtensionInput.class + ": resource is missing");
        return new ExtensionInputImpl(action, resource);
    }

    /**
     * builds ExtensionInput without checking for non-null required values
     * @return ExtensionInput
     */
    public ExtensionInput buildUnchecked() {
        return new ExtensionInputImpl(action, resource);
    }

    /**
     * factory method for an instance of ExtensionInputBuilder
     * @return builder
     */
    public static ExtensionInputBuilder of() {
        return new ExtensionInputBuilder();
    }

    /**
     * create builder for ExtensionInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionInputBuilder of(final ExtensionInput template) {
        ExtensionInputBuilder builder = new ExtensionInputBuilder();
        builder.action = template.getAction();
        builder.resource = template.getResource();
        return builder;
    }

}
