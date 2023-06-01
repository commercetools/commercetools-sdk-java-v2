package com.commercetools.api.models.project;

import com.commercetools.api.models.project.CartClassificationType;
import com.commercetools.api.models.project.CartScoreType;
import com.commercetools.api.models.project.CartValueType;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.project.ShippingRateInputType;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateInputTypeBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingRateInputTypeBuilder {

    public com.commercetools.api.models.project.CartClassificationTypeBuilder cartClassificationBuilder() {
       return com.commercetools.api.models.project.CartClassificationTypeBuilder.of();
    }
    public com.commercetools.api.models.project.CartScoreTypeBuilder cartScoreBuilder() {
       return com.commercetools.api.models.project.CartScoreTypeBuilder.of();
    }
    public com.commercetools.api.models.project.CartValueTypeBuilder cartValueBuilder() {
       return com.commercetools.api.models.project.CartValueTypeBuilder.of();
    }

    /**
     * factory method for an instance of ShippingRateInputTypeBuilder
     * @return builder 
     */
    public static ShippingRateInputTypeBuilder of() {
        return new ShippingRateInputTypeBuilder();
    }

}
