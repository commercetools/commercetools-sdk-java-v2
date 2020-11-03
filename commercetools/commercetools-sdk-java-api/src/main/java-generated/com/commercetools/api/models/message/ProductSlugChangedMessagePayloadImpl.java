package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.MessagePayload;
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
public final class ProductSlugChangedMessagePayloadImpl implements ProductSlugChangedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.common.LocalizedString slug;

    @JsonCreator
    ProductSlugChangedMessagePayloadImpl(@JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        this.type = "ProductSlugChanged";
    }
    public ProductSlugChangedMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
        this.slug = slug;
    }

}
