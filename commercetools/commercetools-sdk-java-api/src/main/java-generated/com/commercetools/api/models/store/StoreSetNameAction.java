
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreSetNameActionImpl.class)
public interface StoreSetNameAction extends StoreUpdateAction {

    String SET_NAME = "setName";

    /**
    *  <p>The updated name of the store</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static StoreSetNameAction of() {
        return new StoreSetNameActionImpl();
    }

    public static StoreSetNameAction of(final StoreSetNameAction template) {
        StoreSetNameActionImpl instance = new StoreSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static StoreSetNameActionBuilder builder() {
        return StoreSetNameActionBuilder.of();
    }

    public static StoreSetNameActionBuilder builder(final StoreSetNameAction template) {
        return StoreSetNameActionBuilder.of(template);
    }

    default <T> T withStoreSetNameAction(Function<StoreSetNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetNameAction>";
            }
        };
    }
}
