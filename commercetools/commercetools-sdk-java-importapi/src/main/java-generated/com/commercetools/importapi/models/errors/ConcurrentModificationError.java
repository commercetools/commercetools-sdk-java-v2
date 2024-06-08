
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request conflicts with the current state of the involved resources. This error typically occurs when the request attempts to modify a resource that is out of date, that is, it has been modified by another client since the last time it was retrieved by the system attempting to update it. The client application should resolve the conflict (with or without involving the end-user) before retrying the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConcurrentModificationError concurrentModificationError = ConcurrentModificationError.builder()
 *             .message("{message}")
 *             .currentVersion(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ConcurrentModificationErrorImpl.class)
public interface ConcurrentModificationError extends ErrorObject {

    /**
     * discriminator value for ConcurrentModificationError
     */
    String CONCURRENT_MODIFICATION = "ConcurrentModification";

    /**
     *  <p>The version specified in the failed request.</p>
     * @return specifiedVersion
     */

    @JsonProperty("specifiedVersion")
    public Long getSpecifiedVersion();

    /**
     *  <p>The current version of the resource.</p>
     * @return currentVersion
     */
    @NotNull
    @JsonProperty("currentVersion")
    public Long getCurrentVersion();

    /**
     *  <p>The resource in conflict.</p>
     * @return conflictedResource
     */

    @JsonProperty("conflictedResource")
    public Object getConflictedResource();

    /**
     *  <p>The version specified in the failed request.</p>
     * @param specifiedVersion value to be set
     */

    public void setSpecifiedVersion(final Long specifiedVersion);

    /**
     *  <p>The current version of the resource.</p>
     * @param currentVersion value to be set
     */

    public void setCurrentVersion(final Long currentVersion);

    /**
     *  <p>The resource in conflict.</p>
     * @param conflictedResource value to be set
     */

    public void setConflictedResource(final Object conflictedResource);

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
        instance.setSpecifiedVersion(template.getSpecifiedVersion());
        instance.setCurrentVersion(template.getCurrentVersion());
        instance.setConflictedResource(template.getConflictedResource());
        return instance;
    }

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
        instance.setSpecifiedVersion(template.getSpecifiedVersion());
        instance.setCurrentVersion(template.getCurrentVersion());
        instance.setConflictedResource(template.getConflictedResource());
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
