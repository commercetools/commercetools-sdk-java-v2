package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
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
public final class DiscountCodeSetMaxApplicationsPerCustomerActionImpl implements DiscountCodeSetMaxApplicationsPerCustomerAction {

    private String action;
    
    private Long maxApplicationsPerCustomer;

    @JsonCreator
    DiscountCodeSetMaxApplicationsPerCustomerActionImpl(@JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        this.action = "setMaxApplicationsPerCustomer";
    }
    public DiscountCodeSetMaxApplicationsPerCustomerActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>If the <code>maxApplicationsPerCustomer</code> parameter is not included, the field will be emptied.</p>
    */
    public Long getMaxApplicationsPerCustomer(){
        return this.maxApplicationsPerCustomer;
    }

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer){
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
    }

}
