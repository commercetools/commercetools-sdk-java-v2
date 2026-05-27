
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ExtensionSetAdditionalContextAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetAdditionalContextAction extensionSetAdditionalContextAction = ExtensionSetAdditionalContextAction.builder()
 *             .additionalContext(additionalContextBuilder -> additionalContextBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAdditionalContext")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionSetAdditionalContextActionImpl.class)
public interface ExtensionSetAdditionalContextAction extends ExtensionUpdateAction {

    /**
     * discriminator value for ExtensionSetAdditionalContextAction
     */
    String SET_ADDITIONAL_CONTEXT = "setAdditionalContext";

    /**
     *  <p>New value to set.</p>
     * @return additionalContext
     */
    @NotNull
    @Valid
    @JsonProperty("additionalContext")
    public ExtensionAdditionalContextDraft getAdditionalContext();

    /**
     *  <p>New value to set.</p>
     * @param additionalContext value to be set
     */

    public void setAdditionalContext(final ExtensionAdditionalContextDraft additionalContext);

    /**
     * factory method
     * @return instance of ExtensionSetAdditionalContextAction
     */
    public static ExtensionSetAdditionalContextAction of() {
        return new ExtensionSetAdditionalContextActionImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionSetAdditionalContextAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionSetAdditionalContextAction of(final ExtensionSetAdditionalContextAction template) {
        ExtensionSetAdditionalContextActionImpl instance = new ExtensionSetAdditionalContextActionImpl();
        instance.setAdditionalContext(template.getAdditionalContext());
        return instance;
    }

    public ExtensionSetAdditionalContextAction copyDeep();

    /**
     * factory method to create a deep copy of ExtensionSetAdditionalContextAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionSetAdditionalContextAction deepCopy(
            @Nullable final ExtensionSetAdditionalContextAction template) {
        if (template == null) {
            return null;
        }
        ExtensionSetAdditionalContextActionImpl instance = new ExtensionSetAdditionalContextActionImpl();
        instance.setAdditionalContext(com.commercetools.api.models.extension.ExtensionAdditionalContextDraft
                .deepCopy(template.getAdditionalContext()));
        return instance;
    }

    /**
     * builder factory method for ExtensionSetAdditionalContextAction
     * @return builder
     */
    public static ExtensionSetAdditionalContextActionBuilder builder() {
        return ExtensionSetAdditionalContextActionBuilder.of();
    }

    /**
     * create builder for ExtensionSetAdditionalContextAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetAdditionalContextActionBuilder builder(
            final ExtensionSetAdditionalContextAction template) {
        return ExtensionSetAdditionalContextActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionSetAdditionalContextAction(Function<ExtensionSetAdditionalContextAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionSetAdditionalContextAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionSetAdditionalContextAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionSetAdditionalContextAction>";
            }
        };
    }
}
