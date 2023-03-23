
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

    public void setMessage(final String message);

    public static SemanticErrorError of() {
        return new SemanticErrorErrorImpl();
    }

    public static SemanticErrorError of(final SemanticErrorError template) {
        SemanticErrorErrorImpl instance = new SemanticErrorErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static SemanticErrorErrorBuilder builder() {
        return SemanticErrorErrorBuilder.of();
    }

    public static SemanticErrorErrorBuilder builder(final SemanticErrorError template) {
        return SemanticErrorErrorBuilder.of(template);
    }

    default <T> T withSemanticErrorError(Function<SemanticErrorError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SemanticErrorError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SemanticErrorError>() {
            @Override
            public String toString() {
                return "TypeReference<SemanticErrorError>";
            }
        };
    }
}
