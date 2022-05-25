
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
     *  <p>If not defined, the company name is unset.</p>
     */

    public CustomerSetCompanyNameActionBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    public CustomerSetCompanyNameAction build() {
        return new CustomerSetCompanyNameActionImpl(companyName);
    }

    /**
     * builds CustomerSetCompanyNameAction without checking for non null required values
     */
    public CustomerSetCompanyNameAction buildUnchecked() {
        return new CustomerSetCompanyNameActionImpl(companyName);
    }

    public static CustomerSetCompanyNameActionBuilder of() {
        return new CustomerSetCompanyNameActionBuilder();
    }

    public static CustomerSetCompanyNameActionBuilder of(final CustomerSetCompanyNameAction template) {
        CustomerSetCompanyNameActionBuilder builder = new CustomerSetCompanyNameActionBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}
