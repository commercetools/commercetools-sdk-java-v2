
package com.commercetools.importapi.models.business_units;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitImportBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitImportBuilder {

    public com.commercetools.importapi.models.business_units.CompanyBusinessUnitImportBuilder companyBuilder() {
        return com.commercetools.importapi.models.business_units.CompanyBusinessUnitImportBuilder.of();
    }

    public com.commercetools.importapi.models.business_units.DivisionBusinessUnitImportBuilder divisionBuilder() {
        return com.commercetools.importapi.models.business_units.DivisionBusinessUnitImportBuilder.of();
    }

    /**
     * factory method for an instance of BusinessUnitImportBuilder
     * @return builder
     */
    public static BusinessUnitImportBuilder of() {
        return new BusinessUnitImportBuilder();
    }

}
