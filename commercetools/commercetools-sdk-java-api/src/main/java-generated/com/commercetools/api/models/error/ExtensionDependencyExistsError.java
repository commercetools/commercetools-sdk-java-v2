
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when attempting to delete an Extension that is a prerequisite for other Extensions.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionDependencyExistsError extensionDependencyExistsError = ExtensionDependencyExistsError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionDependencyExists")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionDependencyExistsErrorImpl.class)
public interface ExtensionDependencyExistsError extends ErrorObject {

    /**
     * discriminator value for ExtensionDependencyExistsError
     */
    String EXTENSION_DEPENDENCY_EXISTS = "ExtensionDependencyExists";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The extension cannot be deleted because it is a prerequisite for: [ext-2, ext-3]."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The extension cannot be deleted because it is a prerequisite for: [ext-2, ext-3]."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ExtensionDependencyExistsError
     */
    public static ExtensionDependencyExistsError of() {
        return new ExtensionDependencyExistsErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionDependencyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionDependencyExistsError of(final ExtensionDependencyExistsError template) {
        ExtensionDependencyExistsErrorImpl instance = new ExtensionDependencyExistsErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ExtensionDependencyExistsError copyDeep();

    /**
     * factory method to create a deep copy of ExtensionDependencyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionDependencyExistsError deepCopy(@Nullable final ExtensionDependencyExistsError template) {
        if (template == null) {
            return null;
        }
        ExtensionDependencyExistsErrorImpl instance = new ExtensionDependencyExistsErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ExtensionDependencyExistsError
     * @return builder
     */
    public static ExtensionDependencyExistsErrorBuilder builder() {
        return ExtensionDependencyExistsErrorBuilder.of();
    }

    /**
     * create builder for ExtensionDependencyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionDependencyExistsErrorBuilder builder(final ExtensionDependencyExistsError template) {
        return ExtensionDependencyExistsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionDependencyExistsError(Function<ExtensionDependencyExistsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ExtensionDependencyExistsError> typeReference() {
        return new tools.jackson.core.type.TypeReference<ExtensionDependencyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionDependencyExistsError>";
            }
        };
    }
}
