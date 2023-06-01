package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.HighPrecisionMoney;
import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.common.MoneyType;
import com.commercetools.importapi.models.common.TypedMoney;
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

    public com.commercetools.importapi.models.common.HighPrecisionMoneyBuilder highPrecisionBuilder() {
       return com.commercetools.importapi.models.common.HighPrecisionMoneyBuilder.of();
    }
    public com.commercetools.importapi.models.common.MoneyBuilder centPrecisionBuilder() {
       return com.commercetools.importapi.models.common.MoneyBuilder.of();
    }

    /**
     * factory method for an instance of TypedMoneyBuilder
     * @return builder 
     */
    public static TypedMoneyBuilder of() {
        return new TypedMoneyBuilder();
    }

}
