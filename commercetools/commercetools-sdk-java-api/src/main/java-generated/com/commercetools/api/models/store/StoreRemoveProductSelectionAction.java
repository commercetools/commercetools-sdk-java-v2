package com.commercetools.api.models.store;

import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreRemoveProductSelectionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StoreRemoveProductSelectionActionImpl.class)
public interface StoreRemoveProductSelectionAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreRemoveProductSelectionAction
     */
    String REMOVE_PRODUCT_SELECTION = "removeProductSelection";

    /**
     *  <p>Value to remove. The removed Product Selection is made offline.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionResourceIdentifier getProductSelection();

    /**
     *  <p>Value to remove. The removed Product Selection is made offline.</p>
     * @param productSelection value to be set
     */
    
    public void setProductSelection(final ProductSelectionResourceIdentifier productSelection);
    

    /**
     * factory method
     * @return instance of StoreRemoveProductSelectionAction
     */
    public static StoreRemoveProductSelectionAction of(){
        return new StoreRemoveProductSelectionActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StoreRemoveProductSelectionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreRemoveProductSelectionAction of(final StoreRemoveProductSelectionAction template) {
        StoreRemoveProductSelectionActionImpl instance = new StoreRemoveProductSelectionActionImpl();
        instance.setProductSelection(template.getProductSelection());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreRemoveProductSelectionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreRemoveProductSelectionAction deepCopy(@Nullable final StoreRemoveProductSelectionAction template) {
        if (template == null) {
            return null;
        }
        StoreRemoveProductSelectionActionImpl instance = new StoreRemoveProductSelectionActionImpl();
        instance.setProductSelection(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier.deepCopy(template.getProductSelection()));
        return instance;
    }

    /**
     * builder factory method for StoreRemoveProductSelectionAction
     * @return builder
     */
    public static StoreRemoveProductSelectionActionBuilder builder() {
        return StoreRemoveProductSelectionActionBuilder.of();
    }
    
    /**
     * create builder for StoreRemoveProductSelectionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRemoveProductSelectionActionBuilder builder(final StoreRemoveProductSelectionAction template) {
        return StoreRemoveProductSelectionActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreRemoveProductSelectionAction(Function<StoreRemoveProductSelectionAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreRemoveProductSelectionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreRemoveProductSelectionAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRemoveProductSelectionAction>";
            }
        };
    }
}
