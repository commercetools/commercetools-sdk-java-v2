
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customers.CustomerImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The request body to <a href="#import-customers">import Customers</a>. Contains data for <a href="/../api/projects/customers#customer">Customers</a> to be created or updated in a commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerImportRequestImpl.class)
public interface CustomerImportRequest extends ImportRequest {

    String CUSTOMER = "customer";

    /**
    *  <p>The customer import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<CustomerImport> getResources();

    @JsonIgnore
    public void setResources(final CustomerImport... resources);

    public void setResources(final List<CustomerImport> resources);

    public static CustomerImportRequest of() {
        return new CustomerImportRequestImpl();
    }

    public static CustomerImportRequest of(final CustomerImportRequest template) {
        CustomerImportRequestImpl instance = new CustomerImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static CustomerImportRequestBuilder builder() {
        return CustomerImportRequestBuilder.of();
    }

    public static CustomerImportRequestBuilder builder(final CustomerImportRequest template) {
        return CustomerImportRequestBuilder.of(template);
    }

    default <T> T withCustomerImportRequest(Function<CustomerImportRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerImportRequest>";
            }
        };
    }
}
