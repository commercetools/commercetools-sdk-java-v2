
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
 *  <p>Returned when the requested feature was removed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FeatureRemovedError featureRemovedError = FeatureRemovedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("FeatureRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = FeatureRemovedErrorImpl.class)
public interface FeatureRemovedError extends ErrorObject {

    /**
     * discriminator value for FeatureRemovedError
     */
    String FEATURE_REMOVED = "FeatureRemoved";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Description of the feature that is removed.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Description of the feature that is removed.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of FeatureRemovedError
     */
    public static FeatureRemovedError of() {
        return new FeatureRemovedErrorImpl();
    }

    /**
     * factory method to create a shallow copy FeatureRemovedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static FeatureRemovedError of(final FeatureRemovedError template) {
        FeatureRemovedErrorImpl instance = new FeatureRemovedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public FeatureRemovedError copyDeep();

    /**
     * factory method to create a deep copy of FeatureRemovedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FeatureRemovedError deepCopy(@Nullable final FeatureRemovedError template) {
        if (template == null) {
            return null;
        }
        FeatureRemovedErrorImpl instance = new FeatureRemovedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for FeatureRemovedError
     * @return builder
     */
    public static FeatureRemovedErrorBuilder builder() {
        return FeatureRemovedErrorBuilder.of();
    }

    /**
     * create builder for FeatureRemovedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FeatureRemovedErrorBuilder builder(final FeatureRemovedError template) {
        return FeatureRemovedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFeatureRemovedError(Function<FeatureRemovedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FeatureRemovedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FeatureRemovedError>() {
            @Override
            public String toString() {
                return "TypeReference<FeatureRemovedError>";
            }
        };
    }
}
