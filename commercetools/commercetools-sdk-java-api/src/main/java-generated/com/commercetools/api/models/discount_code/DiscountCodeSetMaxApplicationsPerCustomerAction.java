
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class)
public interface DiscountCodeSetMaxApplicationsPerCustomerAction extends DiscountCodeUpdateAction {

    String SET_MAX_APPLICATIONS_PER_CUSTOMER = "setMaxApplicationsPerCustomer";

    /**
    *  <p>If the <code>maxApplicationsPerCustomer</code> parameter is not included, the field will be emptied.</p>
    */

    @JsonProperty("maxApplicationsPerCustomer")
    public Long getMaxApplicationsPerCustomer();

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);

    public static DiscountCodeSetMaxApplicationsPerCustomerAction of() {
        return new DiscountCodeSetMaxApplicationsPerCustomerActionImpl();
    }

    public static DiscountCodeSetMaxApplicationsPerCustomerAction of(
            final DiscountCodeSetMaxApplicationsPerCustomerAction template) {
        DiscountCodeSetMaxApplicationsPerCustomerActionImpl instance = new DiscountCodeSetMaxApplicationsPerCustomerActionImpl();
        instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
        return instance;
    }

    public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder() {
        return DiscountCodeSetMaxApplicationsPerCustomerActionBuilder.of();
    }

    public static DiscountCodeSetMaxApplicationsPerCustomerActionBuilder builder(
            final DiscountCodeSetMaxApplicationsPerCustomerAction template) {
        return DiscountCodeSetMaxApplicationsPerCustomerActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetMaxApplicationsPerCustomerAction(
            Function<DiscountCodeSetMaxApplicationsPerCustomerAction, T> helper) {
        return helper.apply(this);
    }
}
