package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.CustomFields;
import com.commercetools.history.models.change.SetProductPriceCustomFieldChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductPriceCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductPriceCustomFieldChange setProductPriceCustomFieldChange = SetProductPriceCustomFieldChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetProductPriceCustomFieldChangeBuilder implements Builder<SetProductPriceCustomFieldChange> {

    
    
    private String change;
    
    
    
    private String catalogData;
    
    
    
    private com.commercetools.history.models.common.CustomFields previousValue;
    
    
    
    private com.commercetools.history.models.common.CustomFields nextValue;

    
    /**
     *  <p>Update action for <code>setProductPriceCustomField</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetProductPriceCustomFieldChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */
    
    public SetProductPriceCustomFieldChangeBuilder catalogData( final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetProductPriceCustomFieldChangeBuilder previousValue(Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetProductPriceCustomFieldChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetProductPriceCustomFieldChangeBuilder previousValue( final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetProductPriceCustomFieldChangeBuilder nextValue(Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetProductPriceCustomFieldChangeBuilder withNextValue(Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetProductPriceCustomFieldChangeBuilder nextValue( final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setProductPriceCustomField</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of catalogData}
     * @return catalogData
     */
    
    
    public String getCatalogData(){
        return this.catalogData;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.CustomFields getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.CustomFields getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetProductPriceCustomFieldChange with checking for non-null required values
     * @return SetProductPriceCustomFieldChange
     */
    public SetProductPriceCustomFieldChange build() {
        Objects.requireNonNull(change, SetProductPriceCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetProductPriceCustomFieldChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetProductPriceCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductPriceCustomFieldChange.class + ": nextValue is missing");
        return new SetProductPriceCustomFieldChangeImpl(change, catalogData, previousValue, nextValue);
    }
    
    /**
     * builds SetProductPriceCustomFieldChange without checking for non-null required values
     * @return SetProductPriceCustomFieldChange
     */
    public SetProductPriceCustomFieldChange buildUnchecked() {
        return new SetProductPriceCustomFieldChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetProductPriceCustomFieldChangeBuilder
     * @return builder 
     */
    public static SetProductPriceCustomFieldChangeBuilder of() {
        return new SetProductPriceCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetProductPriceCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductPriceCustomFieldChangeBuilder of(final SetProductPriceCustomFieldChange template) {
        SetProductPriceCustomFieldChangeBuilder builder = new SetProductPriceCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
