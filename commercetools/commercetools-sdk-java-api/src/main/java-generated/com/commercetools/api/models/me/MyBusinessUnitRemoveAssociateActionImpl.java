
package com.commercetools.api.models.me;

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
 *  <p>Removing an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> from a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAssociateRemovedMessage" rel="nofollow">BusinessUnitAssociateRemoved</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitRemoveAssociateActionImpl implements MyBusinessUnitRemoveAssociateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyBusinessUnitRemoveAssociateActionImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        this.action = REMOVE_ASSOCIATE;
    }

    /**
     * create empty instance
     */
    public MyBusinessUnitRemoveAssociateActionImpl() {
        this.action = REMOVE_ASSOCIATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> to remove.</p>
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyBusinessUnitRemoveAssociateActionImpl that = (MyBusinessUnitRemoveAssociateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customer, that.customer)
                .append(action, that.action)
                .append(customer, that.customer)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customer).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customer", customer)
                .build();
    }

    @Override
    public MyBusinessUnitRemoveAssociateAction copyDeep() {
        return MyBusinessUnitRemoveAssociateAction.deepCopy(this);
    }
}
