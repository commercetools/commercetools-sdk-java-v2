
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
 *  <p>Returned when a circular reference is detected among Extension dependencies.</p>
 *  <p>The <code>message</code> lists the <code>id</code> of each Extension in the detected cycle, starting and ending with the same Extension.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionCircularDependencyError extensionCircularDependencyError = ExtensionCircularDependencyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionCircularDependency")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionCircularDependencyErrorImpl.class)
public interface ExtensionCircularDependencyError extends ErrorObject {

    /**
     * discriminator value for ExtensionCircularDependencyError
     */
    String EXTENSION_CIRCULAR_DEPENDENCY = "ExtensionCircularDependency";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Circular dependency detected: [3fa85f64-5717-4562-b3fc-2c963f66afa6, 5e0e1e0b-1f4b-4b8b-9c1a-2d3f4a5b6c7d, 3fa85f64-5717-4562-b3fc-2c963f66afa6]"</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Circular dependency detected: [3fa85f64-5717-4562-b3fc-2c963f66afa6, 5e0e1e0b-1f4b-4b8b-9c1a-2d3f4a5b6c7d, 3fa85f64-5717-4562-b3fc-2c963f66afa6]"</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ExtensionCircularDependencyError
     */
    public static ExtensionCircularDependencyError of() {
        return new ExtensionCircularDependencyErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionCircularDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionCircularDependencyError of(final ExtensionCircularDependencyError template) {
        ExtensionCircularDependencyErrorImpl instance = new ExtensionCircularDependencyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ExtensionCircularDependencyError copyDeep();

    /**
     * factory method to create a deep copy of ExtensionCircularDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionCircularDependencyError deepCopy(@Nullable final ExtensionCircularDependencyError template) {
        if (template == null) {
            return null;
        }
        ExtensionCircularDependencyErrorImpl instance = new ExtensionCircularDependencyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ExtensionCircularDependencyError
     * @return builder
     */
    public static ExtensionCircularDependencyErrorBuilder builder() {
        return ExtensionCircularDependencyErrorBuilder.of();
    }

    /**
     * create builder for ExtensionCircularDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionCircularDependencyErrorBuilder builder(final ExtensionCircularDependencyError template) {
        return ExtensionCircularDependencyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionCircularDependencyError(Function<ExtensionCircularDependencyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ExtensionCircularDependencyError> typeReference() {
        return new tools.jackson.core.type.TypeReference<ExtensionCircularDependencyError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionCircularDependencyError>";
            }
        };
    }
}
