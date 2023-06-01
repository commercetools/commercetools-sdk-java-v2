package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.Associate;
import com.commercetools.api.models.business_unit.BusinessUnitAssociateMode;
import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.business_unit.BusinessUnitStatus;
import com.commercetools.api.models.business_unit.BusinessUnitStoreMode;
import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.commercetools.api.models.business_unit.Company;
import com.commercetools.api.models.business_unit.Division;
import com.commercetools.api.models.business_unit.InheritedAssociate;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.business_unit.BusinessUnit;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitBuilder {

    public com.commercetools.api.models.business_unit.CompanyBuilder companyBuilder() {
       return com.commercetools.api.models.business_unit.CompanyBuilder.of();
    }
    public com.commercetools.api.models.business_unit.DivisionBuilder divisionBuilder() {
       return com.commercetools.api.models.business_unit.DivisionBuilder.of();
    }

    /**
     * factory method for an instance of BusinessUnitBuilder
     * @return builder 
     */
    public static BusinessUnitBuilder of() {
        return new BusinessUnitBuilder();
    }

}
