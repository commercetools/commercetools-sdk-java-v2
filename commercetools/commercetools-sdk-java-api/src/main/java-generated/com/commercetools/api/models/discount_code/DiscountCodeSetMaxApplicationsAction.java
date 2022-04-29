
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetMaxApplicationsActionImpl.class)
public interface DiscountCodeSetMaxApplicationsAction extends DiscountCodeUpdateAction {

    String SET_MAX_APPLICATIONS = "setMaxApplications";

    /**
    *  <p>If the <code>maxApplications</code> parameter is not included, the field will be emptied.</p>
    */

    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    public void setMaxApplications(final Long maxApplications);

    public static DiscountCodeSetMaxApplicationsAction of() {
        return new DiscountCodeSetMaxApplicationsActionImpl();
    }

    public static DiscountCodeSetMaxApplicationsAction of(final DiscountCodeSetMaxApplicationsAction template) {
        DiscountCodeSetMaxApplicationsActionImpl instance = new DiscountCodeSetMaxApplicationsActionImpl();
        instance.setMaxApplications(template.getMaxApplications());
        return instance;
    }

    public static DiscountCodeSetMaxApplicationsActionBuilder builder() {
        return DiscountCodeSetMaxApplicationsActionBuilder.of();
    }

    public static DiscountCodeSetMaxApplicationsActionBuilder builder(
            final DiscountCodeSetMaxApplicationsAction template) {
        return DiscountCodeSetMaxApplicationsActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetMaxApplicationsAction(Function<DiscountCodeSetMaxApplicationsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetMaxApplicationsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetMaxApplicationsAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetMaxApplicationsAction>";
            }
        };
    }
}
