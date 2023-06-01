package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryDraft taxCategoryDraft = TaxCategoryDraft.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxCategoryDraftBuilder implements Builder<TaxCategoryDraft> {

    
    
    private String name;
    
    
    @Nullable
    private String description;
    
    
    @Nullable
    private java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates;
    
    
    @Nullable
    private String key;

    
    /**
     *  <p>Name of the TaxCategory.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Description of the TaxCategory.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }
    
    
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param rates value to be set
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder rates(@Nullable final com.commercetools.api.models.tax_category.TaxRateDraft ...rates) {
        this.rates = new ArrayList<>(Arrays.asList(rates));
        return this;
    }
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param rates value to be set
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder rates(@Nullable final java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> rates) {
        this.rates = rates;
        return this;
    }
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param rates value to be set
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder plusRates(@Nullable final com.commercetools.api.models.tax_category.TaxRateDraft ...rates) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.addAll(Arrays.asList(rates));
        return this;
    }
    
    
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param builder function to build the rates value
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder plusRates(Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        if (this.rates == null) {
            this.rates = new ArrayList<>();
        }
        this.rates.add(builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param builder function to build the rates value
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder withRates(Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraftBuilder> builder) {
        this.rates = new ArrayList<>();
        this.rates.add(builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param builder function to build the rates value
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder addRates(Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraft> builder) {
        return plusRates(builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()));
    }
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @param builder function to build the rates value
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder setRates(Function<com.commercetools.api.models.tax_category.TaxRateDraftBuilder, com.commercetools.api.models.tax_category.TaxRateDraft> builder) {
        return rates(builder.apply(com.commercetools.api.models.tax_category.TaxRateDraftBuilder.of()));
    }
                    
    
    
    /**
     *  <p>User-defined unique identifier for the TaxCategory.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public TaxCategoryDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Name of the TaxCategory.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>Description of the TaxCategory.</p>
     * @return description
     */
    
    @Nullable
    public String getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Tax rates and subrates of states and countries.</p>
     * @return rates
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.tax_category.TaxRateDraft> getRates(){
        return this.rates;
    }
    
    /**
     *  <p>User-defined unique identifier for the TaxCategory.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds TaxCategoryDraft with checking for non-null required values
     * @return TaxCategoryDraft
     */
    public TaxCategoryDraft build() {
        Objects.requireNonNull(name, TaxCategoryDraft.class + ": name is missing");
        return new TaxCategoryDraftImpl(name, description, rates, key);
    }
    
    /**
     * builds TaxCategoryDraft without checking for non-null required values
     * @return TaxCategoryDraft
     */
    public TaxCategoryDraft buildUnchecked() {
        return new TaxCategoryDraftImpl(name, description, rates, key);
    }

    /**
     * factory method for an instance of TaxCategoryDraftBuilder
     * @return builder 
     */
    public static TaxCategoryDraftBuilder of() {
        return new TaxCategoryDraftBuilder();
    }

    /**
     * create builder for TaxCategoryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryDraftBuilder of(final TaxCategoryDraft template) {
        TaxCategoryDraftBuilder builder = new TaxCategoryDraftBuilder();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.rates = template.getRates();
        builder.key = template.getKey();
        return builder;
    }

}
