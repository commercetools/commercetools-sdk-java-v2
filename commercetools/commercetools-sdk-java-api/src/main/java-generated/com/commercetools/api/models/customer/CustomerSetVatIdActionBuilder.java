
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetVatIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetVatIdAction customerSetVatIdAction = CustomerSetVatIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetVatIdActionBuilder implements Builder<CustomerSetVatIdAction> {

    @Nullable
    private String vatId;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public CustomerSetVatIdActionBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    public CustomerSetVatIdAction build() {
        return new CustomerSetVatIdActionImpl(vatId);
    }

    /**
     * builds CustomerSetVatIdAction without checking for non null required values
     */
    public CustomerSetVatIdAction buildUnchecked() {
        return new CustomerSetVatIdActionImpl(vatId);
    }

    public static CustomerSetVatIdActionBuilder of() {
        return new CustomerSetVatIdActionBuilder();
    }

    public static CustomerSetVatIdActionBuilder of(final CustomerSetVatIdAction template) {
        CustomerSetVatIdActionBuilder builder = new CustomerSetVatIdActionBuilder();
        builder.vatId = template.getVatId();
        return builder;
    }

}
