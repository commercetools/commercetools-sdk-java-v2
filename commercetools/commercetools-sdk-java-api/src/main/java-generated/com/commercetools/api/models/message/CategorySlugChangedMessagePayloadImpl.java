package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Change Slug update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategorySlugChangedMessagePayloadImpl implements CategorySlugChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.common.LocalizedString slug;
    
    
    private com.commercetools.api.models.common.LocalizedString oldSlug;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySlugChangedMessagePayloadImpl(@JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug, @JsonProperty("oldSlug") final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.slug = slug;
        this.oldSlug = oldSlug;
        this.type =  CATEGORY_SLUG_CHANGED;
    }
    /**
     * create empty instance
     */
    public CategorySlugChangedMessagePayloadImpl() {
        this.type =  CATEGORY_SLUG_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>The slug of the Category after the Change Slug update action.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    /**
     *  <p>The slug of the Category before the Change Slug update action.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getOldSlug(){
        return this.oldSlug;
    }

    
    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
        this.slug = slug;
    }
    
    
    public void setOldSlug(final com.commercetools.api.models.common.LocalizedString oldSlug){
        this.oldSlug = oldSlug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CategorySlugChangedMessagePayloadImpl that = (CategorySlugChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(slug, that.slug)
                .append(oldSlug, that.oldSlug)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(slug)
            .append(oldSlug)
            .toHashCode();
    }

}
