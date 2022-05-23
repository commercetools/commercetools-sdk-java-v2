
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerChangeEmailActionBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerChangeEmailActionBuilder implements Builder<MyCustomerChangeEmailAction> {

    private String email;

    /**
     <>
     */

    public MyCustomerChangeEmailActionBuilder email(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public MyCustomerChangeEmailAction build() {
        Objects.requireNonNull(email, MyCustomerChangeEmailAction.class + ": email is missing");
        return new MyCustomerChangeEmailActionImpl(email);
    }

    /**
     * builds MyCustomerChangeEmailAction without checking for non null required values
     */
    public MyCustomerChangeEmailAction buildUnchecked() {
        return new MyCustomerChangeEmailActionImpl(email);
    }

    public static MyCustomerChangeEmailActionBuilder of() {
        return new MyCustomerChangeEmailActionBuilder();
    }

    public static MyCustomerChangeEmailActionBuilder of(final MyCustomerChangeEmailAction template) {
        MyCustomerChangeEmailActionBuilder builder = new MyCustomerChangeEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
