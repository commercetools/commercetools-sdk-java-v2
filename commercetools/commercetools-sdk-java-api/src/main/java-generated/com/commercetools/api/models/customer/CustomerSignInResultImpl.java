package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.Customer;
import com.fasterxml.jackson.databind.JsonNode;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSignInResultImpl implements CustomerSignInResult {

    private com.commercetools.api.models.customer.Customer customer;
    
    private com.fasterxml.jackson.databind.JsonNode cart;

    @JsonCreator
    CustomerSignInResultImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.Customer customer, @JsonProperty("cart") final com.fasterxml.jackson.databind.JsonNode cart) {
        this.customer = customer;
        this.cart = cart;
    }
    public CustomerSignInResultImpl() {
    }

    
    public com.commercetools.api.models.customer.Customer getCustomer(){
        return this.customer;
    }
    
    /**
    *  <p>A cart that is associated to the customer.
    *  Empty if the customer does not have a cart yet.</p>
    */
    public com.fasterxml.jackson.databind.JsonNode getCart(){
        return this.cart;
    }

    public void setCustomer(final com.commercetools.api.models.customer.Customer customer){
        this.customer = customer;
    }
    
    public void setCart(final com.fasterxml.jackson.databind.JsonNode cart){
        this.cart = cart;
    }

}
