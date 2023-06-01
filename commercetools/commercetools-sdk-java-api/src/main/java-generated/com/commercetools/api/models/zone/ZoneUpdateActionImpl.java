package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneAddLocationAction;
import com.commercetools.api.models.zone.ZoneChangeNameAction;
import com.commercetools.api.models.zone.ZoneRemoveLocationAction;
import com.commercetools.api.models.zone.ZoneSetDescriptionAction;
import com.commercetools.api.models.zone.ZoneSetKeyAction;
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
 * ZoneUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ZoneUpdateActionImpl implements ZoneUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ZoneUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public ZoneUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ZoneUpdateActionImpl that = (ZoneUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
