
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypedMoneyDraftBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypedMoneyDraftBuilder {

    public com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder centPrecisionBuilder() {
        return com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder.of();
    }

    public com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder highPrecisionBuilder() {
        return com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder.of();
    }

    /**
     * factory method for an instance of TypedMoneyDraftBuilder
     * @return builder
     */
    public static TypedMoneyDraftBuilder of() {
        return new TypedMoneyDraftBuilder();
    }

}
