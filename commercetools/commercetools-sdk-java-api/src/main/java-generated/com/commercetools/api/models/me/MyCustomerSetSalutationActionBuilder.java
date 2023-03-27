
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetSalutationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetSalutationAction myCustomerSetSalutationAction = MyCustomerSetSalutationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetSalutationActionBuilder implements Builder<MyCustomerSetSalutationAction> {

    @Nullable
    private String salutation;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param salutation value to be set
     * @return Builder
     */

    public MyCustomerSetSalutationActionBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return salutation
     */

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    /**
     * builds MyCustomerSetSalutationAction with checking for non-null required values
     * @return MyCustomerSetSalutationAction
     */
    public MyCustomerSetSalutationAction build() {
        return new MyCustomerSetSalutationActionImpl(salutation);
    }

    /**
     * builds MyCustomerSetSalutationAction without checking for non-null required values
     * @return MyCustomerSetSalutationAction
     */
    public MyCustomerSetSalutationAction buildUnchecked() {
        return new MyCustomerSetSalutationActionImpl(salutation);
    }

    /**
     * factory method for an instance of MyCustomerSetSalutationActionBuilder
     * @return builder
     */
    public static MyCustomerSetSalutationActionBuilder of() {
        return new MyCustomerSetSalutationActionBuilder();
    }

    /**
     * create builder for MyCustomerSetSalutationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetSalutationActionBuilder of(final MyCustomerSetSalutationAction template) {
        MyCustomerSetSalutationActionBuilder builder = new MyCustomerSetSalutationActionBuilder();
        builder.salutation = template.getSalutation();
        return builder;
    }

}
