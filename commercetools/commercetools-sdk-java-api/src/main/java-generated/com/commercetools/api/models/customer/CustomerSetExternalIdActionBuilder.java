
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerSetExternalIdAction customerSetExternalIdAction = CustomerSetExternalIdAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetExternalIdActionBuilder implements Builder<CustomerSetExternalIdAction> {

    @Nullable
    private String externalId;

    /**
     *  <p>If not defined, the external ID is unset.</p>
     */

    public CustomerSetExternalIdActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    public CustomerSetExternalIdAction build() {
        return new CustomerSetExternalIdActionImpl(externalId);
    }

    /**
     * builds CustomerSetExternalIdAction without checking for non null required values
     */
    public CustomerSetExternalIdAction buildUnchecked() {
        return new CustomerSetExternalIdActionImpl(externalId);
    }

    public static CustomerSetExternalIdActionBuilder of() {
        return new CustomerSetExternalIdActionBuilder();
    }

    public static CustomerSetExternalIdActionBuilder of(final CustomerSetExternalIdAction template) {
        CustomerSetExternalIdActionBuilder builder = new CustomerSetExternalIdActionBuilder();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
