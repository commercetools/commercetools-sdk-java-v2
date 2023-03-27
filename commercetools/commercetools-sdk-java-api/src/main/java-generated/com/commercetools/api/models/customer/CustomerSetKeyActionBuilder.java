
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetKeyAction customerSetKeyAction = CustomerSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetKeyActionBuilder implements Builder<CustomerSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomerSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds CustomerSetKeyAction with checking for non-null required values
     * @return CustomerSetKeyAction
     */
    public CustomerSetKeyAction build() {
        return new CustomerSetKeyActionImpl(key);
    }

    /**
     * builds CustomerSetKeyAction without checking for non-null required values
     * @return CustomerSetKeyAction
     */
    public CustomerSetKeyAction buildUnchecked() {
        return new CustomerSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of CustomerSetKeyActionBuilder
     * @return builder
     */
    public static CustomerSetKeyActionBuilder of() {
        return new CustomerSetKeyActionBuilder();
    }

    /**
     * create builder for CustomerSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetKeyActionBuilder of(final CustomerSetKeyAction template) {
        CustomerSetKeyActionBuilder builder = new CustomerSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
