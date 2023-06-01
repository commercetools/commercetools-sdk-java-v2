package com.commercetools.api.models.store;

import com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier;
import com.commercetools.api.models.store.ProductSelectionSettingDraftImpl;

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
 * ProductSelectionSettingDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSettingDraft productSelectionSettingDraft = ProductSelectionSettingDraft.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductSelectionSettingDraftImpl.class)
public interface ProductSelectionSettingDraft extends io.vrap.rmf.base.client.Draft<ProductSelectionSettingDraft> {


    /**
     *  <p>Resource Identifier of a ProductSelection.</p>
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
     *  <p>Resource Identifier of a ProductSelection.</p>
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
     * @return instance of ProductSelectionSettingDraft
     */
    public static ProductSelectionSettingDraft of(){
        return new ProductSelectionSettingDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductSelectionSettingDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionSettingDraft of(final ProductSelectionSettingDraft template) {
        ProductSelectionSettingDraftImpl instance = new ProductSelectionSettingDraftImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionSettingDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionSettingDraft deepCopy(@Nullable final ProductSelectionSettingDraft template) {
        if (template == null) {
            return null;
        }
        ProductSelectionSettingDraftImpl instance = new ProductSelectionSettingDraftImpl();
        instance.setProductSelection(com.commercetools.api.models.product_selection.ProductSelectionResourceIdentifier.deepCopy(template.getProductSelection()));
        instance.setActive(template.getActive());
        return instance;
    }

    /**
     * builder factory method for ProductSelectionSettingDraft
     * @return builder
     */
    public static ProductSelectionSettingDraftBuilder builder() {
        return ProductSelectionSettingDraftBuilder.of();
    }
    
    /**
     * create builder for ProductSelectionSettingDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSettingDraftBuilder builder(final ProductSelectionSettingDraft template) {
        return ProductSelectionSettingDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionSettingDraft(Function<ProductSelectionSettingDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSettingDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSettingDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSettingDraft>";
            }
        };
    }
}
