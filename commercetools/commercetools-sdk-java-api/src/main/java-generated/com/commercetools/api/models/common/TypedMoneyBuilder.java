
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypedMoneyBuilder {

    public com.commercetools.api.models.common.CentPrecisionMoneyBuilder centPrecisionBuilder() {
        return com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of();
    }

    public com.commercetools.api.models.common.HighPrecisionMoneyBuilder highPrecisionBuilder() {
        return com.commercetools.api.models.common.HighPrecisionMoneyBuilder.of();
    }

    public static TypedMoneyBuilder of() {
        return new TypedMoneyBuilder();
    }
}
