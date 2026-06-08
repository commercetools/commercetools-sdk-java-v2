
package com.commercetools.api.models.customer;

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
 *  <p>Setting the Customer Group of the Customer produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupSetMessage" rel="nofollow">CustomerGroupSet</a> Message.</p>
 *  <p>To reflect the new Customer Group, this update action can result in <span>updates</span> to the most recently modified active Cart. When this occurs, the following errors can be returned: <a href="https://docs.commercetools.com/apis/ctp:api:type:MatchingPriceNotFoundError" rel="nofollow">MatchingPriceNotFound</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MissingTaxRateForCountryError" rel="nofollow">MissingTaxRateForCountry</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetCustomerGroupActionImpl implements CustomerSetCustomerGroupAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetCustomerGroupActionImpl(
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        this.action = SET_CUSTOMER_GROUP;
    }

    /**
     * create empty instance
     */
    public CustomerSetCustomerGroupActionImpl() {
        this.action = SET_CUSTOMER_GROUP;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSetCustomerGroupActionImpl that = (CustomerSetCustomerGroupActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customerGroup, that.customerGroup)
                .append(action, that.action)
                .append(customerGroup, that.customerGroup)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerGroup).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customerGroup", customerGroup)
                .build();
    }

    @Override
    public CustomerSetCustomerGroupAction copyDeep() {
        return CustomerSetCustomerGroupAction.deepCopy(this);
    }
}
