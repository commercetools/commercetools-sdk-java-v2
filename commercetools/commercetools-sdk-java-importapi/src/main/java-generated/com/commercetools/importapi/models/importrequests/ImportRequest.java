package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.CategoryImportRequest;
import com.commercetools.importapi.models.importrequests.CustomerImportRequest;
import com.commercetools.importapi.models.importrequests.InventoryImportRequest;
import com.commercetools.importapi.models.importrequests.OrderImportRequest;
import com.commercetools.importapi.models.importrequests.PriceImportRequest;
import com.commercetools.importapi.models.importrequests.ProductDraftImportRequest;
import com.commercetools.importapi.models.importrequests.ProductImportRequest;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequest;
import com.commercetools.importapi.models.importrequests.ProductVariantImportRequest;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>An import request batches multiple import resources of the same import resource type for processing by an import sink.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.CategoryImportRequestImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.CustomerImportRequestImpl.class, name = "customer"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.InventoryImportRequestImpl.class, name = "inventory"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.OrderImportRequestImpl.class, name = "order"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.PriceImportRequestImpl.class, name = "price"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductDraftImportRequestImpl.class, name = "product-draft"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductImportRequestImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductTypeImportRequestImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductVariantImportRequestImpl.class, name = "product-variant"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestImpl.class, name = "product-variant-patch")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    defaultImpl = ImportRequestImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ImportRequest  {

    /**
    *  <p>The type of the import resource.</p>
    */
    @NotNull
    @JsonProperty("type")
    public ImportResourceType getType();





    default <T> T withImportRequest(Function<ImportRequest, T> helper) {
        return helper.apply(this);
    }
}
