
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
 *  <p>Returned when the provided email token of the Customer has expired.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers/email-token={emailToken}:GET" rel="nofollow">Get Customer by email token</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/customers/email-token={emailToken}:GET" rel="nofollow">Get Customer in Store by email token</a> requests</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers/email/confirm:POST" rel="nofollow">Verify email of Customer</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/customers/email/confirm:POST" rel="nofollow">Verify email of Customer in Store</a> requests</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExpiredCustomerEmailTokenError graphQLExpiredCustomerEmailTokenError = GraphQLExpiredCustomerEmailTokenError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExpiredCustomerEmailToken")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExpiredCustomerEmailTokenErrorImpl.class)
public interface GraphQLExpiredCustomerEmailTokenError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExpiredCustomerEmailTokenError
     */
    String EXPIRED_CUSTOMER_EMAIL_TOKEN = "ExpiredCustomerEmailToken";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLExpiredCustomerEmailTokenError
     */
    public static GraphQLExpiredCustomerEmailTokenError of() {
        return new GraphQLExpiredCustomerEmailTokenErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExpiredCustomerEmailTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExpiredCustomerEmailTokenError of(final GraphQLExpiredCustomerEmailTokenError template) {
        GraphQLExpiredCustomerEmailTokenErrorImpl instance = new GraphQLExpiredCustomerEmailTokenErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLExpiredCustomerEmailTokenError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLExpiredCustomerEmailTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExpiredCustomerEmailTokenError deepCopy(
            @Nullable final GraphQLExpiredCustomerEmailTokenError template) {
        if (template == null) {
            return null;
        }
        GraphQLExpiredCustomerEmailTokenErrorImpl instance = new GraphQLExpiredCustomerEmailTokenErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLExpiredCustomerEmailTokenError
     * @return builder
     */
    public static GraphQLExpiredCustomerEmailTokenErrorBuilder builder() {
        return GraphQLExpiredCustomerEmailTokenErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExpiredCustomerEmailTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExpiredCustomerEmailTokenErrorBuilder builder(
            final GraphQLExpiredCustomerEmailTokenError template) {
        return GraphQLExpiredCustomerEmailTokenErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExpiredCustomerEmailTokenError(Function<GraphQLExpiredCustomerEmailTokenError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLExpiredCustomerEmailTokenError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLExpiredCustomerEmailTokenError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExpiredCustomerEmailTokenError>";
            }
        };
    }
}
