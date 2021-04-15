package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodSetLocalizedDescriptionActionImpl implements ShippingMethodSetLocalizedDescriptionAction {

    
    private String action;
    
    
    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    @JsonCreator
    ShippingMethodSetLocalizedDescriptionActionImpl(@JsonProperty("localizedDescription") final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        this.action =  SET_LOCALIZED_DESCRIPTION;
    }
    public ShippingMethodSetLocalizedDescriptionActionImpl() {
        this.action =  SET_LOCALIZED_DESCRIPTION;
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription(){
        return this.localizedDescription;
    }

    
    public void setLocalizedDescription(final com.commercetools.api.models.common.LocalizedString localizedDescription){
        this.localizedDescription = localizedDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShippingMethodSetLocalizedDescriptionActionImpl that = (ShippingMethodSetLocalizedDescriptionActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(localizedDescription, that.localizedDescription)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(localizedDescription)
            .toHashCode();
    }

}
