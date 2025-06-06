
package com.commercetools.api.models.order_edit;

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
 *  <p>This action updates the <code>customerEmail</code> on the Order, but it does not change the Customer email on the Cart the Order has been created from.</p>
 *  <p>Produces the Order Customer Email Set Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomerEmailActionImpl implements StagedOrderSetCustomerEmailAction, ModelBase {

    private String action;

    private String email;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetCustomerEmailActionImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.action = SET_CUSTOMER_EMAIL;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetCustomerEmailActionImpl() {
        this.action = SET_CUSTOMER_EMAIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetCustomerEmailActionImpl that = (StagedOrderSetCustomerEmailActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(email, that.email)
                .append(action, that.action)
                .append(email, that.email)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(email).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("email", email)
                .build();
    }

    @Override
    public StagedOrderSetCustomerEmailAction copyDeep() {
        return StagedOrderSetCustomerEmailAction.deepCopy(this);
    }
}
