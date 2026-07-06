
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Configures additional information included in the payload sent to the API Extension.</p>
 *
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
@JsonDeserialize(as = ExtensionAdditionalContextImpl.class)
public interface ExtensionAdditionalContext {

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     * @return includeOldResource
     */
    @NotNull
    @JsonProperty("includeOldResource")
    public Boolean getIncludeOldResource();

    /**
     *  <p>Set to <code>true</code>, if the payload sent to the API Extension should include an <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionInput" rel="nofollow"><code>oldResource</code></a> field with the state of the resource before the update. This only applies to <code>Update</code> actions. For <code>Create</code> actions, <code>oldResource</code> is not included.</p>
     * @param includeOldResource value to be set
     */

    public void setIncludeOldResource(final Boolean includeOldResource);

    /**
     * factory method
     * @return instance of ExtensionAdditionalContext
     */
    public static ExtensionAdditionalContext of() {
        return new ExtensionAdditionalContextImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionAdditionalContext
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionAdditionalContext of(final ExtensionAdditionalContext template) {
        ExtensionAdditionalContextImpl instance = new ExtensionAdditionalContextImpl();
        instance.setIncludeOldResource(template.getIncludeOldResource());
        return instance;
    }

    public ExtensionAdditionalContext copyDeep();

    /**
     * factory method to create a deep copy of ExtensionAdditionalContext
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionAdditionalContext deepCopy(@Nullable final ExtensionAdditionalContext template) {
        if (template == null) {
            return null;
        }
        ExtensionAdditionalContextImpl instance = new ExtensionAdditionalContextImpl();
        instance.setIncludeOldResource(template.getIncludeOldResource());
        return instance;
    }

    /**
     * builder factory method for ExtensionAdditionalContext
     * @return builder
     */
    public static ExtensionAdditionalContextBuilder builder() {
        return ExtensionAdditionalContextBuilder.of();
    }

    /**
     * create builder for ExtensionAdditionalContext instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionAdditionalContextBuilder builder(final ExtensionAdditionalContext template) {
        return ExtensionAdditionalContextBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionAdditionalContext(Function<ExtensionAdditionalContext, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ExtensionAdditionalContext> typeReference() {
        return new tools.jackson.core.type.TypeReference<ExtensionAdditionalContext>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionAdditionalContext>";
            }
        };
    }
}
