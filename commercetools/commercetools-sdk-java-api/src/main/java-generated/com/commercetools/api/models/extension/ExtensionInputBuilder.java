
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.common.Reference oldResource;

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
     *  <p>Expanded reference to the resource as it was before the update. Only included when <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionAdditionalContext" rel="nofollow"><code>additionalContext.includeOldResource</code></a> is <code>true</code> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a> and the <code>action</code> is <code>Update</code>.</p>
     * @param oldResource value to be set
     * @return Builder
     */

    public ExtensionInputBuilder oldResource(
            @Nullable final com.commercetools.api.models.common.Reference oldResource) {
        this.oldResource = oldResource;
        return this;
    }

    /**
     *  <p>Expanded reference to the resource as it was before the update. Only included when <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionAdditionalContext" rel="nofollow"><code>additionalContext.includeOldResource</code></a> is <code>true</code> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a> and the <code>action</code> is <code>Update</code>.</p>
     * @param builder function to build the oldResource value
     * @return Builder
     */

    public ExtensionInputBuilder oldResource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.oldResource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
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
     *  <p>Expanded reference to the resource as it was before the update. Only included when <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionAdditionalContext" rel="nofollow"><code>additionalContext.includeOldResource</code></a> is <code>true</code> on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a> and the <code>action</code> is <code>Update</code>.</p>
     * @return oldResource
     */

    @Nullable
    public com.commercetools.api.models.common.Reference getOldResource() {
        return this.oldResource;
    }

    /**
     * builds ExtensionInput with checking for non-null required values
     * @return ExtensionInput
     */
    public ExtensionInput build() {
        Objects.requireNonNull(action, ExtensionInput.class + ": action is missing");
        Objects.requireNonNull(resource, ExtensionInput.class + ": resource is missing");
        return new ExtensionInputImpl(action, resource, oldResource);
    }

    /**
     * builds ExtensionInput without checking for non-null required values
     * @return ExtensionInput
     */
    public ExtensionInput buildUnchecked() {
        return new ExtensionInputImpl(action, resource, oldResource);
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
        builder.oldResource = template.getOldResource();
        return builder;
    }

}
