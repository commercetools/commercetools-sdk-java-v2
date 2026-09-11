
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
 *  <p>Returned when a referenced Extension does not exist or is not applicable to the same trigger.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingDependencyError missingDependencyError = MissingDependencyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingDependency")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingDependencyErrorImpl.class)
public interface MissingDependencyError extends ErrorObject {

    /**
     * discriminator value for MissingDependencyError
     */
    String MISSING_DEPENDENCY = "MissingDependency";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The extensions '[ext-1, ext-2]' referenced in 'dependencies' do not exist."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The extensions '[ext-1, ext-2]' referenced in 'dependencies' do not exist."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of MissingDependencyError
     */
    public static MissingDependencyError of() {
        return new MissingDependencyErrorImpl();
    }

    /**
     * factory method to create a shallow copy MissingDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MissingDependencyError of(final MissingDependencyError template) {
        MissingDependencyErrorImpl instance = new MissingDependencyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public MissingDependencyError copyDeep();

    /**
     * factory method to create a deep copy of MissingDependencyError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MissingDependencyError deepCopy(@Nullable final MissingDependencyError template) {
        if (template == null) {
            return null;
        }
        MissingDependencyErrorImpl instance = new MissingDependencyErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for MissingDependencyError
     * @return builder
     */
    public static MissingDependencyErrorBuilder builder() {
        return MissingDependencyErrorBuilder.of();
    }

    /**
     * create builder for MissingDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MissingDependencyErrorBuilder builder(final MissingDependencyError template) {
        return MissingDependencyErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMissingDependencyError(Function<MissingDependencyError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<MissingDependencyError> typeReference() {
        return new tools.jackson.core.type.TypeReference<MissingDependencyError>() {
            @Override
            public String toString() {
                return "TypeReference<MissingDependencyError>";
            }
        };
    }
}
