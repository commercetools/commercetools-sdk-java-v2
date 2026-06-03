
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Draft for <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionAdditionalContext" rel="nofollow">ExtensionAdditionalContext</a>.</p>
 *
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
@JsonDeserialize(as = ExtensionAdditionalContextDraftImpl.class)
public interface ExtensionAdditionalContextDraft
        extends io.vrap.rmf.base.client.Draft<ExtensionAdditionalContextDraft> {

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     * @return includeOldResource
     */

    @JsonProperty("includeOldResource")
    public Boolean getIncludeOldResource();

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     * @param includeOldResource value to be set
     */

    public void setIncludeOldResource(final Boolean includeOldResource);

    /**
     * factory method
     * @return instance of ExtensionAdditionalContextDraft
     */
    public static ExtensionAdditionalContextDraft of() {
        return new ExtensionAdditionalContextDraftImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionAdditionalContextDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionAdditionalContextDraft of(final ExtensionAdditionalContextDraft template) {
        ExtensionAdditionalContextDraftImpl instance = new ExtensionAdditionalContextDraftImpl();
        instance.setIncludeOldResource(template.getIncludeOldResource());
        return instance;
    }

    public ExtensionAdditionalContextDraft copyDeep();

    /**
     * factory method to create a deep copy of ExtensionAdditionalContextDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionAdditionalContextDraft deepCopy(@Nullable final ExtensionAdditionalContextDraft template) {
        if (template == null) {
            return null;
        }
        ExtensionAdditionalContextDraftImpl instance = new ExtensionAdditionalContextDraftImpl();
        instance.setIncludeOldResource(template.getIncludeOldResource());
        return instance;
    }

    /**
     * builder factory method for ExtensionAdditionalContextDraft
     * @return builder
     */
    public static ExtensionAdditionalContextDraftBuilder builder() {
        return ExtensionAdditionalContextDraftBuilder.of();
    }

    /**
     * create builder for ExtensionAdditionalContextDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionAdditionalContextDraftBuilder builder(final ExtensionAdditionalContextDraft template) {
        return ExtensionAdditionalContextDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionAdditionalContextDraft(Function<ExtensionAdditionalContextDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ExtensionAdditionalContextDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<ExtensionAdditionalContextDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionAdditionalContextDraft>";
            }
        };
    }
}
