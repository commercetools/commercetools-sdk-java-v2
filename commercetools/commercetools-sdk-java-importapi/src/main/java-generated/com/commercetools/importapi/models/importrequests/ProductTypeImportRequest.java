package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.producttypes.ProductTypeImport;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequestImpl;

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
*  <p>An import request for multiple product type import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductTypeImportRequestImpl.class)
public interface ProductTypeImportRequest extends ImportRequest {

    /**
    *  <p>The product type import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<ProductTypeImport> getResources();

    public void setResources(final List<ProductTypeImport> resources);

    public static ProductTypeImportRequestImpl of(){
        return new ProductTypeImportRequestImpl();
    }
    

    public static ProductTypeImportRequestImpl of(final ProductTypeImportRequest template) {
        ProductTypeImportRequestImpl instance = new ProductTypeImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

}
