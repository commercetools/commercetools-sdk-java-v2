
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReturnItemBuilder {

    public com.commercetools.api.models.order.CustomLineItemReturnItemBuilder customLineItemReturnItemBuilder() {
        return com.commercetools.api.models.order.CustomLineItemReturnItemBuilder.of();
    }

    public com.commercetools.api.models.order.LineItemReturnItemBuilder lineItemReturnItemBuilder() {
        return com.commercetools.api.models.order.LineItemReturnItemBuilder.of();
    }

    public static ReturnItemBuilder of() {
        return new ReturnItemBuilder();
    }
}
