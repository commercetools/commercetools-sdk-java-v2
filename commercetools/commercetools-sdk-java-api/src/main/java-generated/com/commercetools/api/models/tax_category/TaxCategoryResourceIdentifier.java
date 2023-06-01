package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierImpl;

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
 *  <p>ResourceIdentifier to a TaxCategory.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryResourceIdentifier taxCategoryResourceIdentifier = TaxCategoryResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryResourceIdentifierImpl.class)
public interface TaxCategoryResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<TaxCategory> {

    /**
     * discriminator value for TaxCategoryResourceIdentifier
     */
    String TAX_CATEGORY = "tax-category";

    /**
     *  <p>Unique identifier of the referenced TaxCategory. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined unique identifier of the referenced TaxCategory. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced TaxCategory. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined unique identifier of the referenced TaxCategory. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of TaxCategoryResourceIdentifier
     */
    public static TaxCategoryResourceIdentifier of(){
        return new TaxCategoryResourceIdentifierImpl();
    }
    

    /**
     * factory method to create a shallow copy TaxCategoryResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryResourceIdentifier of(final TaxCategoryResourceIdentifier template) {
        TaxCategoryResourceIdentifierImpl instance = new TaxCategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategoryResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryResourceIdentifier deepCopy(@Nullable final TaxCategoryResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        TaxCategoryResourceIdentifierImpl instance = new TaxCategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TaxCategoryResourceIdentifier
     * @return builder
     */
    public static TaxCategoryResourceIdentifierBuilder builder() {
        return TaxCategoryResourceIdentifierBuilder.of();
    }
    
    /**
     * create builder for TaxCategoryResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryResourceIdentifierBuilder builder(final TaxCategoryResourceIdentifier template) {
        return TaxCategoryResourceIdentifierBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryResourceIdentifier(Function<TaxCategoryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryResourceIdentifier>";
            }
        };
    }
}
