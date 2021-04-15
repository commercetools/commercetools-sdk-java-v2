package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.order.OrderSetBillingAddressCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetBillingAddressCustomTypeActionBuilder {

    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    
    public OrderSetBillingAddressCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    public OrderSetBillingAddressCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    
    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
        return this.type;
    }
    
    
    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields(){
        return this.fields;
    }

    public OrderSetBillingAddressCustomTypeAction build() {
        return new OrderSetBillingAddressCustomTypeActionImpl(type, fields);
    }

    public static OrderSetBillingAddressCustomTypeActionBuilder of() {
        return new OrderSetBillingAddressCustomTypeActionBuilder();
    }

    public static OrderSetBillingAddressCustomTypeActionBuilder of(final OrderSetBillingAddressCustomTypeAction template) {
        OrderSetBillingAddressCustomTypeActionBuilder builder = new OrderSetBillingAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
