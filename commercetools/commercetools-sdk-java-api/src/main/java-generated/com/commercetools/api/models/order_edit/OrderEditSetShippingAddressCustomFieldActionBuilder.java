package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.OrderEditSetShippingAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditSetShippingAddressCustomFieldActionBuilder {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    public OrderEditSetShippingAddressCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    public OrderEditSetShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    
    
    public String getName(){
        return this.name;
    }
    
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    public OrderEditSetShippingAddressCustomFieldAction build() {
        return new OrderEditSetShippingAddressCustomFieldActionImpl(name, value);
    }

    public static OrderEditSetShippingAddressCustomFieldActionBuilder of() {
        return new OrderEditSetShippingAddressCustomFieldActionBuilder();
    }

    public static OrderEditSetShippingAddressCustomFieldActionBuilder of(final OrderEditSetShippingAddressCustomFieldAction template) {
        OrderEditSetShippingAddressCustomFieldActionBuilder builder = new OrderEditSetShippingAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
