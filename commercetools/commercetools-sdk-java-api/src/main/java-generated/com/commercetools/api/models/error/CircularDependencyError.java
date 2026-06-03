
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
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CircularDependencyError circularDependencyError = CircularDependencyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CircularDependency")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CircularDependencyErrorImpl.class)
public interface CircularDependencyError extends ErrorObject {

    /**
     * discriminator value for CircularDependencyError
     */
    String CIRCULAR_DEPENDENCY = "CircularDependency";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Circular dependency detected: [ext-1, ext-2, ext-1]"</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"Circular dependency detected: [ext-1, ext-2, ext-1]"</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of CircularDependencyError
     */
    public static CircularDependencyError of() {
        return new CircularDependencyErrorImpl();
    }

    /**
     * factory method to create a shallow copy CircularDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static CircularDependencyError of(final CircularDependencyError template) {
        CircularDependencyErrorImpl instance = new CircularDependencyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public CircularDependencyError copyDeep();

    /**
     * factory method to create a deep copy of CircularDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CircularDependencyError deepCopy(@Nullable final CircularDependencyError template) {
        if (template == null) {
            return null;
        }
        CircularDependencyErrorImpl instance = new CircularDependencyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for CircularDependencyError
     * @return builder
     */
    public static CircularDependencyErrorBuilder builder() {
        return CircularDependencyErrorBuilder.of();
    }

    /**
     * create builder for CircularDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CircularDependencyErrorBuilder builder(final CircularDependencyError template) {
        return CircularDependencyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCircularDependencyError(Function<CircularDependencyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CircularDependencyError> typeReference() {
        return new tools.jackson.core.type.TypeReference<CircularDependencyError>() {
            @Override
            public String toString() {
                return "TypeReference<CircularDependencyError>";
            }
        };
    }
}
