package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
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
 * DiscountCodeChangeGroupsAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeChangeGroupsActionImpl implements DiscountCodeChangeGroupsAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<String> groups;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeChangeGroupsActionImpl(@JsonProperty("groups") final java.util.List<String> groups) {
        this.groups = groups;
        this.action =  CHANGE_GROUPS;
    }
    /**
     * create empty instance
     */
    public DiscountCodeChangeGroupsActionImpl() {
        this.action =  CHANGE_GROUPS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set. An empty array removes the DiscountCode from all groups.</p>
     */
    
    public java.util.List<String> getGroups(){
        return this.groups;
    }

    
    public void setGroups(final String ...groups){
       this.groups = new ArrayList<>(Arrays.asList(groups));
    }
    
    
    public void setGroups(final java.util.List<String> groups){
       this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DiscountCodeChangeGroupsActionImpl that = (DiscountCodeChangeGroupsActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(groups, that.groups)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(groups)
            .toHashCode();
    }

}
