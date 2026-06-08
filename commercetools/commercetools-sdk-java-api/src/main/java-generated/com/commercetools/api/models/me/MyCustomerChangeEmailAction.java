
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Changing the email of the Customer produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerEmailChangedMessage" rel="nofollow">CustomerEmailChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerChangeEmailAction myCustomerChangeEmailAction = MyCustomerChangeEmailAction.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeEmail")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerChangeEmailActionImpl.class)
public interface MyCustomerChangeEmailAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerChangeEmailAction
     */
    String CHANGE_EMAIL = "changeEmail";

    /**
     *  <p>New value to set.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>New value to set.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     * factory method
     * @return instance of MyCustomerChangeEmailAction
     */
    public static MyCustomerChangeEmailAction of() {
        return new MyCustomerChangeEmailActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerChangeEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerChangeEmailAction of(final MyCustomerChangeEmailAction template) {
        MyCustomerChangeEmailActionImpl instance = new MyCustomerChangeEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public MyCustomerChangeEmailAction copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerChangeEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerChangeEmailAction deepCopy(@Nullable final MyCustomerChangeEmailAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerChangeEmailActionImpl instance = new MyCustomerChangeEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * builder factory method for MyCustomerChangeEmailAction
     * @return builder
     */
    public static MyCustomerChangeEmailActionBuilder builder() {
        return MyCustomerChangeEmailActionBuilder.of();
    }

    /**
     * create builder for MyCustomerChangeEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerChangeEmailActionBuilder builder(final MyCustomerChangeEmailAction template) {
        return MyCustomerChangeEmailActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerChangeEmailAction(Function<MyCustomerChangeEmailAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangeEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangeEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerChangeEmailAction>";
            }
        };
    }
}
