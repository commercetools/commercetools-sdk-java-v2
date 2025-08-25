
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
 * CustomerSignInResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSignInResultImpl implements CustomerSignInResult, ModelBase {

    private com.commercetools.api.models.customer.Customer customer;

    private com.commercetools.api.models.cart.Cart cart;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSignInResultImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.Customer customer,
            @JsonProperty("cart") final com.commercetools.api.models.cart.Cart cart) {
        this.customer = customer;
        this.cart = cart;
    }

    /**
     * create empty instance
     */
    public CustomerSignInResultImpl() {
    }

    /**
     *  <p>Customer <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/customers:POST" rel="nofollow">signed up</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/login:POST" rel="nofollow">signed in</a> after authentication.</p>
     */

    public com.commercetools.api.models.customer.Customer getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Cart associated with the Customer. If empty, the Customer does not have a Cart assigned.</p>
     */

    public com.commercetools.api.models.cart.Cart getCart() {
        return this.cart;
    }

    public void setCustomer(final com.commercetools.api.models.customer.Customer customer) {
        this.customer = customer;
    }

    public void setCart(final com.commercetools.api.models.cart.Cart cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSignInResultImpl that = (CustomerSignInResultImpl) o;

        return new EqualsBuilder().append(customer, that.customer)
                .append(cart, that.cart)
                .append(customer, that.customer)
                .append(cart, that.cart)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(customer).append(cart).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("customer", customer)
                .append("cart", cart)
                .build();
    }

    @Override
    public CustomerSignInResult copyDeep() {
        return CustomerSignInResult.deepCopy(this);
    }
}
