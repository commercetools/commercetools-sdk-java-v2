package com.commercetools.api.models.review;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.review.ReviewUpdateAction;
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
public final class ReviewSetCustomerActionImpl implements ReviewSetCustomerAction {

    private String action;
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    @JsonCreator
    ReviewSetCustomerActionImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        this.action = "setCustomer";
    }
    public ReviewSetCustomerActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>The customer who created the review.
    *  If <code>customer</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
        this.customer = customer;
    }

}
