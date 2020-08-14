package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.order.OrderSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetCustomFieldActionBuilder {

    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public OrderSetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public OrderSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    
    public String getName(){
        return this.name;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }

    public OrderSetCustomFieldAction build() {
        return new OrderSetCustomFieldActionImpl(name, value);
    }

    public static OrderSetCustomFieldActionBuilder of() {
        return new OrderSetCustomFieldActionBuilder();
    }

    public static OrderSetCustomFieldActionBuilder of(final OrderSetCustomFieldAction template) {
        OrderSetCustomFieldActionBuilder builder = new OrderSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
