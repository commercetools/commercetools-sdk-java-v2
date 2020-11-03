package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerCompanyNameSetMessagePayloadBuilder {

    
    private String companyName;

    public CustomerCompanyNameSetMessagePayloadBuilder companyName( final String companyName) {
        this.companyName = companyName;
        return this;
    }

    
    public String getCompanyName(){
        return this.companyName;
    }

    public CustomerCompanyNameSetMessagePayload build() {
        return new CustomerCompanyNameSetMessagePayloadImpl(companyName);
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder of() {
        return new CustomerCompanyNameSetMessagePayloadBuilder();
    }

    public static CustomerCompanyNameSetMessagePayloadBuilder of(final CustomerCompanyNameSetMessagePayload template) {
        CustomerCompanyNameSetMessagePayloadBuilder builder = new CustomerCompanyNameSetMessagePayloadBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}
