
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetLastNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetLastNameAction myCustomerSetLastNameAction = MyCustomerSetLastNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetLastNameActionBuilder implements Builder<MyCustomerSetLastNameAction> {

    @Nullable
    private String lastName;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param lastName value to be set
     * @return Builder
     */

    public MyCustomerSetLastNameActionBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return lastName
     */

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    /**
     * builds MyCustomerSetLastNameAction with checking for non-null required values
     * @return MyCustomerSetLastNameAction
     */
    public MyCustomerSetLastNameAction build() {
        return new MyCustomerSetLastNameActionImpl(lastName);
    }

    /**
     * builds MyCustomerSetLastNameAction without checking for non-null required values
     * @return MyCustomerSetLastNameAction
     */
    public MyCustomerSetLastNameAction buildUnchecked() {
        return new MyCustomerSetLastNameActionImpl(lastName);
    }

    /**
     * factory method for an instance of MyCustomerSetLastNameActionBuilder
     * @return builder
     */
    public static MyCustomerSetLastNameActionBuilder of() {
        return new MyCustomerSetLastNameActionBuilder();
    }

    /**
     * create builder for MyCustomerSetLastNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetLastNameActionBuilder of(final MyCustomerSetLastNameAction template) {
        MyCustomerSetLastNameActionBuilder builder = new MyCustomerSetLastNameActionBuilder();
        builder.lastName = template.getLastName();
        return builder;
    }

}
