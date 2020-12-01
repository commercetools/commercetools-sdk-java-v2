package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.categories.CategoryImport;
import com.commercetools.importapi.models.customers.CustomerImport;
import com.commercetools.importapi.models.inventories.InventoryImport;
import com.commercetools.importapi.models.orders.OrderImport;
import com.commercetools.importapi.models.prices.PriceImport;
import com.commercetools.importapi.models.productdrafts.ProductDraftImport;
import com.commercetools.importapi.models.products.ProductImport;
import com.commercetools.importapi.models.producttypes.ProductTypeImport;
import com.commercetools.importapi.models.productvariants.ProductVariantImport;
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
public final class ImportResourceImpl implements ImportResource {

    private String key;

    @JsonCreator
    ImportResourceImpl(@JsonProperty("key") final String key) {
        this.key = key;
    }
    public ImportResourceImpl() {
    }

    
    public String getKey(){
        return this.key;
    }

    public void setKey(final String key){
        this.key = key;
    }

}
