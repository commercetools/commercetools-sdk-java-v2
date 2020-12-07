package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
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
public final class InventoryEntrySetRestockableInDaysActionImpl implements InventoryEntrySetRestockableInDaysAction {

    private String action;
    
    private Long restockableInDays;

    @JsonCreator
    InventoryEntrySetRestockableInDaysActionImpl(@JsonProperty("restockableInDays") final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        this.action = "setRestockableInDays";
    }
    public InventoryEntrySetRestockableInDaysActionImpl() {
        this.action = "setRestockableInDays";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Long getRestockableInDays(){
        return this.restockableInDays;
    }

    public void setRestockableInDays(final Long restockableInDays){
        this.restockableInDays = restockableInDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        InventoryEntrySetRestockableInDaysActionImpl that = (InventoryEntrySetRestockableInDaysActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(restockableInDays, that.restockableInDays)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(restockableInDays)
            .toHashCode();
    }

}
