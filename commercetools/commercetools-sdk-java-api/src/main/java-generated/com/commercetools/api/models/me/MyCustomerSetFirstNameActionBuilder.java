
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetFirstNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetFirstNameAction myCustomerSetFirstNameAction = MyCustomerSetFirstNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetFirstNameActionBuilder implements Builder<MyCustomerSetFirstNameAction> {

    @Nullable
    private String firstName;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public MyCustomerSetFirstNameActionBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    public MyCustomerSetFirstNameAction build() {
        return new MyCustomerSetFirstNameActionImpl(firstName);
    }

    /**
     * builds MyCustomerSetFirstNameAction without checking for non null required values
     */
    public MyCustomerSetFirstNameAction buildUnchecked() {
        return new MyCustomerSetFirstNameActionImpl(firstName);
    }

    public static MyCustomerSetFirstNameActionBuilder of() {
        return new MyCustomerSetFirstNameActionBuilder();
    }

    public static MyCustomerSetFirstNameActionBuilder of(final MyCustomerSetFirstNameAction template) {
        MyCustomerSetFirstNameActionBuilder builder = new MyCustomerSetFirstNameActionBuilder();
        builder.firstName = template.getFirstName();
        return builder;
    }

}
