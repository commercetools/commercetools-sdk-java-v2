
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypedMoneyDraftBuilder {

    public com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder centPrecisionBuilder() {
        return com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder.of();
    }

    public com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder highPrecisionBuilder() {
        return com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder.of();
    }

    public static TypedMoneyDraftBuilder of() {
        return new TypedMoneyDraftBuilder();
    }
}
