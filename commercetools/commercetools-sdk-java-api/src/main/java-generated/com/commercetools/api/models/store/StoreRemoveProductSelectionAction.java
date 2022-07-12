
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action has no effect if the given Product Selection is not in the Store.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveProductSelectionAction storeRemoveProductSelectionAction = StoreRemoveProductSelectionAction.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreRemoveProductSelectionActionImpl.class)
public interface StoreRemoveProductSelectionAction extends StoreUpdateAction {

    String REMOVE_PRODUCT_SELECTION = "removeProductSelection";

    /**
     *  <p>Value to remove. The removed Product Selection is made offline.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionResourceIdentifier getProductSelection();

    public void setProductSelection(final ProductSelectionResourceIdentifier productSelection);

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
