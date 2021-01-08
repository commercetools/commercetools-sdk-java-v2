package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.store.StoreSetCustomFieldActionImpl;

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
@JsonDeserialize(as = StoreSetCustomFieldActionImpl.class)
public interface StoreSetCustomFieldAction extends StoreUpdateAction {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static StoreSetCustomFieldAction of(){
        return new StoreSetCustomFieldActionImpl();
    }
    

    public static StoreSetCustomFieldAction of(final StoreSetCustomFieldAction template) {
        StoreSetCustomFieldActionImpl instance = new StoreSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static StoreSetCustomFieldActionBuilder builder(){
        return StoreSetCustomFieldActionBuilder.of();
    }
    
    public static StoreSetCustomFieldActionBuilder builder(final StoreSetCustomFieldAction template){
        return StoreSetCustomFieldActionBuilder.of(template);
    }
    

    default <T> T withStoreSetCustomFieldAction(Function<StoreSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
