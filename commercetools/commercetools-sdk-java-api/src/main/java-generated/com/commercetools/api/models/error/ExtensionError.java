
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    public void setCode(final String code);

    public void setMessage(final String message);

    public void setExtensionId(final String extensionId);

    public void setExtensionKey(final String extensionKey);

    @JsonAnySetter
    public void setValue(String key, Object value);

    public static ExtensionError of() {
        return new ExtensionErrorImpl();
    }

    public static ExtensionError of(final ExtensionError template) {
        ExtensionErrorImpl instance = new ExtensionErrorImpl();
        instance.setCode(template.getCode());
        instance.setMessage(template.getMessage());
        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());

        return instance;
    }

    public static ExtensionErrorBuilder builder() {
        return ExtensionErrorBuilder.of();
    }

    public static ExtensionErrorBuilder builder(final ExtensionError template) {
        return ExtensionErrorBuilder.of(template);
    }

    default <T> T withExtensionError(Function<ExtensionError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionError>";
            }
        };
    }
}
