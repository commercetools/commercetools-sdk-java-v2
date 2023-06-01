package com.commercetools.api.models.me;

import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.me.MyCompanyDraft;
import com.commercetools.api.models.me.MyDivisionDraft;
import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.me.MyBusinessUnitDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitDraftBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitDraftBuilder {

    public com.commercetools.api.models.me.MyCompanyDraftBuilder companyBuilder() {
       return com.commercetools.api.models.me.MyCompanyDraftBuilder.of();
    }
    public com.commercetools.api.models.me.MyDivisionDraftBuilder divisionBuilder() {
       return com.commercetools.api.models.me.MyDivisionDraftBuilder.of();
    }

    /**
     * factory method for an instance of MyBusinessUnitDraftBuilder
     * @return builder 
     */
    public static MyBusinessUnitDraftBuilder of() {
        return new MyBusinessUnitDraftBuilder();
    }

}
