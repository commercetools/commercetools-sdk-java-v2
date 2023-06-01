package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
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
 *  <p>Changing the slug produces the CategorySlugChanged Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategoryChangeSlugActionImpl implements CategoryChangeSlugAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.LocalizedString slug;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategoryChangeSlugActionImpl(@JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        this.action =  CHANGE_SLUG;
    }
    /**
     * create empty instance
     */
    public CategoryChangeSlugActionImpl() {
        this.action =  CHANGE_SLUG;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set. Must not be empty. A Category can have the same slug for different Locales, but it must be unique across the Project. Valid slugs must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     */
    
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }

    
    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
        this.slug = slug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CategoryChangeSlugActionImpl that = (CategoryChangeSlugActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(slug, that.slug)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(slug)
            .toHashCode();
    }

}
