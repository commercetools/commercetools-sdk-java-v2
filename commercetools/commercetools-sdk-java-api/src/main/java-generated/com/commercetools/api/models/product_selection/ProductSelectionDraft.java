package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_selection.ProductSelectionMode;
import com.commercetools.api.models.product_selection.ProductSelectionTypeEnum;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.product_selection.ProductSelectionDraftImpl;

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
 * ProductSelectionDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionDraft productSelectionDraft = ProductSelectionDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductSelectionDraftImpl.class)
public interface ProductSelectionDraft extends com.commercetools.api.models.CustomizableDraft<ProductSelectionDraft>, com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ProductSelectionDraft> {


    /**
     *  <p>User-defined unique identifier for the ProductSelection.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>Name of the ProductSelection. Not checked for uniqueness, but distinct names are recommended.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    /**
     *  <p>Custom Fields of this ProductSelection.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();
    /**
     *  <p>Type of the Product Selection.</p>
     * @return type
     */
    @Deprecated
    @JsonProperty("type")
    public ProductSelectionTypeEnum getType();
    /**
     *  <p>Mode of the Product Selection.</p>
     * @return mode
     */
    
    @JsonProperty("mode")
    public ProductSelectionMode getMode();

    /**
     *  <p>User-defined unique identifier for the ProductSelection.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     *  <p>Name of the ProductSelection. Not checked for uniqueness, but distinct names are recommended.</p>
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    
    
    /**
     *  <p>Custom Fields of this ProductSelection.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFieldsDraft custom);
    
    
    /**
     *  <p>Type of the Product Selection.</p>
     * @param type value to be set
     */
    @Deprecated
    public void setType(final ProductSelectionTypeEnum type);
    
    
    /**
     *  <p>Mode of the Product Selection.</p>
     * @param mode value to be set
     */
    
    public void setMode(final ProductSelectionMode mode);
    

    /**
     * factory method
     * @return instance of ProductSelectionDraft
     */
    public static ProductSelectionDraft of(){
        return new ProductSelectionDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductSelectionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionDraft of(final ProductSelectionDraft template) {
        ProductSelectionDraftImpl instance = new ProductSelectionDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setCustom(template.getCustom());
        instance.setType(template.getType());
        instance.setMode(template.getMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionDraft deepCopy(@Nullable final ProductSelectionDraft template) {
        if (template == null) {
            return null;
        }
        ProductSelectionDraftImpl instance = new ProductSelectionDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setType(template.getType());
        instance.setMode(template.getMode());
        return instance;
    }

    /**
     * builder factory method for ProductSelectionDraft
     * @return builder
     */
    public static ProductSelectionDraftBuilder builder() {
        return ProductSelectionDraftBuilder.of();
    }
    
    /**
     * create builder for ProductSelectionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionDraftBuilder builder(final ProductSelectionDraft template) {
        return ProductSelectionDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionDraft(Function<ProductSelectionDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionDraft>";
            }
        };
    }
}
