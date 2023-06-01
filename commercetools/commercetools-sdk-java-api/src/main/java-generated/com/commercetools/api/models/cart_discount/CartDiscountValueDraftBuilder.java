package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraft;
import com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraft;
import com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraft;
import com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraft;
import com.commercetools.api.models.cart_discount.CartDiscountValueDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueDraftBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountValueDraftBuilder {

    public com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftBuilder absoluteBuilder() {
       return com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteDraftBuilder.of();
    }
    public com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraftBuilder fixedBuilder() {
       return com.commercetools.api.models.cart_discount.CartDiscountValueFixedDraftBuilder.of();
    }
    public com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftBuilder giftLineItemBuilder() {
       return com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemDraftBuilder.of();
    }
    public com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftBuilder relativeBuilder() {
       return com.commercetools.api.models.cart_discount.CartDiscountValueRelativeDraftBuilder.of();
    }

    /**
     * factory method for an instance of CartDiscountValueDraftBuilder
     * @return builder 
     */
    public static CartDiscountValueDraftBuilder of() {
        return new CartDiscountValueDraftBuilder();
    }

}
