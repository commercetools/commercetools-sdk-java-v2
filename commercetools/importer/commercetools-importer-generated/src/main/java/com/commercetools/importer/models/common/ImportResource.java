package com.commercetools.importer.models.common;

import com.commercetools.importer.models.categories.CategoryImport;
import com.commercetools.importer.models.prices.PriceImport;
import com.commercetools.importer.models.productdrafts.ProductDraftImport;
import com.commercetools.importer.models.products.ProductImport;
import com.commercetools.importer.models.producttypes.ProductTypeImport;
import com.commercetools.importer.models.productvariants.ProductVariantImport;
import com.commercetools.importer.models.common.ImportResourceImpl;

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
*  <p>A representation of the resource to import.
*  Import resources are similar to commercetools draft types, but they only support key references.
*  In general, import resources are more granular then the normal commercetools resource.
*  They are optimized for incremental updates and therefore have a slightly different structure.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ImportResourceImpl.class)
public interface ImportResource  {

    
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ImportResourceImpl of(){
        return new ImportResourceImpl();
    }
    

    public static ImportResourceImpl of(final ImportResource template) {
        ImportResourceImpl instance = new ImportResourceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

}
