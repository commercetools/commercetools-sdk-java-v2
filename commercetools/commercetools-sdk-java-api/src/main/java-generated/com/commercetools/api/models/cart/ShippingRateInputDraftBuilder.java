package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ClassificationShippingRateInputDraft;
import com.commercetools.api.models.cart.ScoreShippingRateInputDraft;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateInputDraftBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingRateInputDraftBuilder {

    public com.commercetools.api.models.cart.ClassificationShippingRateInputDraftBuilder classificationBuilder() {
       return com.commercetools.api.models.cart.ClassificationShippingRateInputDraftBuilder.of();
    }
    public com.commercetools.api.models.cart.ScoreShippingRateInputDraftBuilder scoreBuilder() {
       return com.commercetools.api.models.cart.ScoreShippingRateInputDraftBuilder.of();
    }

    /**
     * factory method for an instance of ShippingRateInputDraftBuilder
     * @return builder 
     */
    public static ShippingRateInputDraftBuilder of() {
        return new ShippingRateInputDraftBuilder();
    }

}
