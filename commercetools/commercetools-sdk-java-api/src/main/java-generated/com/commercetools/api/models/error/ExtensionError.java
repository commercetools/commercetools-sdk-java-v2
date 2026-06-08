
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ExtensionError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionError extensionError = ExtensionError.builder()
 *             .code("{code}")
 *             .message("{message}")
 *             .extensionId("{extensionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionErrorImpl.class)
public interface ExtensionError {

    /**
     *  <p>Error code caused by the Extension. For example, <code>InvalidField</code>.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the error.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @return extensionId
     */
    @NotNull
    @JsonProperty("extensionId")
    public String getExtensionId();

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @return extensionKey
     */

    @JsonProperty("extensionKey")
    public String getExtensionKey();

    /**
     *  <p>Error-specific additional fields.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    /**
     *  <p>Error code caused by the Extension. For example, <code>InvalidField</code>.</p>
     * @param code value to be set
     */

    public void setCode(final String code);

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the Extension.</p>
     * @param extensionId value to be set
     */

    public void setExtensionId(final String extensionId);

    /**
     *  <p>User-defined unique identifier of the Extension.</p>
     * @param extensionKey value to be set
     */

    public void setExtensionKey(final String extensionKey);

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, Object value);

    /**
     * factory method
     * @return instance of ExtensionError
     */
    public static ExtensionError of() {
        return new ExtensionErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionError of(final ExtensionError template) {
        ExtensionErrorImpl instance = new ExtensionErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ExtensionError copyDeep();

    /**
     * factory method to create a deep copy of ExtensionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionError deepCopy(@Nullable final ExtensionError template) {
        if (template == null) {
            return null;
        }
        ExtensionErrorImpl instance = new ExtensionErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ExtensionError
     * @return builder
     */
    public static ExtensionErrorBuilder builder() {
        return ExtensionErrorBuilder.of();
    }

    /**
     * create builder for ExtensionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionErrorBuilder builder(final ExtensionError template) {
        return ExtensionErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionError(Function<ExtensionError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionError>";
            }
        };
    }
}
