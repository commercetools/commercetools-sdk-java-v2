package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
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
public final class ZoneSetDescriptionActionImpl implements ZoneSetDescriptionAction {

    private String action;
    
    private String description;

    @JsonCreator
    ZoneSetDescriptionActionImpl(@JsonProperty("description") final String description) {
        this.description = description;
        this.action = "setDescription";
    }
    public ZoneSetDescriptionActionImpl() {
        this.action = "setDescription";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getDescription(){
        return this.description;
    }

    public void setDescription(final String description){
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ZoneSetDescriptionActionImpl that = (ZoneSetDescriptionActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(description, that.description)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(description)
            .toHashCode();
    }

}
