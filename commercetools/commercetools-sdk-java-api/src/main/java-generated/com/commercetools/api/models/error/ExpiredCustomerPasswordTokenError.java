
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
 *     ExpiredCustomerPasswordTokenError expiredCustomerPasswordTokenError = ExpiredCustomerPasswordTokenError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExpiredCustomerPasswordToken")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpiredCustomerPasswordTokenErrorImpl.class)
public interface ExpiredCustomerPasswordTokenError extends ErrorObject {

    /**
     * discriminator value for ExpiredCustomerPasswordTokenError
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
     *  <p><code>"The given password token has expired."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The given password token has expired."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ExpiredCustomerPasswordTokenError
     */
    public static ExpiredCustomerPasswordTokenError of() {
        return new ExpiredCustomerPasswordTokenErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExpiredCustomerPasswordTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpiredCustomerPasswordTokenError of(final ExpiredCustomerPasswordTokenError template) {
        ExpiredCustomerPasswordTokenErrorImpl instance = new ExpiredCustomerPasswordTokenErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ExpiredCustomerPasswordTokenError copyDeep();

    /**
     * factory method to create a deep copy of ExpiredCustomerPasswordTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpiredCustomerPasswordTokenError deepCopy(
            @Nullable final ExpiredCustomerPasswordTokenError template) {
        if (template == null) {
            return null;
        }
        ExpiredCustomerPasswordTokenErrorImpl instance = new ExpiredCustomerPasswordTokenErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ExpiredCustomerPasswordTokenError
     * @return builder
     */
    public static ExpiredCustomerPasswordTokenErrorBuilder builder() {
        return ExpiredCustomerPasswordTokenErrorBuilder.of();
    }

    /**
     * create builder for ExpiredCustomerPasswordTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpiredCustomerPasswordTokenErrorBuilder builder(final ExpiredCustomerPasswordTokenError template) {
        return ExpiredCustomerPasswordTokenErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpiredCustomerPasswordTokenError(Function<ExpiredCustomerPasswordTokenError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpiredCustomerPasswordTokenError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpiredCustomerPasswordTokenError>() {
            @Override
            public String toString() {
                return "TypeReference<ExpiredCustomerPasswordTokenError>";
            }
        };
    }
}
