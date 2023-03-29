
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.customers.CustomerImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The request body to import Customers. Contains data for Customers to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerImportRequest customerImportRequest = CustomerImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerImportRequestImpl.class)
public interface CustomerImportRequest extends ImportRequest {

    /**
     * discriminator value for CustomerImportRequest
     */
    String CUSTOMER = "customer";

    /**
     *  <p>The customer import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<CustomerImport> getResources();

    /**
     *  <p>The customer import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final CustomerImport... resources);

    /**
     *  <p>The customer import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<CustomerImport> resources);

    /**
     * factory method
     * @return instance of CustomerImportRequest
     */
    public static CustomerImportRequest of() {
        return new CustomerImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy CustomerImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerImportRequest of(final CustomerImportRequest template) {
        CustomerImportRequestImpl instance = new CustomerImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerImportRequest deepCopy(@Nullable final CustomerImportRequest template) {
        if (template == null) {
            return null;
        }
        CustomerImportRequestImpl instance = new CustomerImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.customers.CustomerImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerImportRequest
     * @return builder
     */
    public static CustomerImportRequestBuilder builder() {
        return CustomerImportRequestBuilder.of();
    }

    /**
     * create builder for CustomerImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerImportRequestBuilder builder(final CustomerImportRequest template) {
        return CustomerImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerImportRequest(Function<CustomerImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerImportRequest>";
            }
        };
    }
}
