
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypedMoneyBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypedMoneyBuilder {

    public com.commercetools.history.models.common.CentPrecisionMoneyBuilder centPrecisionBuilder() {
        return com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of();
    }

    /**
     * factory method for an instance of TypedMoneyBuilder
     * @return builder
     */
    public static TypedMoneyBuilder of() {
        return new TypedMoneyBuilder();
    }

}
