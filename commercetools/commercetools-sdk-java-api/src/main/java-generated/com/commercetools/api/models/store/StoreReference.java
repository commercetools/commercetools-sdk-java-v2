package com.commercetools.api.models.store;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.store.Store;
import com.commercetools.api.models.store.StoreReferenceImpl;

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
@JsonDeserialize(as = StoreReferenceImpl.class)
public interface StoreReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public Store getObj();

    public void setObj(final Store obj);

    public static StoreReferenceImpl of(){
        return new StoreReferenceImpl();
    }
    

    public static StoreReferenceImpl of(final StoreReference template) {
        StoreReferenceImpl instance = new StoreReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withStoreReference(Function<StoreReference, T> helper) {
        return helper.apply(this);
    }
}
