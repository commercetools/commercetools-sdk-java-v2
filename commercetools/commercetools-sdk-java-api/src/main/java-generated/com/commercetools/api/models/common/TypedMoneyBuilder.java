
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypedMoneyBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypedMoneyBuilder {

    public com.commercetools.api.models.common.CentPrecisionMoneyBuilder centPrecisionBuilder() {
        return com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of();
    }

    public com.commercetools.api.models.common.HighPrecisionMoneyBuilder highPrecisionBuilder() {
        return com.commercetools.api.models.common.HighPrecisionMoneyBuilder.of();
    }

    /**
     * factory method for an instance of TypedMoneyBuilder
     * @return builder
     */
    public static TypedMoneyBuilder of() {
        return new TypedMoneyBuilder();
    }
}
