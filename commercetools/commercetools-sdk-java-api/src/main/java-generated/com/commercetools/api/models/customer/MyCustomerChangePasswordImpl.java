
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * MyCustomerChangePassword
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerChangePasswordImpl implements MyCustomerChangePassword, ModelBase {

    private Long version;

    private String currentPassword;

    private String newPassword;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCustomerChangePasswordImpl(@JsonProperty("version") final Long version,
            @JsonProperty("currentPassword") final String currentPassword,
            @JsonProperty("newPassword") final String newPassword) {
        this.version = version;
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }

    /**
     * create empty instance
     */
    public MyCustomerChangePasswordImpl() {
    }

    /**
     *  <p>Expected version of the Customer on which the changes should be applied.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Current password of the Customer.</p>
     *  <p>If the current password does not match, an InvalidCurrentPassword error is returned.</p>
     */

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    /**
     *  <p>New password to be set.</p>
     */

    public String getNewPassword() {
        return this.newPassword;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCurrentPassword(final String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public void setNewPassword(final String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCustomerChangePasswordImpl that = (MyCustomerChangePasswordImpl) o;

        return new EqualsBuilder().append(version, that.version)
                .append(currentPassword, that.currentPassword)
                .append(newPassword, that.newPassword)
                .append(version, that.version)
                .append(currentPassword, that.currentPassword)
                .append(newPassword, that.newPassword)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(currentPassword).append(newPassword).toHashCode();
    }

}
