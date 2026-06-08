
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
 *  <p>Returned when the request conflicts with the current state of the involved resources. Typically, the request attempts to modify a resource that is out of date (that is modified by another client since it was last retrieved). The client application should resolve the conflict (with or without involving the end user) before retrying the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConcurrentModificationError concurrentModificationError = ConcurrentModificationError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ConcurrentModification")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ConcurrentModificationErrorImpl.class)
public interface ConcurrentModificationError extends ErrorObject {

    /**
     * discriminator value for ConcurrentModificationError
     */
    String CONCURRENT_MODIFICATION = "ConcurrentModification";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Object $resourceId has a different version than expected. Expected: $expectedVersion - Actual: $currentVersion."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Current version of the resource.</p>
     * @return currentVersion
     */

    @JsonProperty("currentVersion")
    public Long getCurrentVersion();

    /**
     *  <p><code>"Object $resourceId has a different version than expected. Expected: $expectedVersion - Actual: $currentVersion."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Current version of the resource.</p>
     * @param currentVersion value to be set
     */

    public void setCurrentVersion(final Long currentVersion);

    /**
     * factory method
     * @return instance of ConcurrentModificationError
     */
    public static ConcurrentModificationError of() {
        return new ConcurrentModificationErrorImpl();
    }

    /**
     * factory method to create a shallow copy ConcurrentModificationError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ConcurrentModificationError of(final ConcurrentModificationError template) {
        ConcurrentModificationErrorImpl instance = new ConcurrentModificationErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setCurrentVersion(template.getCurrentVersion());
        return instance;
    }

    public ConcurrentModificationError copyDeep();

    /**
     * factory method to create a deep copy of ConcurrentModificationError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ConcurrentModificationError deepCopy(@Nullable final ConcurrentModificationError template) {
        if (template == null) {
            return null;
        }
        ConcurrentModificationErrorImpl instance = new ConcurrentModificationErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setCurrentVersion(template.getCurrentVersion());
        return instance;
    }

    /**
     * builder factory method for ConcurrentModificationError
     * @return builder
     */
    public static ConcurrentModificationErrorBuilder builder() {
        return ConcurrentModificationErrorBuilder.of();
    }

    /**
     * create builder for ConcurrentModificationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConcurrentModificationErrorBuilder builder(final ConcurrentModificationError template) {
        return ConcurrentModificationErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withConcurrentModificationError(Function<ConcurrentModificationError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ConcurrentModificationError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ConcurrentModificationError>() {
            @Override
            public String toString() {
                return "TypeReference<ConcurrentModificationError>";
            }
        };
    }
}
