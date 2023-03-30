
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a preview to find an appropriate Shipping Method for an OrderEdit could not be generated.</p>
 *  <p>The error is returned as a failed response to the Get Shipping Methods for an OrderEdit request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEditPreviewFailedError graphQLEditPreviewFailedError = GraphQLEditPreviewFailedError.builder()
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLEditPreviewFailedErrorImpl.class)
public interface GraphQLEditPreviewFailedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLEditPreviewFailedError
     */
    String EDIT_PREVIEW_FAILED = "EditPreviewFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @return result
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public OrderEditPreviewFailure getResult();

    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     * @param result value to be set
     */

    public void setResult(final OrderEditPreviewFailure result);

    /**
     * factory method
     * @return instance of GraphQLEditPreviewFailedError
     */
    public static GraphQLEditPreviewFailedError of() {
        return new GraphQLEditPreviewFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLEditPreviewFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLEditPreviewFailedError of(final GraphQLEditPreviewFailedError template) {
        GraphQLEditPreviewFailedErrorImpl instance = new GraphQLEditPreviewFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setResult(template.getResult());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLEditPreviewFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLEditPreviewFailedError deepCopy(@Nullable final GraphQLEditPreviewFailedError template) {
        if (template == null) {
            return null;
        }
        GraphQLEditPreviewFailedErrorImpl instance = new GraphQLEditPreviewFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setResult(
            com.commercetools.api.models.order_edit.OrderEditPreviewFailure.deepCopy(template.getResult()));
        return instance;
    }

    /**
     * builder factory method for GraphQLEditPreviewFailedError
     * @return builder
     */
    public static GraphQLEditPreviewFailedErrorBuilder builder() {
        return GraphQLEditPreviewFailedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLEditPreviewFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEditPreviewFailedErrorBuilder builder(final GraphQLEditPreviewFailedError template) {
        return GraphQLEditPreviewFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLEditPreviewFailedError(Function<GraphQLEditPreviewFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLEditPreviewFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLEditPreviewFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLEditPreviewFailedError>";
            }
        };
    }
}
