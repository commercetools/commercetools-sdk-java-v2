package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetDeleteDaysAfterLastModificationActionImpl implements ShoppingListSetDeleteDaysAfterLastModificationAction {

    private String action;
    
    private Long deleteDaysAfterLastModification;

    @JsonCreator
    ShoppingListSetDeleteDaysAfterLastModificationActionImpl(@JsonProperty("deleteDaysAfterLastModification") final Long deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.action = "setDeleteDaysAfterLastModification";
    }
    public ShoppingListSetDeleteDaysAfterLastModificationActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Long getDeleteDaysAfterLastModification(){
        return this.deleteDaysAfterLastModification;
    }

    public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification){
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

}
