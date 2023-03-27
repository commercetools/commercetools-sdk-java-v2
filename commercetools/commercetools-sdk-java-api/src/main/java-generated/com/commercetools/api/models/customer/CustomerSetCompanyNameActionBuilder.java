
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetCompanyNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCompanyNameAction customerSetCompanyNameAction = CustomerSetCompanyNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetCompanyNameActionBuilder implements Builder<CustomerSetCompanyNameAction> {

    @Nullable
    private String companyName;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param companyName value to be set
     * @return Builder
     */

    public CustomerSetCompanyNameActionBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return companyName
     */

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * builds CustomerSetCompanyNameAction with checking for non-null required values
     * @return CustomerSetCompanyNameAction
     */
    public CustomerSetCompanyNameAction build() {
        return new CustomerSetCompanyNameActionImpl(companyName);
    }

    /**
     * builds CustomerSetCompanyNameAction without checking for non-null required values
     * @return CustomerSetCompanyNameAction
     */
    public CustomerSetCompanyNameAction buildUnchecked() {
        return new CustomerSetCompanyNameActionImpl(companyName);
    }

    /**
     * factory method for an instance of CustomerSetCompanyNameActionBuilder
     * @return builder
     */
    public static CustomerSetCompanyNameActionBuilder of() {
        return new CustomerSetCompanyNameActionBuilder();
    }

    /**
     * create builder for CustomerSetCompanyNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCompanyNameActionBuilder of(final CustomerSetCompanyNameAction template) {
        CustomerSetCompanyNameActionBuilder builder = new CustomerSetCompanyNameActionBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}
