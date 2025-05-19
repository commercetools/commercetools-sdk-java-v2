
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ExtensionInput
 *
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
@JsonDeserialize(as = ExtensionInputImpl.class)
public interface ExtensionInput {

    /**
     *  <p><code>Create</code> or <code>Update</code> request.</p>
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public ExtensionAction getAction();

    /**
     *  <p>Expanded reference to the resource that triggered the Extension.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    /**
     *  <p><code>Create</code> or <code>Update</code> request.</p>
     * @param action value to be set
     */

    public void setAction(final ExtensionAction action);

    /**
     *  <p>Expanded reference to the resource that triggered the Extension.</p>
     * @param resource value to be set
     */

    public void setResource(final Reference resource);

    /**
     * factory method
     * @return instance of ExtensionInput
     */
    public static ExtensionInput of() {
        return new ExtensionInputImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionInput
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionInput of(final ExtensionInput template) {
        ExtensionInputImpl instance = new ExtensionInputImpl();
        instance.setAction(template.getAction());
        instance.setResource(template.getResource());
        return instance;
    }

    public ExtensionInput copyDeep();

    /**
     * factory method to create a deep copy of ExtensionInput
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionInput deepCopy(@Nullable final ExtensionInput template) {
        if (template == null) {
            return null;
        }
        ExtensionInputImpl instance = new ExtensionInputImpl();
        instance.setAction(template.getAction());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        return instance;
    }

    /**
     * builder factory method for ExtensionInput
     * @return builder
     */
    public static ExtensionInputBuilder builder() {
        return ExtensionInputBuilder.of();
    }

    /**
     * create builder for ExtensionInput instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionInputBuilder builder(final ExtensionInput template) {
        return ExtensionInputBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionInput(Function<ExtensionInput, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionInput>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionInput>";
            }
        };
    }
}
