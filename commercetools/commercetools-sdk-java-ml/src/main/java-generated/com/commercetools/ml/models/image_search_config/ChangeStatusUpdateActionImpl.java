package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction;
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
 * ChangeStatusUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeStatusUpdateActionImpl implements ChangeStatusUpdateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeStatusUpdateActionImpl(@JsonProperty("status") final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
        this.action =  CHANGE_STATUS;
    }
    /**
     * create empty instance
     */
    public ChangeStatusUpdateActionImpl() {
        this.action =  CHANGE_STATUS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *
     */
    
    public com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus getStatus(){
        return this.status;
    }

    
    public void setStatus(final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status){
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeStatusUpdateActionImpl that = (ChangeStatusUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(status, that.status)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(status)
            .toHashCode();
    }

}
