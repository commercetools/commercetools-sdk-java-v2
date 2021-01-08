package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreAddDistributionChannelAction;
import com.commercetools.api.models.store.StoreAddSupplyChannelAction;
import com.commercetools.api.models.store.StoreRemoveDistributionChannelAction;
import com.commercetools.api.models.store.StoreRemoveSupplyChannelAction;
import com.commercetools.api.models.store.StoreSetCustomFieldAction;
import com.commercetools.api.models.store.StoreSetCustomTypeAction;
import com.commercetools.api.models.store.StoreSetDistributionChannelsAction;
import com.commercetools.api.models.store.StoreSetLanguagesAction;
import com.commercetools.api.models.store.StoreSetNameAction;
import com.commercetools.api.models.store.StoreSetSupplyChannelsAction;


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

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddDistributionChannelActionImpl.class, name = "addDistributionChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreAddSupplyChannelActionImpl.class, name = "addSupplyChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveDistributionChannelActionImpl.class, name = "removeDistributionChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreRemoveSupplyChannelActionImpl.class, name = "removeSupplyChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetDistributionChannelsActionImpl.class, name = "setDistributionChannels"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetLanguagesActionImpl.class, name = "setLanguages"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetNameActionImpl.class, name = "setName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetSupplyChannelsActionImpl.class, name = "setSupplyChannels")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = StoreUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface StoreUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<StoreUpdateAction> {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();





    default <T> T withStoreUpdateAction(Function<StoreUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
