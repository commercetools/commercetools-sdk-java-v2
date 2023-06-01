package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.CartClassificationTier;
import com.commercetools.importapi.models.orders.ShippingRateTierType;
import com.commercetools.importapi.models.orders.ShippingRatePriceTier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRatePriceTierBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingRatePriceTierBuilder {

    public com.commercetools.importapi.models.orders.CartClassificationTierBuilder cartClassificationBuilder() {
       return com.commercetools.importapi.models.orders.CartClassificationTierBuilder.of();
    }

    /**
     * factory method for an instance of ShippingRatePriceTierBuilder
     * @return builder 
     */
    public static ShippingRatePriceTierBuilder of() {
        return new ShippingRatePriceTierBuilder();
    }

}
