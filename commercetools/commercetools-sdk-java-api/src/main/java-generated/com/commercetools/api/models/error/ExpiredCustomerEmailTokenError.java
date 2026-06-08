
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
 *     ExpiredCustomerEmailTokenError expiredCustomerEmailTokenError = ExpiredCustomerEmailTokenError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExpiredCustomerEmailToken")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExpiredCustomerEmailTokenErrorImpl.class)
public interface ExpiredCustomerEmailTokenError extends ErrorObject {

    /**
     * discriminator value for ExpiredCustomerEmailTokenError
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
     *  <p><code>"The given email token has expired."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The given email token has expired."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ExpiredCustomerEmailTokenError
     */
    public static ExpiredCustomerEmailTokenError of() {
        return new ExpiredCustomerEmailTokenErrorImpl();
    }

    /**
     * factory method to create a shallow copy ExpiredCustomerEmailTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExpiredCustomerEmailTokenError of(final ExpiredCustomerEmailTokenError template) {
        ExpiredCustomerEmailTokenErrorImpl instance = new ExpiredCustomerEmailTokenErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public ExpiredCustomerEmailTokenError copyDeep();

    /**
     * factory method to create a deep copy of ExpiredCustomerEmailTokenError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExpiredCustomerEmailTokenError deepCopy(@Nullable final ExpiredCustomerEmailTokenError template) {
        if (template == null) {
            return null;
        }
        ExpiredCustomerEmailTokenErrorImpl instance = new ExpiredCustomerEmailTokenErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ExpiredCustomerEmailTokenError
     * @return builder
     */
    public static ExpiredCustomerEmailTokenErrorBuilder builder() {
        return ExpiredCustomerEmailTokenErrorBuilder.of();
    }

    /**
     * create builder for ExpiredCustomerEmailTokenError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpiredCustomerEmailTokenErrorBuilder builder(final ExpiredCustomerEmailTokenError template) {
        return ExpiredCustomerEmailTokenErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExpiredCustomerEmailTokenError(Function<ExpiredCustomerEmailTokenError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExpiredCustomerEmailTokenError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExpiredCustomerEmailTokenError>() {
            @Override
            public String toString() {
                return "TypeReference<ExpiredCustomerEmailTokenError>";
            }
        };
    }
}
