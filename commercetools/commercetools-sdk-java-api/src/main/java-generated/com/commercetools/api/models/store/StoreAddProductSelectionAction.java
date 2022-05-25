
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
 * StoreAddProductSelectionAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreAddProductSelectionActionImpl.class)
public interface StoreAddProductSelectionAction extends StoreUpdateAction {

    String ADD_PRODUCT_SELECTION = "addProductSelection";

    /**
     *  <p>Resource Identifier of a Product Selection</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionResourceIdentifier getProductSelection();

    /**
     *  <p>If <code>true</code> all Products assigned to this Product Selection become part of the Store's assortment.</p>
     */

    @JsonProperty("active")
    public Boolean getActive();

    public void setProductSelection(final ProductSelectionResourceIdentifier productSelection);

    public void setActive(final Boolean active);

    public static StoreAddProductSelectionAction of() {
        return new StoreAddProductSelectionActionImpl();
    }

    public static StoreAddProductSelectionAction of(final StoreAddProductSelectionAction template) {
        StoreAddProductSelectionActionImpl instance = new StoreAddProductSelectionActionImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setActive(template.getActive());
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

    public static com.fasterxml.jackson.core.type.TypeReference<StoreAddProductSelectionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreAddProductSelectionAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreAddProductSelectionAction>";
            }
        };
    }
}
