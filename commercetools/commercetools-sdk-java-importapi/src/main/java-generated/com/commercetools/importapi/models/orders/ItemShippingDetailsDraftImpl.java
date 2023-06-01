package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.ItemShippingTarget;
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
 * ItemShippingDetailsDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ItemShippingDetailsDraftImpl implements ItemShippingDetailsDraft, ModelBase {

    
    private java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ItemShippingDetailsDraftImpl(@JsonProperty("targets") final java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets) {
        this.targets = targets;
    }
    /**
     * create empty instance
     */
    public ItemShippingDetailsDraftImpl() {
    }

    /**
     *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
     */
    
    public java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> getTargets(){
        return this.targets;
    }

    
    public void setTargets(final com.commercetools.importapi.models.orders.ItemShippingTarget ...targets){
       this.targets = new ArrayList<>(Arrays.asList(targets));
    }
    
    
    public void setTargets(final java.util.List<com.commercetools.importapi.models.orders.ItemShippingTarget> targets){
       this.targets = targets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ItemShippingDetailsDraftImpl that = (ItemShippingDetailsDraftImpl) o;
    
        return new EqualsBuilder()
                .append(targets, that.targets)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(targets)
            .toHashCode();
    }

}
