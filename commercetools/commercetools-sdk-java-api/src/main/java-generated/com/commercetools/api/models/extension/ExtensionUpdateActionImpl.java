package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionChangeDestinationAction;
import com.commercetools.api.models.extension.ExtensionChangeTriggersAction;
import com.commercetools.api.models.extension.ExtensionSetKeyAction;
import com.commercetools.api.models.extension.ExtensionSetTimeoutInMsAction;
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
public final class ExtensionUpdateActionImpl implements ExtensionUpdateAction {

    private String action;

    @JsonCreator
    ExtensionUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public ExtensionUpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ExtensionUpdateActionImpl that = (ExtensionUpdateActionImpl) o;
    
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
