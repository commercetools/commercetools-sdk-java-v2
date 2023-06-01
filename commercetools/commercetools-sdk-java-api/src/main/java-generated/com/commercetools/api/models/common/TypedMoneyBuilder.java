package com.commercetools.api.models.common;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.common.HighPrecisionMoney;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoney;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypedMoneyBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
