
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetMaxApplicationsPerCustomerActionBuilder {

    @Nullable
    private Long maxApplicationsPerCustomer;

    public DiscountCodeSetMaxApplicationsPerCustomerActionBuilder maxApplicationsPerCustomer(
            @Nullable final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        return this;
    }

    @Nullable
    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    public DiscountCodeSetMaxApplicationsPerCustomerAction build() {
        return new DiscountCodeSetMaxApplicationsPerCustomerActionImpl(maxApplicationsPerCustomer);
    }

    public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder of() {
        return new DiscountCodeSetMaxApplicationsPerCustomerActionBuilder();
    }

    public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder of(
            final DiscountCodeSetMaxApplicationsPerCustomerAction template) {
        DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder = new DiscountCodeSetMaxApplicationsPerCustomerActionBuilder();
        builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
        return builder;
    }

}
