
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Changes the <code>email</code> of the Customer and sets the <code>isEmailVerified</code> property to <code>false</code>. This update action generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerEmailChangedMessage" rel="nofollow">CustomerEmailChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerChangeEmailAction customerChangeEmailAction = CustomerChangeEmailAction.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeEmail")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerChangeEmailActionImpl.class)
public interface CustomerChangeEmailAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerChangeEmailAction
     */
    String CHANGE_EMAIL = "changeEmail";

    /**
     *  <p>Value to set.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Value to set.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     * factory method
     * @return instance of CustomerChangeEmailAction
     */
    public static CustomerChangeEmailAction of() {
        return new CustomerChangeEmailActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerChangeEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerChangeEmailAction of(final CustomerChangeEmailAction template) {
        CustomerChangeEmailActionImpl instance = new CustomerChangeEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public CustomerChangeEmailAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerChangeEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerChangeEmailAction deepCopy(@Nullable final CustomerChangeEmailAction template) {
        if (template == null) {
            return null;
        }
        CustomerChangeEmailActionImpl instance = new CustomerChangeEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * builder factory method for CustomerChangeEmailAction
     * @return builder
     */
    public static CustomerChangeEmailActionBuilder builder() {
        return CustomerChangeEmailActionBuilder.of();
    }

    /**
     * create builder for CustomerChangeEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerChangeEmailActionBuilder builder(final CustomerChangeEmailAction template) {
        return CustomerChangeEmailActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerChangeEmailAction(Function<CustomerChangeEmailAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerChangeEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerChangeEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerChangeEmailAction>";
            }
        };
    }
}
