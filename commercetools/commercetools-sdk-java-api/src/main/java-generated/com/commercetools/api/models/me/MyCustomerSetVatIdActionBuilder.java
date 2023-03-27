
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetVatIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetVatIdAction myCustomerSetVatIdAction = MyCustomerSetVatIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetVatIdActionBuilder implements Builder<MyCustomerSetVatIdAction> {

    @Nullable
    private String vatId;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param vatId value to be set
     * @return Builder
     */

    public MyCustomerSetVatIdActionBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return vatId
     */

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    /**
     * builds MyCustomerSetVatIdAction with checking for non-null required values
     * @return MyCustomerSetVatIdAction
     */
    public MyCustomerSetVatIdAction build() {
        return new MyCustomerSetVatIdActionImpl(vatId);
    }

    /**
     * builds MyCustomerSetVatIdAction without checking for non-null required values
     * @return MyCustomerSetVatIdAction
     */
    public MyCustomerSetVatIdAction buildUnchecked() {
        return new MyCustomerSetVatIdActionImpl(vatId);
    }

    /**
     * factory method for an instance of MyCustomerSetVatIdActionBuilder
     * @return builder
     */
    public static MyCustomerSetVatIdActionBuilder of() {
        return new MyCustomerSetVatIdActionBuilder();
    }

    /**
     * create builder for MyCustomerSetVatIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetVatIdActionBuilder of(final MyCustomerSetVatIdAction template) {
        MyCustomerSetVatIdActionBuilder builder = new MyCustomerSetVatIdActionBuilder();
        builder.vatId = template.getVatId();
        return builder;
    }

}
