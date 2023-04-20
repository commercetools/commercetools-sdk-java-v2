
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitDraftBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
