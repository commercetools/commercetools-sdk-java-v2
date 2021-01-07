package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreAddDistributionChannelAction;
import com.commercetools.api.models.store.StoreAddSupplyChannelAction;
import com.commercetools.api.models.store.StoreRemoveDistributionChannelAction;
import com.commercetools.api.models.store.StoreRemoveSupplyChannelAction;
import com.commercetools.api.models.store.StoreSetDistributionChannelsAction;
import com.commercetools.api.models.store.StoreSetLanguagesAction;
import com.commercetools.api.models.store.StoreSetNameAction;
import com.commercetools.api.models.store.StoreSetSupplyChannelsAction;
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
public final class StoreUpdateActionImpl implements StoreUpdateAction {

    private String action;

    @JsonCreator
    StoreUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public StoreUpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StoreUpdateActionImpl that = (StoreUpdateActionImpl) o;
    
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
