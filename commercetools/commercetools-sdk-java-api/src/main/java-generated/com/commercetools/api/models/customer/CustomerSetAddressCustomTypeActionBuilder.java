package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.customer.CustomerSetAddressCustomTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetAddressCustomTypeActionBuilder {

    
    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;
    
    
    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;
    
    
    
    private String addressId;

    
    public CustomerSetAddressCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }
    
    
    public CustomerSetAddressCustomTypeActionBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }
    
    
    public CustomerSetAddressCustomTypeActionBuilder addressId( final String addressId) {
        this.addressId = addressId;
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
    
    
    
    public String getAddressId(){
        return this.addressId;
    }

    public CustomerSetAddressCustomTypeAction build() {
        return new CustomerSetAddressCustomTypeActionImpl(type, fields, addressId);
    }

    public static CustomerSetAddressCustomTypeActionBuilder of() {
        return new CustomerSetAddressCustomTypeActionBuilder();
    }

    public static CustomerSetAddressCustomTypeActionBuilder of(final CustomerSetAddressCustomTypeAction template) {
        CustomerSetAddressCustomTypeActionBuilder builder = new CustomerSetAddressCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        builder.addressId = template.getAddressId();
        return builder;
    }

}
