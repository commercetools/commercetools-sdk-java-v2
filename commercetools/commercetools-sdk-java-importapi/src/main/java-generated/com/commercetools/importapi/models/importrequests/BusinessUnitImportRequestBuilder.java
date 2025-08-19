
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitImportRequestBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitImportRequestBuilder implements Builder<BusinessUnitImportRequest> {

    private java.util.List<com.commercetools.importapi.models.business_units.BusinessUnitImport> resources;

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @param resources value to be set
     * @return Builder
     */

    public BusinessUnitImportRequestBuilder resources(
            final com.commercetools.importapi.models.business_units.BusinessUnitImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @param resources value to be set
     * @return Builder
     */

    public BusinessUnitImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.business_units.BusinessUnitImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @param resources value to be set
     * @return Builder
     */

    public BusinessUnitImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.business_units.BusinessUnitImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public BusinessUnitImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.business_units.BusinessUnitImportBuilder, Builder<? extends com.commercetools.importapi.models.business_units.BusinessUnitImport>> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.business_units.BusinessUnitImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public BusinessUnitImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.business_units.BusinessUnitImportBuilder, Builder<? extends com.commercetools.importapi.models.business_units.BusinessUnitImport>> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.business_units.BusinessUnitImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.business_units.BusinessUnitImport> getResources() {
        return this.resources;
    }

    /**
     * builds BusinessUnitImportRequest with checking for non-null required values
     * @return BusinessUnitImportRequest
     */
    public BusinessUnitImportRequest build() {
        Objects.requireNonNull(resources, BusinessUnitImportRequest.class + ": resources is missing");
        return new BusinessUnitImportRequestImpl(resources);
    }

    /**
     * builds BusinessUnitImportRequest without checking for non-null required values
     * @return BusinessUnitImportRequest
     */
    public BusinessUnitImportRequest buildUnchecked() {
        return new BusinessUnitImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of BusinessUnitImportRequestBuilder
     * @return builder
     */
    public static BusinessUnitImportRequestBuilder of() {
        return new BusinessUnitImportRequestBuilder();
    }

    /**
     * create builder for BusinessUnitImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitImportRequestBuilder of(final BusinessUnitImportRequest template) {
        BusinessUnitImportRequestBuilder builder = new BusinessUnitImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
