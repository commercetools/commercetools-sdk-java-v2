package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.products.ProductImport;
import com.commercetools.importapi.models.importrequests.ProductImportRequestImpl;

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
*  <p>An import request for multiple product import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductImportRequestImpl.class)
public interface ProductImportRequest extends ImportRequest {

    /**
    *  <p>The product import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductImport> getResources();

    public void setResources(final List<ProductImport> resources);

    public static ProductImportRequestImpl of(){
        return new ProductImportRequestImpl();
    }
    

    public static ProductImportRequestImpl of(final ProductImportRequest template) {
        ProductImportRequestImpl instance = new ProductImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

}
