
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Discount predicate or API Extension predicate is not semantically correct.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SemanticErrorError semanticErrorError = SemanticErrorError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SemanticErrorErrorImpl.class)
public interface SemanticErrorError extends ErrorObject {

    /**
     * discriminator value for SemanticErrorError
     */
    String SEMANTIC_ERROR = "SemanticError";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Plain text description of the error concerning the predicate. For example, <code>"Invalid country code $countryCode provided for the field $fieldDefinition."</code>.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Plain text description of the error concerning the predicate. For example, <code>"Invalid country code $countryCode provided for the field $fieldDefinition."</code>.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of SemanticErrorError
     */
    public static SemanticErrorError of() {
        return new SemanticErrorErrorImpl();
    }

    /**
     * factory method to copy an instance of SemanticErrorError
     * @param template instance to be copied
     * @return copy instance
     */
    public static SemanticErrorError of(final SemanticErrorError template) {
        SemanticErrorErrorImpl instance = new SemanticErrorErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    /**
     * builder factory method for SemanticErrorError
     * @return builder
     */
    public static SemanticErrorErrorBuilder builder() {
        return SemanticErrorErrorBuilder.of();
    }

    /**
     * create builder for SemanticErrorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SemanticErrorErrorBuilder builder(final SemanticErrorError template) {
        return SemanticErrorErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSemanticErrorError(Function<SemanticErrorError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SemanticErrorError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SemanticErrorError>() {
            @Override
            public String toString() {
                return "TypeReference<SemanticErrorError>";
            }
        };
    }
}
