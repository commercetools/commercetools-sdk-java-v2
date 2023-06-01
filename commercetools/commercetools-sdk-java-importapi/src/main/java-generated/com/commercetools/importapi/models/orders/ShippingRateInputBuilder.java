package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.ClassificationShippingRateInput;
import com.commercetools.importapi.models.orders.ScoreShippingRateInput;
import com.commercetools.importapi.models.orders.ShippingRateInputType;
import com.commercetools.importapi.models.orders.ShippingRateInput;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateInputBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingRateInputBuilder {

    public com.commercetools.importapi.models.orders.ClassificationShippingRateInputBuilder classificationBuilder() {
       return com.commercetools.importapi.models.orders.ClassificationShippingRateInputBuilder.of();
    }
    public com.commercetools.importapi.models.orders.ScoreShippingRateInputBuilder scoreBuilder() {
       return com.commercetools.importapi.models.orders.ScoreShippingRateInputBuilder.of();
    }

    /**
     * factory method for an instance of ShippingRateInputBuilder
     * @return builder 
     */
    public static ShippingRateInputBuilder of() {
        return new ShippingRateInputBuilder();
    }

}
