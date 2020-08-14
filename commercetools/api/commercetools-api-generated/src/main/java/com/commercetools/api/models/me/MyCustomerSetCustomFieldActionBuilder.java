package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.me.MyCustomerSetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetCustomFieldActionBuilder {

    
    private String name;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public MyCustomerSetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    public MyCustomerSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
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

    public MyCustomerSetCustomFieldAction build() {
        return new MyCustomerSetCustomFieldActionImpl(name, value);
    }

    public static MyCustomerSetCustomFieldActionBuilder of() {
        return new MyCustomerSetCustomFieldActionBuilder();
    }

    public static MyCustomerSetCustomFieldActionBuilder of(final MyCustomerSetCustomFieldAction template) {
        MyCustomerSetCustomFieldActionBuilder builder = new MyCustomerSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
