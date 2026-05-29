
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionAdditionalContextBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionAdditionalContext extensionAdditionalContext = ExtensionAdditionalContext.builder()
 *             .includeOldResource(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionAdditionalContextBuilder implements Builder<ExtensionAdditionalContext> {

    private Boolean includeOldResource;

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     * @param includeOldResource value to be set
     * @return Builder
     */

    public ExtensionAdditionalContextBuilder includeOldResource(final Boolean includeOldResource) {
        this.includeOldResource = includeOldResource;
        return this;
    }

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     * @return includeOldResource
     */

    public Boolean getIncludeOldResource() {
        return this.includeOldResource;
    }

    /**
     * builds ExtensionAdditionalContext with checking for non-null required values
     * @return ExtensionAdditionalContext
     */
    public ExtensionAdditionalContext build() {
        Objects.requireNonNull(includeOldResource,
            ExtensionAdditionalContext.class + ": includeOldResource is missing");
        return new ExtensionAdditionalContextImpl(includeOldResource);
    }

    /**
     * builds ExtensionAdditionalContext without checking for non-null required values
     * @return ExtensionAdditionalContext
     */
    public ExtensionAdditionalContext buildUnchecked() {
        return new ExtensionAdditionalContextImpl(includeOldResource);
    }

    /**
     * factory method for an instance of ExtensionAdditionalContextBuilder
     * @return builder
     */
    public static ExtensionAdditionalContextBuilder of() {
        return new ExtensionAdditionalContextBuilder();
    }

    /**
     * create builder for ExtensionAdditionalContext instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionAdditionalContextBuilder of(final ExtensionAdditionalContext template) {
        ExtensionAdditionalContextBuilder builder = new ExtensionAdditionalContextBuilder();
        builder.includeOldResource = template.getIncludeOldResource();
        return builder;
    }

}
