
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
@JsonDeserialize(as = StoreRemoveProductSelectionActionImpl.class)
public interface StoreRemoveProductSelectionAction extends StoreUpdateAction {

    String REMOVE_PRODUCT_SELECTION = "removeProductSelection";

    /**
    *  <p>A Product Selection to be removed from the current Product Selections of this Store.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ResourceIdentifier getProductSelection();

    public void setProductSelection(final ResourceIdentifier productSelection);

    public static StoreRemoveProductSelectionAction of() {
        return new StoreRemoveProductSelectionActionImpl();
    }

    public static StoreRemoveProductSelectionAction of(final StoreRemoveProductSelectionAction template) {
        StoreRemoveProductSelectionActionImpl instance = new StoreRemoveProductSelectionActionImpl();
        instance.setProductSelection(template.getProductSelection());
        return instance;
    }

    public static StoreRemoveProductSelectionActionBuilder builder() {
        return StoreRemoveProductSelectionActionBuilder.of();
    }

    public static StoreRemoveProductSelectionActionBuilder builder(final StoreRemoveProductSelectionAction template) {
        return StoreRemoveProductSelectionActionBuilder.of(template);
    }

    default <T> T withStoreRemoveProductSelectionAction(Function<StoreRemoveProductSelectionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreRemoveProductSelectionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreRemoveProductSelectionAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRemoveProductSelectionAction>";
            }
        };
    }
}
