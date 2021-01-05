package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.products.ProductImport;
import com.commercetools.importapi.models.importrequests.ProductImportRequestImpl;

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

    @JsonIgnore
    public void setResources(final ProductImport ...resources);
    public void setResources(final List<ProductImport> resources);

    public static ProductImportRequest of(){
        return new ProductImportRequestImpl();
    }
    

    public static ProductImportRequest of(final ProductImportRequest template) {
        ProductImportRequestImpl instance = new ProductImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static ProductImportRequestBuilder builder(){
        return ProductImportRequestBuilder.of();
    }
    
    public static ProductImportRequestBuilder builder(final ProductImportRequest template){
        return ProductImportRequestBuilder.of(template);
    }
    

    default <T> T withProductImportRequest(Function<ProductImportRequest, T> helper) {
        return helper.apply(this);
    }
}
