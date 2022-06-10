
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreAddProductSelectionActionImpl.class)
public interface StoreAddProductSelectionAction extends StoreUpdateAction {

    String ADD_PRODUCT_SELECTION = "addProductSelection";

    /**
     *  <p>Product Selection to add to the Store either activated or deactivated.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionResourceIdentifier getProductSelection();

    /**
     *  <p>Set to <code>true</code> to make all Products assigned to the referenced Product Selection available in the Store.</p>
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
