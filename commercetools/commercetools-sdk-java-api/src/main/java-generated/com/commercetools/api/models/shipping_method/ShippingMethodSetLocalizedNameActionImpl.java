package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
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
 * ShippingMethodSetLocalizedNameAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingMethodSetLocalizedNameActionImpl implements ShippingMethodSetLocalizedNameAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.LocalizedString localizedName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodSetLocalizedNameActionImpl(@JsonProperty("localizedName") final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
        this.action =  SET_LOCALIZED_NAME;
    }
    /**
     * create empty instance
     */
    public ShippingMethodSetLocalizedNameActionImpl() {
        this.action =  SET_LOCALIZED_NAME;
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
    
    public com.commercetools.api.models.common.LocalizedString getLocalizedName(){
        return this.localizedName;
    }

    
    public void setLocalizedName(final com.commercetools.api.models.common.LocalizedString localizedName){
        this.localizedName = localizedName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShippingMethodSetLocalizedNameActionImpl that = (ShippingMethodSetLocalizedNameActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(localizedName, that.localizedName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(localizedName)
            .toHashCode();
    }

}
