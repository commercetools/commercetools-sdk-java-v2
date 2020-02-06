package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.CategoryImportRequest;
import com.commercetools.importer.models.importrequests.PriceImportRequest;
import com.commercetools.importer.models.importrequests.ProductDraftImportRequest;
import com.commercetools.importer.models.importrequests.ProductImportRequest;
import com.commercetools.importer.models.importrequests.ProductTypeImportRequest;
import com.commercetools.importer.models.importrequests.ProductVariantImportRequest;
import com.commercetools.importer.models.importrequests.ProductVariantPatchRequest;


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
*  <p>An import request batches multiple import resources of the same import resource type for processing by an import sink.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importer.models.importrequests.CategoryImportRequestImpl.class, name = "category"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.importrequests.ProductImportRequestImpl.class, name = "product"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.importrequests.ProductDraftImportRequestImpl.class, name = "product-draft"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.importrequests.ProductTypeImportRequestImpl.class, name = "product-type"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.importrequests.ProductVariantImportRequestImpl.class, name = "product-variant"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.importrequests.PriceImportRequestImpl.class, name = "price"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.importrequests.ProductVariantPatchRequestImpl.class, name = "product-variant-patch")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = ImportRequestImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ImportRequest  {


   


}