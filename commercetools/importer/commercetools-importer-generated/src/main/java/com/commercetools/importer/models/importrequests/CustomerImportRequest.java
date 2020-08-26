package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.common.ImportResourceType;
import com.commercetools.importer.models.customers.CustomerImport;
import com.commercetools.importer.models.importrequests.ImportRequest;
import com.commercetools.importer.models.importrequests.CustomerImportRequestImpl;

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
*  <p>An import request for multiple customer import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerImportRequestImpl.class)
public interface CustomerImportRequest extends ImportRequest {

    /**
    *  <p>The customer import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<CustomerImport> getResources();

    public void setResources(final List<CustomerImport> resources);

    public static CustomerImportRequestImpl of(){
        return new CustomerImportRequestImpl();
    }
    

    public static CustomerImportRequestImpl of(final CustomerImportRequest template) {
        CustomerImportRequestImpl instance = new CustomerImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

}
