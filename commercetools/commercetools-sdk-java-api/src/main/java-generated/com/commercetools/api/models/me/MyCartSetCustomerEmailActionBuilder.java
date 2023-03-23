
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetCustomerEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCustomerEmailAction myCartSetCustomerEmailAction = MyCartSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetCustomerEmailActionBuilder implements Builder<MyCartSetCustomerEmailAction> {

    @Nullable
    private String email;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param email
     * @return Builder
     */

    public MyCartSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public MyCartSetCustomerEmailAction build() {
        return new MyCartSetCustomerEmailActionImpl(email);
    }

    /**
     * builds MyCartSetCustomerEmailAction without checking for non null required values
     */
    public MyCartSetCustomerEmailAction buildUnchecked() {
        return new MyCartSetCustomerEmailActionImpl(email);
    }

    public static MyCartSetCustomerEmailActionBuilder of() {
        return new MyCartSetCustomerEmailActionBuilder();
    }

    public static MyCartSetCustomerEmailActionBuilder of(final MyCartSetCustomerEmailAction template) {
        MyCartSetCustomerEmailActionBuilder builder = new MyCartSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
