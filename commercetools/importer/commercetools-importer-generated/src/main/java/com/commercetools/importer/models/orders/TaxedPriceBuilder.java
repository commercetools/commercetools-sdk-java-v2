package com.commercetools.importer.models.orders;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.orders.TaxPortion;
import com.commercetools.importer.models.orders.TaxedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedPriceBuilder {

    
    private com.commercetools.importer.models.common.Money totalNet;
    
    
    private com.commercetools.importer.models.common.Money totalGross;
    
    
    private java.util.List<com.commercetools.importer.models.orders.TaxPortion> taxPortions;

    public TaxedPriceBuilder totalNet( final com.commercetools.importer.models.common.Money totalNet) {
        this.totalNet = totalNet;
        return this;
    }
    
    public TaxedPriceBuilder totalGross( final com.commercetools.importer.models.common.Money totalGross) {
        this.totalGross = totalGross;
        return this;
    }
    
    public TaxedPriceBuilder taxPortions( final java.util.List<com.commercetools.importer.models.orders.TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
        return this;
    }

    
    public com.commercetools.importer.models.common.Money getTotalNet(){
        return this.totalNet;
    }
    
    
    public com.commercetools.importer.models.common.Money getTotalGross(){
        return this.totalGross;
    }
    
    
    public java.util.List<com.commercetools.importer.models.orders.TaxPortion> getTaxPortions(){
        return this.taxPortions;
    }

    public TaxedPrice build() {
        return new TaxedPriceImpl(totalNet, totalGross, taxPortions);
    }

    public static TaxedPriceBuilder of() {
        return new TaxedPriceBuilder();
    }

    public static TaxedPriceBuilder of(final TaxedPrice template) {
        TaxedPriceBuilder builder = new TaxedPriceBuilder();
        builder.totalNet = template.getTotalNet();
        builder.totalGross = template.getTotalGross();
        builder.taxPortions = template.getTaxPortions();
        return builder;
    }

}
