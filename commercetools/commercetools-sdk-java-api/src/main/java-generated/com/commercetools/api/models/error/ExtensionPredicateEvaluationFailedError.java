
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the predicate defined in the ExtensionTrigger could not be evaluated due to a missing field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionPredicateEvaluationFailedError extensionPredicateEvaluationFailedError = ExtensionPredicateEvaluationFailedError.builder()
 *             .message("{message}")
 *             .errorByExtension(errorByExtensionBuilder -> errorByExtensionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionPredicateEvaluationFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionPredicateEvaluationFailedErrorImpl.class)
public interface ExtensionPredicateEvaluationFailedError extends ErrorObject {

    /**
     * discriminator value for ExtensionPredicateEvaluationFailedError
     */
    String EXTENSION_PREDICATE_EVALUATION_FAILED = "ExtensionPredicateEvaluationFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The compared field $fieldName is not present."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @return errorByExtension
     */
    @NotNull
    @Valid
    @JsonProperty("errorByExtension")
    public ErrorByExtension getErrorByExtension();

    /**
     *  <p><code>"The compared field $fieldName is not present."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param errorByExtension value to be set
     */

    public void setErrorByExtension(final ErrorByExtension errorByExtension);

    /**
     * factory method
     * @return instance of ExtensionPredicateEvaluationFailedError
     */
    public static ExtensionPredicateEvaluationFailedError of() {
        return new ExtensionPredicateEvaluationFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionPredicateEvaluationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionPredicateEvaluationFailedError of(final ExtensionPredicateEvaluationFailedError template) {
        ExtensionPredicateEvaluationFailedErrorImpl instance = new ExtensionPredicateEvaluationFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setErrorByExtension(template.getErrorByExtension());
        return instance;
    }

    public ExtensionPredicateEvaluationFailedError copyDeep();

    /**
     * factory method to create a deep copy of ExtensionPredicateEvaluationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionPredicateEvaluationFailedError deepCopy(
            @Nullable final ExtensionPredicateEvaluationFailedError template) {
        if (template == null) {
            return null;
        }
        ExtensionPredicateEvaluationFailedErrorImpl instance = new ExtensionPredicateEvaluationFailedErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setErrorByExtension(
            com.commercetools.api.models.error.ErrorByExtension.deepCopy(template.getErrorByExtension()));
        return instance;
    }

    /**
     * builder factory method for ExtensionPredicateEvaluationFailedError
     * @return builder
     */
    public static ExtensionPredicateEvaluationFailedErrorBuilder builder() {
        return ExtensionPredicateEvaluationFailedErrorBuilder.of();
    }

    /**
     * create builder for ExtensionPredicateEvaluationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionPredicateEvaluationFailedErrorBuilder builder(
            final ExtensionPredicateEvaluationFailedError template) {
        return ExtensionPredicateEvaluationFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionPredicateEvaluationFailedError(
            Function<ExtensionPredicateEvaluationFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionPredicateEvaluationFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionPredicateEvaluationFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionPredicateEvaluationFailedError>";
            }
        };
    }
}
