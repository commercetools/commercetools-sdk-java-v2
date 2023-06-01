package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.AssociateDraft;
import com.commercetools.api.models.business_unit.BusinessUnitAssociateMode;
import com.commercetools.api.models.business_unit.BusinessUnitStatus;
import com.commercetools.api.models.business_unit.BusinessUnitStoreMode;
import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.commercetools.api.models.business_unit.CompanyDraft;
import com.commercetools.api.models.business_unit.DivisionDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.business_unit.BusinessUnitDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitDraftBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitDraftBuilder {

    public com.commercetools.api.models.business_unit.CompanyDraftBuilder companyBuilder() {
       return com.commercetools.api.models.business_unit.CompanyDraftBuilder.of();
    }
    public com.commercetools.api.models.business_unit.DivisionDraftBuilder divisionBuilder() {
       return com.commercetools.api.models.business_unit.DivisionDraftBuilder.of();
    }

    /**
     * factory method for an instance of BusinessUnitDraftBuilder
     * @return builder 
     */
    public static BusinessUnitDraftBuilder of() {
        return new BusinessUnitDraftBuilder();
    }

}
