
package com.commercetools.api.models.business_unit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitBuilder {

    public com.commercetools.api.models.business_unit.CompanyBuilder companyBuilder() {
        return com.commercetools.api.models.business_unit.CompanyBuilder.of();
    }

    public com.commercetools.api.models.business_unit.DivisionBuilder divisionBuilder() {
        return com.commercetools.api.models.business_unit.DivisionBuilder.of();
    }

    public static BusinessUnitBuilder of() {
        return new BusinessUnitBuilder();
    }
}
