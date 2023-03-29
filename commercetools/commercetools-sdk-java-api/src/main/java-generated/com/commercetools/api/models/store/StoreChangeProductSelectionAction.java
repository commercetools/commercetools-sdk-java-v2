
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ProductSelection in a Store can be activated or deactivated using this update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreChangeProductSelectionAction storeChangeProductSelectionAction = StoreChangeProductSelectionAction.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreChangeProductSelectionActionImpl.class)
public interface StoreChangeProductSelectionAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreChangeProductSelectionAction
     */
    String CHANGE_PRODUCT_SELECTION_ACTIVE = "changeProductSelectionActive";

    /**
     *  <p>Current Product Selection of the Store to be activated or deactivated.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionResourceIdentifier getProductSelection();

    /**
     *  <p>Set to <code>true</code> if all Products assigned to the Product Selection should become part of the Store's assortment.</p>
     * @return active
     */

    @JsonProperty("active")
    public Boolean getActive();

    /**
     *  <p>Current Product Selection of the Store to be activated or deactivated.</p>
     * @param productSelection value to be set
     */

    public void setProductSelection(final ProductSelectionResourceIdentifier productSelection);

    /**
     *  <p>Set to <code>true</code> if all Products assigned to the Product Selection should become part of the Store's assortment.</p>
     * @param active value to be set
     */

    public void setActive(final Boolean active);

    /**
     * factory method
     * @return instance of StoreChangeProductSelectionAction
     */
    public static StoreChangeProductSelectionAction of() {
        return new StoreChangeProductSelectionActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreChangeProductSelectionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreChangeProductSelectionAction of(final StoreChangeProductSelectionAction template) {
        StoreChangeProductSelectionActionImpl instance = new StoreChangeProductSelectionActionImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreChangeProductSelectionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreChangeProductSelectionAction deepCopy(
            @Nullable final StoreChangeProductSelectionAction template) {
        if (template == null) {
            return null;
        }
        StoreChangeProductSelectionActionImpl instance = new StoreChangeProductSelectionActionImpl();
        instance.setProductSelection(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier
                .deepCopy(template.getProductSelection()));
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for StoreChangeProductSelectionAction
     * @return builder
     */
    public static StoreChangeProductSelectionActionBuilder builder() {
        return StoreChangeProductSelectionActionBuilder.of();
    }

    /**
     * create builder for StoreChangeProductSelectionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreChangeProductSelectionActionBuilder builder(final StoreChangeProductSelectionAction template) {
        return StoreChangeProductSelectionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreChangeProductSelectionAction(Function<StoreChangeProductSelectionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreChangeProductSelectionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreChangeProductSelectionAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreChangeProductSelectionAction>";
            }
        };
    }
}
