
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetCompanyNameActionBuilder implements Builder<CustomerSetCompanyNameAction> {

    @Nullable
    private String companyName;

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
