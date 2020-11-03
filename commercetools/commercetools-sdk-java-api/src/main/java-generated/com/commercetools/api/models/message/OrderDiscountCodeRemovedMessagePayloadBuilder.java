package com.commercetools.api.models.message;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderDiscountCodeRemovedMessagePayloadBuilder {

    
    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    public OrderDiscountCodeRemovedMessagePayloadBuilder discountCode( final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    
    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode(){
        return this.discountCode;
    }

    public OrderDiscountCodeRemovedMessagePayload build() {
        return new OrderDiscountCodeRemovedMessagePayloadImpl(discountCode);
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder of() {
        return new OrderDiscountCodeRemovedMessagePayloadBuilder();
    }

    public static OrderDiscountCodeRemovedMessagePayloadBuilder of(final OrderDiscountCodeRemovedMessagePayload template) {
        OrderDiscountCodeRemovedMessagePayloadBuilder builder = new OrderDiscountCodeRemovedMessagePayloadBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
