package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreSetLanguagesAction;
import com.commercetools.api.models.store.StoreSetNameAction;
import com.commercetools.api.models.store.StoresAddDistributionChannelsAction;
import com.commercetools.api.models.store.StoresAddSupplyChannelsAction;
import com.commercetools.api.models.store.StoresRemoveDistributionChannelsAction;
import com.commercetools.api.models.store.StoresRemoveSupplyChannelsAction;
import com.commercetools.api.models.store.StoresSetDistributionChannelsAction;
import com.commercetools.api.models.store.StoresSetSupplyChannelsAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetLanguagesActionImpl.class, name = "setLanguages"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreSetNameActionImpl.class, name = "setName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoresAddDistributionChannelsActionImpl.class, name = "addDistributionChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoresAddSupplyChannelsActionImpl.class, name = "addSupplyChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoresRemoveDistributionChannelsActionImpl.class, name = "removeDistributionChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoresRemoveSupplyChannelsActionImpl.class, name = "removeSupplyChannel"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoresSetDistributionChannelsActionImpl.class, name = "setDistributionChannels"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoresSetSupplyChannelsActionImpl.class, name = "setSupplyChannels")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = StoreUpdateActionImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface StoreUpdateAction  {





    default <T extends Accessor<StoreUpdateAction>> T withStoreUpdateAction(Function<StoreUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
