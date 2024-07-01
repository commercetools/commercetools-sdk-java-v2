
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * DiscountCodeSetMaxApplicationsPerCustomerAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetMaxApplicationsPerCustomerActionImpl
        implements DiscountCodeSetMaxApplicationsPerCustomerAction, ModelBase {

    private String action;

    private Long maxApplicationsPerCustomer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeSetMaxApplicationsPerCustomerActionImpl(
            @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        this.action = SET_MAX_APPLICATIONS_PER_CUSTOMER;
    }

    /**
     * create empty instance
     */
    public DiscountCodeSetMaxApplicationsPerCustomerActionImpl() {
        this.action = SET_MAX_APPLICATIONS_PER_CUSTOMER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     *  <p>If empty, any existing value will be removed and the DiscountCode can be applied any number of times.</p>
     */

    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeSetMaxApplicationsPerCustomerActionImpl that = (DiscountCodeSetMaxApplicationsPerCustomerActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(maxApplicationsPerCustomer, that.maxApplicationsPerCustomer)
                .append(action, that.action)
                .append(maxApplicationsPerCustomer, that.maxApplicationsPerCustomer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(maxApplicationsPerCustomer).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("maxApplicationsPerCustomer", maxApplicationsPerCustomer)
                .build();
    }

}
