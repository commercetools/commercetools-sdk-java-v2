
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreChangeProductSelectionActionImpl.class)
public interface StoreChangeProductSelectionAction extends StoreUpdateAction {

    String CHANGE_PRODUCT_SELECTION_ACTIVE = "changeProductSelectionActive";

    /**
    *  <p>A current Product Selection of this Store that is to be activated or deactivated.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ResourceIdentifier getProductSelection();

    /**
    *  <p>If <code>true</code> all Products assigned to the Product Selection become part of the Store's assortment.</p>
    */

    @JsonProperty("active")
    public Boolean getActive();

    public void setProductSelection(final ResourceIdentifier productSelection);

    public void setActive(final Boolean active);

    public static StoreChangeProductSelectionAction of() {
        return new StoreChangeProductSelectionActionImpl();
    }

    public static StoreChangeProductSelectionAction of(final StoreChangeProductSelectionAction template) {
        StoreChangeProductSelectionActionImpl instance = new StoreChangeProductSelectionActionImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setActive(template.getActive());
        return instance;
    }

    public static StoreChangeProductSelectionActionBuilder builder() {
        return StoreChangeProductSelectionActionBuilder.of();
    }

    public static StoreChangeProductSelectionActionBuilder builder(final StoreChangeProductSelectionAction template) {
        return StoreChangeProductSelectionActionBuilder.of(template);
    }

    default <T> T withStoreChangeProductSelectionAction(Function<StoreChangeProductSelectionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreChangeProductSelectionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreChangeProductSelectionAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreChangeProductSelectionAction>";
            }
        };
    }
}
