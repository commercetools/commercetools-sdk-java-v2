package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.tax_category.TaxRate;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryImpl implements TaxCategory {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private String name;
    
    private String description;
    
    private java.util.List<com.commercetools.api.models.tax_category.TaxRate> rates;
    
    private String key;

    @JsonCreator
    TaxCategoryImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("rates") final java.util.List<com.commercetools.api.models.tax_category.TaxRate> rates, @JsonProperty("key") final String key) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.name = name;
        this.description = description;
        this.rates = rates;
        this.key = key;
    }
    public TaxCategoryImpl() {
       
    }

    /**
    *  <p>The unique ID of the category.</p>
    */
    public String getId(){
        return this.id;
    }
    
    /**
    *  <p>The current version of the category.</p>
    */
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    
    public String getDescription(){
        return this.description;
    }
    
    /**
    *  <p>The tax rates have unique IDs in the rates list</p>
    */
    public java.util.List<com.commercetools.api.models.tax_category.TaxRate> getRates(){
        return this.rates;
    }
    
    /**
    *  <p>User-specific unique identifier for the category.</p>
    */
    public String getKey(){
        return this.key;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    public void setName(final String name){
        this.name = name;
    }
    
    public void setDescription(final String description){
        this.description = description;
    }
    
    public void setRates(final com.commercetools.api.models.tax_category.TaxRate ...rates){
       this.rates = new ArrayList<>(Arrays.asList(rates));
    }
    
    public void setRates(final java.util.List<com.commercetools.api.models.tax_category.TaxRate> rates){
       this.rates = rates;
    }
    
    public void setKey(final String key){
        this.key = key;
    }

}
