
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreAddProductSelectionActionImpl.class)
public interface StoreAddProductSelectionAction extends StoreUpdateAction {

    String ADD_PRODUCT_SELECTION = "addProductSelection";

    /**
    *  <p>A Product Selection to be added to the current Product Selections of this Store.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionSettingDraft getProductSelection();

    public void setProductSelection(final ProductSelectionSettingDraft productSelection);

    public static StoreAddProductSelectionAction of() {
        return new StoreAddProductSelectionActionImpl();
    }

    public static StoreAddProductSelectionAction of(final StoreAddProductSelectionAction template) {
        StoreAddProductSelectionActionImpl instance = new StoreAddProductSelectionActionImpl();
        instance.setProductSelection(template.getProductSelection());
        return instance;
    }

    public static StoreAddProductSelectionActionBuilder builder() {
        return StoreAddProductSelectionActionBuilder.of();
    }

    public static StoreAddProductSelectionActionBuilder builder(final StoreAddProductSelectionAction template) {
        return StoreAddProductSelectionActionBuilder.of(template);
    }

    default <T> T withStoreAddProductSelectionAction(Function<StoreAddProductSelectionAction, T> helper) {
        return helper.apply(this);
    }
}
