package com.commercetools.api.models.product;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductChangeSlugActionImpl implements ProductChangeSlugAction {

    private String action;
    
    private com.commercetools.api.models.common.LocalizedString slug;
    
    private Boolean staged;

    @JsonCreator
    ProductChangeSlugActionImpl(@JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug, @JsonProperty("staged") final Boolean staged) {
        this.slug = slug;
        this.staged = staged;
        this.action = "changeSlug";
    }
    public ProductChangeSlugActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    /**
    *  <p>Every slug must be unique across a project, but a product can have the same slug for different languages.
    *  Allowed are alphabetic, numeric, underscore (<code>_</code>) and hyphen (<code>-</code>) characters.
    *  Maximum size is <code>256</code>.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
        this.slug = slug;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
