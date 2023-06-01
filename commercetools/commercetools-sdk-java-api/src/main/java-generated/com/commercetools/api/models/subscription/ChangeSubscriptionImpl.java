package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId;
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
 *  <p>Notification about changes to a resource. The payload format differs for resource creation, update, and deletion.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeSubscriptionImpl implements ChangeSubscription, ModelBase {

    
    private com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId resourceTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeSubscriptionImpl(@JsonProperty("resourceTypeId") final com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }
    /**
     * create empty instance
     */
    public ChangeSubscriptionImpl() {
    }

    /**
     *  <p>Unique identifier for the type of resource, for example, <code>cart</code>.</p>
     */
    
    public com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId getResourceTypeId(){
        return this.resourceTypeId;
    }

    
    public void setResourceTypeId(final com.commercetools.api.models.subscription.ChangeSubscriptionResourceTypeId resourceTypeId){
        this.resourceTypeId = resourceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeSubscriptionImpl that = (ChangeSubscriptionImpl) o;
    
        return new EqualsBuilder()
                .append(resourceTypeId, that.resourceTypeId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(resourceTypeId)
            .toHashCode();
    }

}
