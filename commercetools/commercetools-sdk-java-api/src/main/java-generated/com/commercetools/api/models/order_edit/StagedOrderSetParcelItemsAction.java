package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetParcelItemsActionImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetParcelItemsActionImpl.class)
public interface StagedOrderSetParcelItemsAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();
    
    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setParcelId(final String parcelId);
    
    @JsonIgnore
    public void setItems(final DeliveryItem ...items);
    public void setItems(final List<DeliveryItem> items);

    public static StagedOrderSetParcelItemsAction of(){
        return new StagedOrderSetParcelItemsActionImpl();
    }
    

    public static StagedOrderSetParcelItemsAction of(final StagedOrderSetParcelItemsAction template) {
        StagedOrderSetParcelItemsActionImpl instance = new StagedOrderSetParcelItemsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setItems(template.getItems());
        return instance;
    }

    public static StagedOrderSetParcelItemsActionBuilder builder(){
        return StagedOrderSetParcelItemsActionBuilder.of();
    }
    
    public static StagedOrderSetParcelItemsActionBuilder builder(final StagedOrderSetParcelItemsAction template){
        return StagedOrderSetParcelItemsActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetParcelItemsAction(Function<StagedOrderSetParcelItemsAction, T> helper) {
        return helper.apply(this);
    }
}
