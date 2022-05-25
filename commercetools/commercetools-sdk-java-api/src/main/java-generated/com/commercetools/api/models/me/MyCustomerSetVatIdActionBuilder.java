
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
     *
     */

    public MyCustomerSetVatIdActionBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    public MyCustomerSetVatIdAction build() {
        return new MyCustomerSetVatIdActionImpl(vatId);
    }

    /**
     * builds MyCustomerSetVatIdAction without checking for non null required values
     */
    public MyCustomerSetVatIdAction buildUnchecked() {
        return new MyCustomerSetVatIdActionImpl(vatId);
    }

    public static MyCustomerSetVatIdActionBuilder of() {
        return new MyCustomerSetVatIdActionBuilder();
    }

    public static MyCustomerSetVatIdActionBuilder of(final MyCustomerSetVatIdAction template) {
        MyCustomerSetVatIdActionBuilder builder = new MyCustomerSetVatIdActionBuilder();
        builder.vatId = template.getVatId();
        return builder;
    }

}
