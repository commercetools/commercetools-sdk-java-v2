package com.commercetools.api.models.common;

import com.commercetools.api.models.common.CentPrecisionMoneyDraft;
import com.commercetools.api.models.common.HighPrecisionMoneyDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoneyDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypedMoneyDraftBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
