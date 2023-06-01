package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.tax_category.TaxRate;
import java.time.ZonedDateTime;
import com.commercetools.api.models.tax_category.TaxCategoryImpl;

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
 * TaxCategory
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategory taxCategory = TaxCategory.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .plusRates(ratesBuilder -> ratesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryImpl.class)
public interface TaxCategory extends BaseResource, TaxCategoryMixin, com.commercetools.api.models.DomainResource<TaxCategory>, com.commercetools.api.models.Referencable<TaxCategory>, com.commercetools.api.models.ResourceIdentifiable<TaxCategory>, com.commercetools.api.models.WithKey {


    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>Current version of the TaxCategory.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    /**
     *  <p>Date and time (UTC) the TaxCategory was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    /**
     *  <p>Date and time (UTC) the TaxCategory was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();
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
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @return rates
     */
    @NotNull
    @Valid
    @JsonProperty("rates")
    public List<TaxRate> getRates();
    /**
     *  <p>User-defined unique identifier of the TaxCategory.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the TaxCategory.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>Current version of the TaxCategory.</p>
     * @param version value to be set
     */
    
    public void setVersion(final Long version);
    
    
    /**
     *  <p>Date and time (UTC) the TaxCategory was initially created.</p>
     * @param createdAt value to be set
     */
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    
    /**
     *  <p>Date and time (UTC) the TaxCategory was last updated.</p>
     * @param lastModifiedAt value to be set
     */
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */
    
    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */
    
    public void setCreatedBy(final CreatedBy createdBy);
    
    
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
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param rates values to be set
     */
    
    @JsonIgnore
    public void setRates(final TaxRate ...rates);
    /**
     *  <p>Tax rates and subrates of states and countries. Each TaxRate in the array has a unique ID.</p>
     * @param rates values to be set
     */
    
    public void setRates(final List<TaxRate> rates);
    
    /**
     *  <p>User-defined unique identifier of the TaxCategory.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of TaxCategory
     */
    public static TaxCategory of(){
        return new TaxCategoryImpl();
    }
    

    /**
     * factory method to create a shallow copy TaxCategory
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategory of(final TaxCategory template) {
        TaxCategoryImpl instance = new TaxCategoryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setRates(template.getRates());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategory
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategory deepCopy(@Nullable final TaxCategory template) {
        if (template == null) {
            return null;
        }
        TaxCategoryImpl instance = new TaxCategoryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setRates(Optional.ofNullable(template.getRates())
                .map(t -> t.stream().map(com.commercetools.api.models.tax_category.TaxRate::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TaxCategory
     * @return builder
     */
    public static TaxCategoryBuilder builder() {
        return TaxCategoryBuilder.of();
    }
    
    /**
     * create builder for TaxCategory instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryBuilder builder(final TaxCategory template) {
        return TaxCategoryBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategory(Function<TaxCategory, T> helper) {
        return helper.apply(this);
    }
    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.TAX_CATEGORY;
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategory> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategory>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategory>";
            }
        };
    }
}
