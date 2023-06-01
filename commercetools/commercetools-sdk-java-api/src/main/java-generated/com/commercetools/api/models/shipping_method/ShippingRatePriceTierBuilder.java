package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.CartClassificationTier;
import com.commercetools.api.models.shipping_method.CartScoreTier;
import com.commercetools.api.models.shipping_method.CartValueTier;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
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

    public com.commercetools.api.models.shipping_method.CartClassificationTierBuilder cartClassificationBuilder() {
       return com.commercetools.api.models.shipping_method.CartClassificationTierBuilder.of();
    }
    public com.commercetools.api.models.shipping_method.CartScoreTierBuilder cartScoreBuilder() {
       return com.commercetools.api.models.shipping_method.CartScoreTierBuilder.of();
    }
    public com.commercetools.api.models.shipping_method.CartValueTierBuilder cartValueBuilder() {
       return com.commercetools.api.models.shipping_method.CartValueTierBuilder.of();
    }

    /**
     * factory method for an instance of ShippingRatePriceTierBuilder
     * @return builder 
     */
    public static ShippingRatePriceTierBuilder of() {
        return new ShippingRatePriceTierBuilder();
    }

}
