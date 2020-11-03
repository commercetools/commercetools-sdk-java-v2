package com.commercetools.api.models.message;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.message.MessagePayload;
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
public final class CategoryCreatedMessagePayloadImpl implements CategoryCreatedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.category.Category category;

    @JsonCreator
    CategoryCreatedMessagePayloadImpl(@JsonProperty("category") final com.commercetools.api.models.category.Category category) {
        this.category = category;
        this.type = "CategoryCreated";
    }
    public CategoryCreatedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.category.Category getCategory(){
        return this.category;
    }

    public void setCategory(final com.commercetools.api.models.category.Category category){
        this.category = category;
    }

}
