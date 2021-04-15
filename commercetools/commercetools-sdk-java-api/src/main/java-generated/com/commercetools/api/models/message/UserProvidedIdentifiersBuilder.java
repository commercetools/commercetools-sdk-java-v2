package com.commercetools.api.models.message;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class UserProvidedIdentifiersBuilder {

    
    @Nullable
    private String key;
    
    
    @Nullable
    private String externalId;
    
    
    @Nullable
    private String orderNumber;
    
    
    @Nullable
    private String customerNumber;
    
    
    @Nullable
    private String sku;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString slug;

    
    public UserProvidedIdentifiersBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    public UserProvidedIdentifiersBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    
    public UserProvidedIdentifiersBuilder orderNumber(@Nullable final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    
    
    public UserProvidedIdentifiersBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    
    
    public UserProvidedIdentifiersBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }
    
    
    public UserProvidedIdentifiersBuilder slug(@Nullable final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    
    @Nullable
    public String getExternalId(){
        return this.externalId;
    }
    
    
    @Nullable
    public String getOrderNumber(){
        return this.orderNumber;
    }
    
    
    @Nullable
    public String getCustomerNumber(){
        return this.customerNumber;
    }
    
    
    @Nullable
    public String getSku(){
        return this.sku;
    }
    
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getSlug(){
        return this.slug;
    }

    public UserProvidedIdentifiers build() {
        return new UserProvidedIdentifiersImpl(key, externalId, orderNumber, customerNumber, sku, slug);
    }

    public static UserProvidedIdentifiersBuilder of() {
        return new UserProvidedIdentifiersBuilder();
    }

    public static UserProvidedIdentifiersBuilder of(final UserProvidedIdentifiers template) {
        UserProvidedIdentifiersBuilder builder = new UserProvidedIdentifiersBuilder();
        builder.key = template.getKey();
        builder.externalId = template.getExternalId();
        builder.orderNumber = template.getOrderNumber();
        builder.customerNumber = template.getCustomerNumber();
        builder.sku = template.getSku();
        builder.slug = template.getSlug();
        return builder;
    }

}
