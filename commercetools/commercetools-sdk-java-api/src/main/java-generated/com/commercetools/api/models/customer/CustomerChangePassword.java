
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerChangePassword
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerChangePassword customerChangePassword = CustomerChangePassword.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .currentPassword("{currentPassword}")
 *             .newPassword("{newPassword}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerChangePasswordImpl.class)
public interface CustomerChangePassword {

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

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
     *  <p>Unique identifier of the Customer.</p>
     * @param id value to be set
     */

    public void setId(final String id);

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
     * @return instance of CustomerChangePassword
     */
    public static CustomerChangePassword of() {
        return new CustomerChangePasswordImpl();
    }

    /**
     * factory method to create a shallow copy CustomerChangePassword
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerChangePassword of(final CustomerChangePassword template) {
        CustomerChangePasswordImpl instance = new CustomerChangePasswordImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCurrentPassword(template.getCurrentPassword());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerChangePassword
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerChangePassword deepCopy(@Nullable final CustomerChangePassword template) {
        if (template == null) {
            return null;
        }
        CustomerChangePasswordImpl instance = new CustomerChangePasswordImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCurrentPassword(template.getCurrentPassword());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    /**
     * builder factory method for CustomerChangePassword
     * @return builder
     */
    public static CustomerChangePasswordBuilder builder() {
        return CustomerChangePasswordBuilder.of();
    }

    /**
     * create builder for CustomerChangePassword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerChangePasswordBuilder builder(final CustomerChangePassword template) {
        return CustomerChangePasswordBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerChangePassword(Function<CustomerChangePassword, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerChangePassword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerChangePassword>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerChangePassword>";
            }
        };
    }
}
