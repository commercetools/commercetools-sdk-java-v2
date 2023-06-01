package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryDraftImpl;

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
 * TaxCategoryDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryDraft taxCategoryDraft = TaxCategoryDraft.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryDraftImpl.class)
public interface TaxCategoryDraft extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<TaxCategoryDraft> {


    /**
     *  <p>Name of the TaxCategory.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *  <p>Description of the TaxCategory.</p>
     * @return description
     */
    
    @JsonProperty("description")
    public String getDescription();
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @return rates
     */
    @Valid
    @JsonProperty("rates")
    public List<TaxRateDraft> getRates();
    /**
     *  <p>User-defined unique identifier for the TaxCategory.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the TaxCategory.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     *  <p>Description of the TaxCategory.</p>
     * @param description value to be set
     */
    
    public void setDescription(final String description);
    
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param rates values to be set
     */
    
    @JsonIgnore
    public void setRates(final TaxRateDraft ...rates);
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param rates values to be set
     */
    
    public void setRates(final List<TaxRateDraft> rates);
    
    /**
     *  <p>User-defined unique identifier for the TaxCategory.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of TaxCategoryDraft
     */
    public static TaxCategoryDraft of(){
        return new TaxCategoryDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy TaxCategoryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryDraft of(final TaxCategoryDraft template) {
        TaxCategoryDraftImpl instance = new TaxCategoryDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setRates(template.getRates());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategoryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryDraft deepCopy(@Nullable final TaxCategoryDraft template) {
        if (template == null) {
            return null;
        }
        TaxCategoryDraftImpl instance = new TaxCategoryDraftImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setRates(Optional.ofNullable(template.getRates())
                .map(t -> t.stream().map(com.commercetools.api.models.tax_category.TaxRateDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TaxCategoryDraft
     * @return builder
     */
    public static TaxCategoryDraftBuilder builder() {
        return TaxCategoryDraftBuilder.of();
    }
    
    /**
     * create builder for TaxCategoryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryDraftBuilder builder(final TaxCategoryDraft template) {
        return TaxCategoryDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryDraft(Function<TaxCategoryDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryDraft>";
            }
        };
    }
}
