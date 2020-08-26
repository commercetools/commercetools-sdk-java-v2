package com.commercetools.importapi.models.producttypes;

import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.producttypes.AttributeDefinition;
import com.commercetools.importapi.models.producttypes.ProductTypeImportImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>Import representation for a product type.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeImportImpl.class)
public interface ProductTypeImport extends ImportResource {

    /**
    *  <p>Maps to <code>ProductType.name</code>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
    *  <p>Maps to <code>ProductType.description</code>.</p>
    */
    @NotNull
    @JsonProperty("description")
    public String getDescription();
    /**
    *  <p>The product type's attributes.</p>
    */
    @Valid
    @JsonProperty("attributes")
    public List<AttributeDefinition> getAttributes();

    public void setName(final String name);
    
    public void setDescription(final String description);
    
    public void setAttributes(final List<AttributeDefinition> attributes);

    public static ProductTypeImportImpl of(){
        return new ProductTypeImportImpl();
    }
    

    public static ProductTypeImportImpl of(final ProductTypeImport template) {
        ProductTypeImportImpl instance = new ProductTypeImportImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttributes(template.getAttributes());
        return instance;
    }

}
