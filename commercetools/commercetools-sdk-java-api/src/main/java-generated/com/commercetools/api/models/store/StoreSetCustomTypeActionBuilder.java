package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.store.StoreSetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreSetCustomTypeActionBuilder {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode fields;

    public StoreSetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    public StoreSetCustomTypeActionBuilder fields(@Nullable final com.fasterxml.jackson.databind.JsonNode fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getFields(){
        return this.fields;
    }

    public StoreSetCustomTypeAction build() {
        return new StoreSetCustomTypeActionImpl(type, fields);
    }

    public static StoreSetCustomTypeActionBuilder of() {
        return new StoreSetCustomTypeActionBuilder();
    }

    public static StoreSetCustomTypeActionBuilder of(final StoreSetCustomTypeAction template) {
        StoreSetCustomTypeActionBuilder builder = new StoreSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
