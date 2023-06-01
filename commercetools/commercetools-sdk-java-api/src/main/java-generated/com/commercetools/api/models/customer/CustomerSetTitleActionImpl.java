package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
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
 *  <p>Setting the title of the Customer produces the CustomerTitleSetMessage.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetTitleActionImpl implements CustomerSetTitleAction, ModelBase {

    
    private String action;
    
    
    private String title;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetTitleActionImpl(@JsonProperty("title") final String title) {
        this.title = title;
        this.action =  SET_TITLE;
    }
    /**
     * create empty instance
     */
    public CustomerSetTitleActionImpl() {
        this.action =  SET_TITLE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */
    
    public String getTitle(){
        return this.title;
    }

    
    public void setTitle(final String title){
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerSetTitleActionImpl that = (CustomerSetTitleActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(title, that.title)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(title)
            .toHashCode();
    }

}
