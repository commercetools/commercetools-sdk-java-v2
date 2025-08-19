
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.business_units.BusinessUnitImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to import Business Units. Contains data for Business Units to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitImportRequest businessUnitImportRequest = BusinessUnitImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("business-unit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitImportRequestImpl.class)
public interface BusinessUnitImportRequest extends ImportRequest {

    /**
     * discriminator value for BusinessUnitImportRequest
     */
    String BUSINESS_UNIT = "business-unit";

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<BusinessUnitImport> getResources();

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final BusinessUnitImport... resources);

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @param resources values to be set
     */

    public void setResources(final List<BusinessUnitImport> resources);

    /**
     * factory method
     * @return instance of BusinessUnitImportRequest
     */
    public static BusinessUnitImportRequest of() {
        return new BusinessUnitImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitImportRequest of(final BusinessUnitImportRequest template) {
        BusinessUnitImportRequestImpl instance = new BusinessUnitImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public BusinessUnitImportRequest copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitImportRequest deepCopy(@Nullable final BusinessUnitImportRequest template) {
        if (template == null) {
            return null;
        }
        BusinessUnitImportRequestImpl instance = new BusinessUnitImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.business_units.BusinessUnitImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitImportRequest
     * @return builder
     */
    public static BusinessUnitImportRequestBuilder builder() {
        return BusinessUnitImportRequestBuilder.of();
    }

    /**
     * create builder for BusinessUnitImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitImportRequestBuilder builder(final BusinessUnitImportRequest template) {
        return BusinessUnitImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitImportRequest(Function<BusinessUnitImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitImportRequest>";
            }
        };
    }
}
