
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetCompanyNameActionBuilder implements Builder<MyCustomerSetCompanyNameAction> {

    @Nullable
    private String companyName;

    public MyCustomerSetCompanyNameActionBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    public MyCustomerSetCompanyNameAction build() {
        return new MyCustomerSetCompanyNameActionImpl(companyName);
    }

    /**
     * builds MyCustomerSetCompanyNameAction without checking for non null required values
     */
    public MyCustomerSetCompanyNameAction buildUnchecked() {
        return new MyCustomerSetCompanyNameActionImpl(companyName);
    }

    public static MyCustomerSetCompanyNameActionBuilder of() {
        return new MyCustomerSetCompanyNameActionBuilder();
    }

    public static MyCustomerSetCompanyNameActionBuilder of(final MyCustomerSetCompanyNameAction template) {
        MyCustomerSetCompanyNameActionBuilder builder = new MyCustomerSetCompanyNameActionBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}
