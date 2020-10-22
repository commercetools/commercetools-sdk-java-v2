package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreUpdateImpl;

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

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StoreUpdateImpl.class)
public interface StoreUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<StoreUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<StoreUpdateAction> actions);

    public static StoreUpdateImpl of(){
        return new StoreUpdateImpl();
    }
    

    public static StoreUpdateImpl of(final StoreUpdate template) {
        StoreUpdateImpl instance = new StoreUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T extends Accessor<StoreUpdate>> T withStoreUpdate(Function<StoreUpdate, T> helper) {
        return helper.apply(this);
    }
}
