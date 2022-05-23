
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MyCustomerResetPassword myCustomerResetPassword = MyCustomerResetPassword.builder()
           .tokenValue("{tokenValue}")
           .newPassword("{newPassword}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerResetPasswordBuilder implements Builder<MyCustomerResetPassword> {

    private String tokenValue;

    private String newPassword;

    public MyCustomerResetPasswordBuilder tokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    public MyCustomerResetPasswordBuilder newPassword(final String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public MyCustomerResetPassword build() {
        Objects.requireNonNull(tokenValue, MyCustomerResetPassword.class + ": tokenValue is missing");
        Objects.requireNonNull(newPassword, MyCustomerResetPassword.class + ": newPassword is missing");
        return new MyCustomerResetPasswordImpl(tokenValue, newPassword);
    }

    /**
     * builds MyCustomerResetPassword without checking for non null required values
     */
    public MyCustomerResetPassword buildUnchecked() {
        return new MyCustomerResetPasswordImpl(tokenValue, newPassword);
    }

    public static MyCustomerResetPasswordBuilder of() {
        return new MyCustomerResetPasswordBuilder();
    }

    public static MyCustomerResetPasswordBuilder of(final MyCustomerResetPassword template) {
        MyCustomerResetPasswordBuilder builder = new MyCustomerResetPasswordBuilder();
        builder.tokenValue = template.getTokenValue();
        builder.newPassword = template.getNewPassword();
        return builder;
    }

}
