
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Instead of adding or removing Product Selections individually, you can also change all the Store's Product Selections in one go using this update action. The Store will only contain the Product Selections specified in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetProductSelectionsAction storeSetProductSelectionsAction = StoreSetProductSelectionsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setProductSelections")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetProductSelectionsActionImpl.class)
public interface StoreSetProductSelectionsAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetProductSelectionsAction
     */
    String SET_PRODUCT_SELECTIONS = "setProductSelections";

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @return productSelections
     */
    @Valid
    @JsonProperty("productSelections")
    public List<ProductSelectionSettingDraft> getProductSelections();

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @param productSelections values to be set
     */

    @JsonIgnore
    public void setProductSelections(final ProductSelectionSettingDraft... productSelections);

    /**
     *  <p>Value to set.</p>
     *  <ul>
     *   <li>If provided, Product Selections for which <code>active</code> is set to <code>true</code> are available in the Store.</li>
     *   <li>If not provided or provided as empty array, the action removes all Product Selections from this Store, meaning all Products in the Project are available in this Store.</li>
     *  </ul>
     * @param productSelections values to be set
     */

    public void setProductSelections(final List<ProductSelectionSettingDraft> productSelections);

    /**
     * factory method
     * @return instance of StoreSetProductSelectionsAction
     */
    public static StoreSetProductSelectionsAction of() {
        return new StoreSetProductSelectionsActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetProductSelectionsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetProductSelectionsAction of(final StoreSetProductSelectionsAction template) {
        StoreSetProductSelectionsActionImpl instance = new StoreSetProductSelectionsActionImpl();
        instance.setProductSelections(template.getProductSelections());
        return instance;
    }

    public StoreSetProductSelectionsAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetProductSelectionsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetProductSelectionsAction deepCopy(@Nullable final StoreSetProductSelectionsAction template) {
        if (template == null) {
            return null;
        }
        StoreSetProductSelectionsActionImpl instance = new StoreSetProductSelectionsActionImpl();
        instance.setProductSelections(Optional.ofNullable(template.getProductSelections())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.ProductSelectionSettingDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StoreSetProductSelectionsAction
     * @return builder
     */
    public static StoreSetProductSelectionsActionBuilder builder() {
        return StoreSetProductSelectionsActionBuilder.of();
    }

    /**
     * create builder for StoreSetProductSelectionsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetProductSelectionsActionBuilder builder(final StoreSetProductSelectionsAction template) {
        return StoreSetProductSelectionsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetProductSelectionsAction(Function<StoreSetProductSelectionsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreSetProductSelectionsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreSetProductSelectionsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetProductSelectionsAction>";
            }
        };
    }
}
