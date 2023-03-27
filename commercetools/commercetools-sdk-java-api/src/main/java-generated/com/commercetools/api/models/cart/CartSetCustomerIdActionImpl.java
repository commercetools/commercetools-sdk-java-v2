
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Setting the Cart's <code>customerId</code> can lead to updates on all its LineItem <code>prices</code>.</p>
 *  <p>If the Customer with the specified <code>id</code> cannot be found, this update action returns a MissingTaxRateForCountry error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomerIdActionImpl implements CartSetCustomerIdAction, ModelBase {

    private String action;

    private String customerId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCustomerIdActionImpl(@JsonProperty("customerId") final String customerId) {
        this.customerId = customerId;
        this.action = SET_CUSTOMER_ID;
    }

    /**
     * create empty instance
     */
    public CartSetCustomerIdActionImpl() {
        this.action = SET_CUSTOMER_ID;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any value is removed.</p>
     */

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetCustomerIdActionImpl that = (CartSetCustomerIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(customerId, that.customerId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customerId).toHashCode();
    }

}
