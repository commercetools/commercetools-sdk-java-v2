package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
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
public final class CategoryChangeOrderHintActionImpl implements CategoryChangeOrderHintAction {

    private String action;
    
    private String orderHint;

    @JsonCreator
    CategoryChangeOrderHintActionImpl(@JsonProperty("orderHint") final String orderHint) {
        this.orderHint = orderHint;
        this.action = "changeOrderHint";
    }
    public CategoryChangeOrderHintActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getOrderHint(){
        return this.orderHint;
    }

    public void setOrderHint(final String orderHint){
        this.orderHint = orderHint;
    }

}
