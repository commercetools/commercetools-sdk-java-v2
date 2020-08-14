package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetLocaleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetLocaleActionBuilder {

    @Nullable
    private String locale;

    public OrderSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale(){
        return this.locale;
    }

    public OrderSetLocaleAction build() {
        return new OrderSetLocaleActionImpl(locale);
    }

    public static OrderSetLocaleActionBuilder of() {
        return new OrderSetLocaleActionBuilder();
    }

    public static OrderSetLocaleActionBuilder of(final OrderSetLocaleAction template) {
        OrderSetLocaleActionBuilder builder = new OrderSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
