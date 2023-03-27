
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerChangePasswordBuilder
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
public class MyCustomerChangePasswordBuilder implements Builder<MyCustomerChangePassword> {

    private Long version;

    private String currentPassword;

    private String newPassword;

    /**
     *  <p>Expected version of the Customer on which the changes should be applied.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyCustomerChangePasswordBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Current password of the Customer.</p>
     *  <p>If the current password does not match, an InvalidCurrentPassword error is returned.</p>
     * @param currentPassword value to be set
     * @return Builder
     */

    public MyCustomerChangePasswordBuilder currentPassword(final String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    /**
     *  <p>New password to be set.</p>
     * @param newPassword value to be set
     * @return Builder
     */

    public MyCustomerChangePasswordBuilder newPassword(final String newPassword) {
        this.newPassword = newPassword;
        return this;
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
     *  <p>If the current password does not match, an InvalidCurrentPassword error is returned.</p>
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
     * builds MyCustomerChangePassword with checking for non-null required values
     * @return MyCustomerChangePassword
     */
    public MyCustomerChangePassword build() {
        Objects.requireNonNull(version, MyCustomerChangePassword.class + ": version is missing");
        Objects.requireNonNull(currentPassword, MyCustomerChangePassword.class + ": currentPassword is missing");
        Objects.requireNonNull(newPassword, MyCustomerChangePassword.class + ": newPassword is missing");
        return new MyCustomerChangePasswordImpl(version, currentPassword, newPassword);
    }

    /**
     * builds MyCustomerChangePassword without checking for non-null required values
     * @return MyCustomerChangePassword
     */
    public MyCustomerChangePassword buildUnchecked() {
        return new MyCustomerChangePasswordImpl(version, currentPassword, newPassword);
    }

    /**
     * factory method for an instance of MyCustomerChangePasswordBuilder
     * @return builder
     */
    public static MyCustomerChangePasswordBuilder of() {
        return new MyCustomerChangePasswordBuilder();
    }

    /**
     * create builder for MyCustomerChangePassword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerChangePasswordBuilder of(final MyCustomerChangePassword template) {
        MyCustomerChangePasswordBuilder builder = new MyCustomerChangePasswordBuilder();
        builder.version = template.getVersion();
        builder.currentPassword = template.getCurrentPassword();
        builder.newPassword = template.getNewPassword();
        return builder;
    }

}
