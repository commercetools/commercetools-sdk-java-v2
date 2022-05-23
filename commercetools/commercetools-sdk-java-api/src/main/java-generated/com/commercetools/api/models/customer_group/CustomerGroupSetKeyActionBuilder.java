
package com.commercetools.api.models.customer_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerGroupSetKeyAction customerGroupSetKeyAction = CustomerGroupSetKeyAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupSetKeyActionBuilder implements Builder<CustomerGroupSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     */

    public CustomerGroupSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CustomerGroupSetKeyAction build() {
        return new CustomerGroupSetKeyActionImpl(key);
    }

    /**
     * builds CustomerGroupSetKeyAction without checking for non null required values
     */
    public CustomerGroupSetKeyAction buildUnchecked() {
        return new CustomerGroupSetKeyActionImpl(key);
    }

    public static CustomerGroupSetKeyActionBuilder of() {
        return new CustomerGroupSetKeyActionBuilder();
    }

    public static CustomerGroupSetKeyActionBuilder of(final CustomerGroupSetKeyAction template) {
        CustomerGroupSetKeyActionBuilder builder = new CustomerGroupSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
