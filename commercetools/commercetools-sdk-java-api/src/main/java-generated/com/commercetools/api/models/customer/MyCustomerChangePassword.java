
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
 * MyCustomerChangePassword
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerChangePassword myCustomerChangePassword = MyCustomerChangePassword.builder()
 *             .version(0.3)
 *             .currentPassword("{currentPassword}")
 *             .newPassword("{newPassword}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerChangePasswordImpl.class)
public interface MyCustomerChangePassword {

    /**
     *  <p>Expected version of the Customer on which the changes should be applied.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Current password of the Customer.</p>
     *  <p>If the current password does not match, an InvalidCurrentPassword error is returned.</p>
     * @return currentPassword
     */
    @NotNull
    @JsonProperty("currentPassword")
    public String getCurrentPassword();

    /**
     *  <p>New password to be set.</p>
     * @return newPassword
     */
    @NotNull
    @JsonProperty("newPassword")
    public String getNewPassword();

    /**
     *  <p>Expected version of the Customer on which the changes should be applied.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Current password of the Customer.</p>
     *  <p>If the current password does not match, an InvalidCurrentPassword error is returned.</p>
     * @param currentPassword value to be set
     */

    public void setCurrentPassword(final String currentPassword);

    /**
     *  <p>New password to be set.</p>
     * @param newPassword value to be set
     */

    public void setNewPassword(final String newPassword);

    /**
     * factory method
     * @return instance of MyCustomerChangePassword
     */
    public static MyCustomerChangePassword of() {
        return new MyCustomerChangePasswordImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerChangePassword
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerChangePassword of(final MyCustomerChangePassword template) {
        MyCustomerChangePasswordImpl instance = new MyCustomerChangePasswordImpl();
        instance.setVersion(template.getVersion());
        instance.setCurrentPassword(template.getCurrentPassword());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    public MyCustomerChangePassword copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerChangePassword
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerChangePassword deepCopy(@Nullable final MyCustomerChangePassword template) {
        if (template == null) {
            return null;
        }
        MyCustomerChangePasswordImpl instance = new MyCustomerChangePasswordImpl();
        instance.setVersion(template.getVersion());
        instance.setCurrentPassword(template.getCurrentPassword());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    /**
     * builder factory method for MyCustomerChangePassword
     * @return builder
     */
    public static MyCustomerChangePasswordBuilder builder() {
        return MyCustomerChangePasswordBuilder.of();
    }

    /**
     * create builder for MyCustomerChangePassword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerChangePasswordBuilder builder(final MyCustomerChangePassword template) {
        return MyCustomerChangePasswordBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerChangePassword(Function<MyCustomerChangePassword, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangePassword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangePassword>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerChangePassword>";
            }
        };
    }
}
