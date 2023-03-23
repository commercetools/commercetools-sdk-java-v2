
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCurrentPassword(final String currentPassword);

    public void setNewPassword(final String newPassword);

    public static CustomerChangePassword of() {
        return new CustomerChangePasswordImpl();
    }

    public static CustomerChangePassword of(final CustomerChangePassword template) {
        CustomerChangePasswordImpl instance = new CustomerChangePasswordImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCurrentPassword(template.getCurrentPassword());
        instance.setNewPassword(template.getNewPassword());
        return instance;
    }

    public static CustomerChangePasswordBuilder builder() {
        return CustomerChangePasswordBuilder.of();
    }

    public static CustomerChangePasswordBuilder builder(final CustomerChangePassword template) {
        return CustomerChangePasswordBuilder.of(template);
    }

    default <T> T withCustomerChangePassword(Function<CustomerChangePassword, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerChangePassword> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerChangePassword>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerChangePassword>";
            }
        };
    }
}
