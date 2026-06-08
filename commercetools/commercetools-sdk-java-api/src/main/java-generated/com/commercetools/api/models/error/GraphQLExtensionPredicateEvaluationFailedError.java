
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
 *  <p>Returned when the predicate defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ExtensionTrigger" rel="nofollow">ExtensionTrigger</a> could not be evaluated due to a missing field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionPredicateEvaluationFailedError graphQLExtensionPredicateEvaluationFailedError = GraphQLExtensionPredicateEvaluationFailedError.builder()
 *             .errorByExtension(errorByExtensionBuilder -> errorByExtensionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtensionPredicateEvaluationFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExtensionPredicateEvaluationFailedErrorImpl.class)
public interface GraphQLExtensionPredicateEvaluationFailedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExtensionPredicateEvaluationFailedError
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
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @return errorByExtension
     */
    @NotNull
    @Valid
    @JsonProperty("errorByExtension")
    public ErrorByExtension getErrorByExtension();

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @param errorByExtension value to be set
     */

    public void setErrorByExtension(final ErrorByExtension errorByExtension);

    /**
     * factory method
     * @return instance of GraphQLExtensionPredicateEvaluationFailedError
     */
    public static GraphQLExtensionPredicateEvaluationFailedError of() {
        return new GraphQLExtensionPredicateEvaluationFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExtensionPredicateEvaluationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExtensionPredicateEvaluationFailedError of(
            final GraphQLExtensionPredicateEvaluationFailedError template) {
        GraphQLExtensionPredicateEvaluationFailedErrorImpl instance = new GraphQLExtensionPredicateEvaluationFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setErrorByExtension(template.getErrorByExtension());
        return instance;
    }

    public GraphQLExtensionPredicateEvaluationFailedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLExtensionPredicateEvaluationFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExtensionPredicateEvaluationFailedError deepCopy(
            @Nullable final GraphQLExtensionPredicateEvaluationFailedError template) {
        if (template == null) {
            return null;
        }
        GraphQLExtensionPredicateEvaluationFailedErrorImpl instance = new GraphQLExtensionPredicateEvaluationFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setErrorByExtension(
            com.commercetools.api.models.error.ErrorByExtension.deepCopy(template.getErrorByExtension()));
        return instance;
    }

    /**
     * builder factory method for GraphQLExtensionPredicateEvaluationFailedError
     * @return builder
     */
    public static GraphQLExtensionPredicateEvaluationFailedErrorBuilder builder() {
        return GraphQLExtensionPredicateEvaluationFailedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExtensionPredicateEvaluationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionPredicateEvaluationFailedErrorBuilder builder(
            final GraphQLExtensionPredicateEvaluationFailedError template) {
        return GraphQLExtensionPredicateEvaluationFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExtensionPredicateEvaluationFailedError(
            Function<GraphQLExtensionPredicateEvaluationFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLExtensionPredicateEvaluationFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLExtensionPredicateEvaluationFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExtensionPredicateEvaluationFailedError>";
            }
        };
    }
}
