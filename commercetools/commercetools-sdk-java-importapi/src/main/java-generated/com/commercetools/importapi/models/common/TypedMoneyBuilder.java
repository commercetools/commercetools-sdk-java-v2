
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypedMoneyBuilder {

    public com.commercetools.importapi.models.common.HighPrecisionMoneyBuilder highPrecisionBuilder() {
        return com.commercetools.importapi.models.common.HighPrecisionMoneyBuilder.of();
    }

    public com.commercetools.importapi.models.common.MoneyBuilder centPrecisionBuilder() {
        return com.commercetools.importapi.models.common.MoneyBuilder.of();
    }

    public static TypedMoneyBuilder of() {
        return new TypedMoneyBuilder();
    }
}
