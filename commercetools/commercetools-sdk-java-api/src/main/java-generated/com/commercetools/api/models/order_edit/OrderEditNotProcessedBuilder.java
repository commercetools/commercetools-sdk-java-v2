
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.order_edit.OrderEditNotProcessed;
import com.commercetools.api.models.order_edit.OrderEditResult;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditNotProcessedBuilder {

    public OrderEditNotProcessed build() {
        return new OrderEditNotProcessedImpl();
    }

    public static OrderEditNotProcessedBuilder of() {
        return new OrderEditNotProcessedBuilder();
    }

    public static OrderEditNotProcessedBuilder of(final OrderEditNotProcessed template) {
        OrderEditNotProcessedBuilder builder = new OrderEditNotProcessedBuilder();
        return builder;
    }

}
