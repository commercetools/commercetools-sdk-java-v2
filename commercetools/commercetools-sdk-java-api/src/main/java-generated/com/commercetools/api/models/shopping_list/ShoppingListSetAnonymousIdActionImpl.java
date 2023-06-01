package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ShoppingListSetAnonymousIdAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShoppingListSetAnonymousIdActionImpl implements ShoppingListSetAnonymousIdAction, ModelBase {

    
    private String action;
    
    
    private String anonymousId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListSetAnonymousIdActionImpl(@JsonProperty("anonymousId") final String anonymousId) {
        this.anonymousId = anonymousId;
        this.action =  SET_ANONYMOUS_ID;
    }
    /**
     * create empty instance
     */
    public ShoppingListSetAnonymousIdActionImpl() {
        this.action =  SET_ANONYMOUS_ID;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    
    public String getAnonymousId(){
        return this.anonymousId;
    }

    
    public void setAnonymousId(final String anonymousId){
        this.anonymousId = anonymousId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShoppingListSetAnonymousIdActionImpl that = (ShoppingListSetAnonymousIdActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(anonymousId, that.anonymousId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(anonymousId)
            .toHashCode();
    }

}
