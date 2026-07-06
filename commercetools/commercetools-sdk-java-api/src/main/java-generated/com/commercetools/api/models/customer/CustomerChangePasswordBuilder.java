
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerChangePasswordBuilder
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
public class CustomerChangePasswordBuilder implements Builder<CustomerChangePassword> {

    private String id;

    private Long version;

    private String currentPassword;

    private String newPassword;

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerChangePasswordBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Expected version of the Customer on which the changes should be applied.</p>
     * @param version value to be set
     * @return Builder
     */

    public CustomerChangePasswordBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Current password of the Customer.</p>
     *  <p>If the current password does not match, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidCurrentPasswordError" rel="nofollow">InvalidCurrentPassword</a> error is returned.</p>
     * @param currentPassword value to be set
     * @return Builder
     */

    public CustomerChangePasswordBuilder currentPassword(final String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    /**
     *  <p>New password to be set.</p>
     * @param newPassword value to be set
     * @return Builder
     */

    public CustomerChangePasswordBuilder newPassword(final String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Expected version of the Customer on which the changes should be applied.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Current password of the Customer.</p>
     *  <p>If the current password does not match, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidCurrentPasswordError" rel="nofollow">InvalidCurrentPassword</a> error is returned.</p>
     * @return currentPassword
     */

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    /**
     *  <p>New password to be set.</p>
     * @return newPassword
     */

    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * builds CustomerChangePassword with checking for non-null required values
     * @return CustomerChangePassword
     */
    public CustomerChangePassword build() {
        Objects.requireNonNull(id, CustomerChangePassword.class + ": id is missing");
        Objects.requireNonNull(version, CustomerChangePassword.class + ": version is missing");
        Objects.requireNonNull(currentPassword, CustomerChangePassword.class + ": currentPassword is missing");
        Objects.requireNonNull(newPassword, CustomerChangePassword.class + ": newPassword is missing");
        return new CustomerChangePasswordImpl(id, version, currentPassword, newPassword);
    }

    /**
     * builds CustomerChangePassword without checking for non-null required values
     * @return CustomerChangePassword
     */
    public CustomerChangePassword buildUnchecked() {
        return new CustomerChangePasswordImpl(id, version, currentPassword, newPassword);
    }

    /**
     * factory method for an instance of CustomerChangePasswordBuilder
     * @return builder
     */
    public static CustomerChangePasswordBuilder of() {
        return new CustomerChangePasswordBuilder();
    }

    /**
     * create builder for CustomerChangePassword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerChangePasswordBuilder of(final CustomerChangePassword template) {
        CustomerChangePasswordBuilder builder = new CustomerChangePasswordBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.currentPassword = template.getCurrentPassword();
        builder.newPassword = template.getNewPassword();
        return builder;
    }

}
