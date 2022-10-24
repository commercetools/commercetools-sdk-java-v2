
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetCustomerNumberActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomerNumberAction customerSetCustomerNumberAction = CustomerSetCustomerNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetCustomerNumberActionBuilder implements Builder<CustomerSetCustomerNumberAction> {

    @Nullable
    private String customerNumber;

    /**
     *  <p>Value to set. Once set, it cannot be changed.</p>
     */

    public CustomerSetCustomerNumberActionBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    @Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public CustomerSetCustomerNumberAction build() {
        return new CustomerSetCustomerNumberActionImpl(customerNumber);
    }

    /**
     * builds CustomerSetCustomerNumberAction without checking for non null required values
     */
    public CustomerSetCustomerNumberAction buildUnchecked() {
        return new CustomerSetCustomerNumberActionImpl(customerNumber);
    }

    public static CustomerSetCustomerNumberActionBuilder of() {
        return new CustomerSetCustomerNumberActionBuilder();
    }

    public static CustomerSetCustomerNumberActionBuilder of(final CustomerSetCustomerNumberAction template) {
        CustomerSetCustomerNumberActionBuilder builder = new CustomerSetCustomerNumberActionBuilder();
        builder.customerNumber = template.getCustomerNumber();
        return builder;
    }

}
