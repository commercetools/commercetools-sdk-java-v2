package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.common.ProductDiscountKeyReference;
import com.commercetools.importer.models.common.DiscountedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountedPriceBuilder {

    
    private com.commercetools.importer.models.common.Money value;
    
    
    private com.commercetools.importer.models.common.ProductDiscountKeyReference discount;

    public DiscountedPriceBuilder value( final com.commercetools.importer.models.common.Money value) {
        this.value = value;
        return this;
    }
    
    public DiscountedPriceBuilder discount( final com.commercetools.importer.models.common.ProductDiscountKeyReference discount) {
        this.discount = discount;
        return this;
    }

    
    public com.commercetools.importer.models.common.Money getValue(){
        return this.value;
    }
    
    
    public com.commercetools.importer.models.common.ProductDiscountKeyReference getDiscount(){
        return this.discount;
    }

    public DiscountedPrice build() {
        return new DiscountedPriceImpl(value, discount);
    }

    public static DiscountedPriceBuilder of() {
        return new DiscountedPriceBuilder();
    }

    public static DiscountedPriceBuilder of(final DiscountedPrice template) {
        DiscountedPriceBuilder builder = new DiscountedPriceBuilder();
        builder.value = template.getValue();
        builder.discount = template.getDiscount();
        return builder;
    }

}
