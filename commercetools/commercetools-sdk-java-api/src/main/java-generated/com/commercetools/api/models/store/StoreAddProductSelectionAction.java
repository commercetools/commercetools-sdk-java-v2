package com.commercetools.api.models.store;

import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreAddProductSelectionActionImpl;

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
 *  <p>To make all included Products available to your customers of a given Store, add the Product Selections to the respective Store. This action has no effect if the given Product Selection is already present in the Store and has the same <code>active</code> flag.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreAddProductSelectionAction storeAddProductSelectionAction = StoreAddProductSelectionAction.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StoreAddProductSelectionActionImpl.class)
public interface StoreAddProductSelectionAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreAddProductSelectionAction
     */
    String ADD_PRODUCT_SELECTION = "addProductSelection";

    /**
     *  <p>Product Selection to add to the Store either activated or deactivated.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionResourceIdentifier getProductSelection();
    /**
     *  <p>Set to <code>true</code> to make all Products assigned to the referenced Product Selection available in the Store.</p>
     * @return active
     */
    
    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>Product Selection to add to the Store either activated or deactivated.</p>
     * @param productSelection value to be set
     */
    
    public void setProductSelection(final ProductSelectionResourceIdentifier productSelection);
    
    
    /**
     *  <p>Set to <code>true</code> to make all Products assigned to the referenced Product Selection available in the Store.</p>
     * @param active value to be set
     */
    
    public void setActive(final Boolean active);
    

    /**
     * factory method
     * @return instance of StoreAddProductSelectionAction
     */
    public static StoreAddProductSelectionAction of(){
        return new StoreAddProductSelectionActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StoreAddProductSelectionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreAddProductSelectionAction of(final StoreAddProductSelectionAction template) {
        StoreAddProductSelectionActionImpl instance = new StoreAddProductSelectionActionImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreAddProductSelectionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreAddProductSelectionAction deepCopy(@Nullable final StoreAddProductSelectionAction template) {
        if (template == null) {
            return null;
        }
        StoreAddProductSelectionActionImpl instance = new StoreAddProductSelectionActionImpl();
        instance.setProductSelection(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier.deepCopy(template.getProductSelection()));
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for StoreAddProductSelectionAction
     * @return builder
     */
    public static StoreAddProductSelectionActionBuilder builder() {
        return StoreAddProductSelectionActionBuilder.of();
    }
    
    /**
     * create builder for StoreAddProductSelectionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreAddProductSelectionActionBuilder builder(final StoreAddProductSelectionAction template) {
        return StoreAddProductSelectionActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreAddProductSelectionAction(Function<StoreAddProductSelectionAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreAddProductSelectionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreAddProductSelectionAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreAddProductSelectionAction>";
            }
        };
    }
}
