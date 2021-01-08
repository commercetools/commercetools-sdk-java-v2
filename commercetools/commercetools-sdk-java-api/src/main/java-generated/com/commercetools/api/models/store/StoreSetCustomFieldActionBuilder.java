package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.store.StoreSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreSetCustomFieldActionBuilder {

    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public StoreSetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public StoreSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public StoreSetCustomFieldAction build() {
        return new StoreSetCustomFieldActionImpl(name, value);
    }

    public static StoreSetCustomFieldActionBuilder of() {
        return new StoreSetCustomFieldActionBuilder();
    }

    public static StoreSetCustomFieldActionBuilder of(final StoreSetCustomFieldAction template) {
        StoreSetCustomFieldActionBuilder builder = new StoreSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
