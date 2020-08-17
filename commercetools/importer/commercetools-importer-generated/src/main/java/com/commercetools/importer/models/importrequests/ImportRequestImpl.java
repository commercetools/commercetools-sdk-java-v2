package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.importrequests.CategoryImportRequest;
import com.commercetools.importer.models.importrequests.PriceImportRequest;
import com.commercetools.importer.models.importrequests.ProductDraftImportRequest;
import com.commercetools.importer.models.importrequests.ProductImportRequest;
import com.commercetools.importer.models.importrequests.ProductTypeImportRequest;
import com.commercetools.importer.models.importrequests.ProductVariantImportRequest;
import com.commercetools.importer.models.importrequests.ProductVariantPatchRequest;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>An import request batches multiple import resources of the same import resource type for processing by an import sink.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportRequestImpl implements ImportRequest {

    private com.commercetools.importer.models.common.ImportResourceType type;

    @JsonCreator
    ImportRequestImpl() {
        this.type = ImportResourceType.findEnumViaJsonName("null").get();
    }
    

    /**
    *  <p>The type of the import resource.</p>
    */
    public com.commercetools.importer.models.common.ImportResourceType getType(){
        return this.type;
    }


}
