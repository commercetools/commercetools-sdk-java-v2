package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetCustomFieldActionImpl implements ShoppingListSetCustomFieldAction {

    private String action;
    
    private String name;
    
    private com.fasterxml.jackson.databind.JsonNode value;

    @JsonCreator
    ShoppingListSetCustomFieldActionImpl(@JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
        this.name = name;
        this.value = value;
        this.action = "setCustomField";
    }
    public ShoppingListSetCustomFieldActionImpl() {
        this.action = "setCustomField";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListSetCustomFieldActionImpl that = (ShoppingListSetCustomFieldActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(name)
            .append(value)
            .toHashCode();
    }

}
