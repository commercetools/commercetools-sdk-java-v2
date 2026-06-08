
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
 *  <p>Returned when the provided password token of the Customer has expired.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers/password-token={passwordToken}:GET" rel="nofollow">Get Customer by password token</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/customers/password-token={passwordToken}:GET" rel="nofollow">Get Customer in Store by password token</a> requests</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers/password/reset:POST" rel="nofollow">Reset password of Customer</a> and <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/in-store/key={storeKey}/customers/password/reset:POST" rel="nofollow">Reset password of Customer in Store</a> requests</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExpiredCustomerPasswordTokenError graphQLExpiredCustomerPasswordTokenError = GraphQLExpiredCustomerPasswordTokenError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExpiredCustomerPasswordToken")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLExpiredCustomerPasswordTokenErrorImpl.class)
public interface GraphQLExpiredCustomerPasswordTokenError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLExpiredCustomerPasswordTokenError
     */
    String EXPIRED_CUSTOMER_PASSWORD_TOKEN = "ExpiredCustomerPasswordToken";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLExpiredCustomerPasswordTokenError
     */
    public static GraphQLExpiredCustomerPasswordTokenError of() {
        return new GraphQLExpiredCustomerPasswordTokenErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLExpiredCustomerPasswordTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLExpiredCustomerPasswordTokenError of(final GraphQLExpiredCustomerPasswordTokenError template) {
        GraphQLExpiredCustomerPasswordTokenErrorImpl instance = new GraphQLExpiredCustomerPasswordTokenErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLExpiredCustomerPasswordTokenError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLExpiredCustomerPasswordTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLExpiredCustomerPasswordTokenError deepCopy(
            @Nullable final GraphQLExpiredCustomerPasswordTokenError template) {
        if (template == null) {
            return null;
        }
        GraphQLExpiredCustomerPasswordTokenErrorImpl instance = new GraphQLExpiredCustomerPasswordTokenErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLExpiredCustomerPasswordTokenError
     * @return builder
     */
    public static GraphQLExpiredCustomerPasswordTokenErrorBuilder builder() {
        return GraphQLExpiredCustomerPasswordTokenErrorBuilder.of();
    }

    /**
     * create builder for GraphQLExpiredCustomerPasswordTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExpiredCustomerPasswordTokenErrorBuilder builder(
            final GraphQLExpiredCustomerPasswordTokenError template) {
        return GraphQLExpiredCustomerPasswordTokenErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLExpiredCustomerPasswordTokenError(
            Function<GraphQLExpiredCustomerPasswordTokenError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLExpiredCustomerPasswordTokenError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLExpiredCustomerPasswordTokenError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLExpiredCustomerPasswordTokenError>";
            }
        };
    }
}
