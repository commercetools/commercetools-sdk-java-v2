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
*  <p>An import request batches multiple import resources of the same import resource type for processing by an import sink.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportRequestImpl implements ImportRequest {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    @JsonCreator
    ImportRequestImpl(@JsonProperty("type") final com.commercetools.importapi.models.common.ImportResourceType type) {
        this.type = type;
    }
    public ImportRequestImpl() {
    }

    /**
    *  <p>The type of the import resource.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }


}
