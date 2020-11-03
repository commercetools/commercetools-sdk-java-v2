package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.orders.ItemStateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>The item's state.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ItemStateImpl.class)
public interface ItemState  {

    
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();
    /**
    *  <p>Maps to <code>ItemState.state</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    public void setQuantity(final Double quantity);
    
    public void setState(final StateKeyReference state);

    public static ItemStateImpl of(){
        return new ItemStateImpl();
    }
    

    public static ItemStateImpl of(final ItemState template) {
        ItemStateImpl instance = new ItemStateImpl();
        instance.setQuantity(template.getQuantity());
        instance.setState(template.getState());
        return instance;
    }

    default <T> T withItemState(Function<ItemState, T> helper) {
        return helper.apply(this);
    }
}
