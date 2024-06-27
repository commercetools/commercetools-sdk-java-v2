
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
 *  <p>Returned as response to the Search Customers request in case the Customer Search API is not active for the Project.</p>
 *  <p>Use the Change Customer Search Status update action on the Project to activate the API.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLCustomerSearchProjectNotIndexedError graphQLCustomerSearchProjectNotIndexedError = GraphQLCustomerSearchProjectNotIndexedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface GraphQLCustomerSearchProjectNotIndexedError extends GraphQLErrorObject {

    /**
     *  <p><code>"ResourceNotFound"</code></p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method to create a deep copy of GraphQLCustomerSearchProjectNotIndexedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLCustomerSearchProjectNotIndexedError deepCopy(
            @Nullable final GraphQLCustomerSearchProjectNotIndexedError template) {
        if (template == null) {
            return null;
        }
        GraphQLCustomerSearchProjectNotIndexedErrorImpl instance = new GraphQLCustomerSearchProjectNotIndexedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLCustomerSearchProjectNotIndexedError(
            Function<GraphQLCustomerSearchProjectNotIndexedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLCustomerSearchProjectNotIndexedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLCustomerSearchProjectNotIndexedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLCustomerSearchProjectNotIndexedError>";
            }
        };
    }
}
