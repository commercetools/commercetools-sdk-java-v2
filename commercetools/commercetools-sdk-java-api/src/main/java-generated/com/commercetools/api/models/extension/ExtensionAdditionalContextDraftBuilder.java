
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionAdditionalContextDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionAdditionalContextDraft extensionAdditionalContextDraft = ExtensionAdditionalContextDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionAdditionalContextDraftBuilder implements Builder<ExtensionAdditionalContextDraft> {

    @Nullable
    private Boolean includeOldResource;

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     * @param includeOldResource value to be set
     * @return Builder
     */

    public ExtensionAdditionalContextDraftBuilder includeOldResource(@Nullable final Boolean includeOldResource) {
        this.includeOldResource = includeOldResource;
        return this;
    }

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     * @return includeOldResource
     */

    @Nullable
    public Boolean getIncludeOldResource() {
        return this.includeOldResource;
    }

    /**
     * builds ExtensionAdditionalContextDraft with checking for non-null required values
     * @return ExtensionAdditionalContextDraft
     */
    public ExtensionAdditionalContextDraft build() {
        return new ExtensionAdditionalContextDraftImpl(includeOldResource);
    }

    /**
     * builds ExtensionAdditionalContextDraft without checking for non-null required values
     * @return ExtensionAdditionalContextDraft
     */
    public ExtensionAdditionalContextDraft buildUnchecked() {
        return new ExtensionAdditionalContextDraftImpl(includeOldResource);
    }

    /**
     * factory method for an instance of ExtensionAdditionalContextDraftBuilder
     * @return builder
     */
    public static ExtensionAdditionalContextDraftBuilder of() {
        return new ExtensionAdditionalContextDraftBuilder();
    }

    /**
     * create builder for ExtensionAdditionalContextDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionAdditionalContextDraftBuilder of(final ExtensionAdditionalContextDraft template) {
        ExtensionAdditionalContextDraftBuilder builder = new ExtensionAdditionalContextDraftBuilder();
        builder.includeOldResource = template.getIncludeOldResource();
        return builder;
    }

}
