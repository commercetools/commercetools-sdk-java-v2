
package com.commercetools.api.models.business_unit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitDraftBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitDraftBuilder {

    public com.commercetools.api.models.business_unit.CompanyDraftBuilder companyBuilder() {
        return com.commercetools.api.models.business_unit.CompanyDraftBuilder.of();
    }

    public com.commercetools.api.models.business_unit.DivisionDraftBuilder divisionBuilder() {
        return com.commercetools.api.models.business_unit.DivisionDraftBuilder.of();
    }

    public static BusinessUnitDraftBuilder of() {
        return new BusinessUnitDraftBuilder();
    }
}
