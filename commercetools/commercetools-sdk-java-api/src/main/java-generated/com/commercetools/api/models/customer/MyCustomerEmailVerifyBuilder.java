
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerEmailVerifyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerEmailVerify myCustomerEmailVerify = MyCustomerEmailVerify.builder()
 *             .tokenValue("{tokenValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerEmailVerifyBuilder implements Builder<MyCustomerEmailVerify> {

    private String tokenValue;

    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @param tokenValue value to be set
     * @return Builder
     */

    public MyCustomerEmailVerifyBuilder tokenValue(final String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    public String getTokenValue() {
        return this.tokenValue;
    }

    /**
     * builds MyCustomerEmailVerify with checking for non-null required values
     * @return MyCustomerEmailVerify
     */
    public MyCustomerEmailVerify build() {
        Objects.requireNonNull(tokenValue, MyCustomerEmailVerify.class + ": tokenValue is missing");
        return new MyCustomerEmailVerifyImpl(tokenValue);
    }

    /**
     * builds MyCustomerEmailVerify without checking for non-null required values
     * @return MyCustomerEmailVerify
     */
    public MyCustomerEmailVerify buildUnchecked() {
        return new MyCustomerEmailVerifyImpl(tokenValue);
    }

    public static MyCustomerEmailVerifyBuilder of() {
        return new MyCustomerEmailVerifyBuilder();
    }

    public static MyCustomerEmailVerifyBuilder of(final MyCustomerEmailVerify template) {
        MyCustomerEmailVerifyBuilder builder = new MyCustomerEmailVerifyBuilder();
        builder.tokenValue = template.getTokenValue();
        return builder;
    }

}
