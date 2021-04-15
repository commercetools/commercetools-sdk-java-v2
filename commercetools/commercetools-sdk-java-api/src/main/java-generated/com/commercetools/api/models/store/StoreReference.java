
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreReferenceImpl.class)
public interface StoreReference extends Reference {

    String STORE = "store";

    @Valid
    @JsonProperty("obj")
    public Store getObj();

    public void setObj(final Store obj);

    public static StoreReference of() {
        return new StoreReferenceImpl();
    }

    public static StoreReference of(final StoreReference template) {
        StoreReferenceImpl instance = new StoreReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static StoreReferenceBuilder builder() {
        return StoreReferenceBuilder.of();
    }

    public static StoreReferenceBuilder builder(final StoreReference template) {
        return StoreReferenceBuilder.of(template);
    }

    default <T> T withStoreReference(Function<StoreReference, T> helper) {
        return helper.apply(this);
    }
}
