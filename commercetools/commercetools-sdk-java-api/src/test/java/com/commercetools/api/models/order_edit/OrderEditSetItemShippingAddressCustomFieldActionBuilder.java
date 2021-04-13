package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.order_edit.OrderEditSetItemShippingAddressCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditSetItemShippingAddressCustomFieldActionBuilder {

    
    
    private String addressKey;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    public OrderEditSetItemShippingAddressCustomFieldActionBuilder addressKey( final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }
    
    
    public OrderEditSetItemShippingAddressCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    public OrderEditSetItemShippingAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    
    
    public String getAddressKey(){
        return this.addressKey;
    }
    
    
    
    public String getName(){
        return this.name;
    }
    
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    public OrderEditSetItemShippingAddressCustomFieldAction build() {
        return new OrderEditSetItemShippingAddressCustomFieldActionImpl(addressKey, name, value);
    }

    public static OrderEditSetItemShippingAddressCustomFieldActionBuilder of() {
        return new OrderEditSetItemShippingAddressCustomFieldActionBuilder();
    }

    public static OrderEditSetItemShippingAddressCustomFieldActionBuilder of(final OrderEditSetItemShippingAddressCustomFieldAction template) {
        OrderEditSetItemShippingAddressCustomFieldActionBuilder builder = new OrderEditSetItemShippingAddressCustomFieldActionBuilder();
        builder.addressKey = template.getAddressKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
