package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetSkuChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSkuChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSkuChange setSkuChange = SetSkuChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetSkuChangeBuilder implements Builder<SetSkuChange> {

    
    
    private String change;
    
    
    
    private String catalogData;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Update action for <code>setSku</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetSkuChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */
    
    public SetSkuChangeBuilder catalogData( final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetSkuChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetSkuChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setSku</code></p>
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
    
    
    public String getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public String getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetSkuChange with checking for non-null required values
     * @return SetSkuChange
     */
    public SetSkuChange build() {
        Objects.requireNonNull(change, SetSkuChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetSkuChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetSkuChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSkuChange.class + ": nextValue is missing");
        return new SetSkuChangeImpl(change, catalogData, previousValue, nextValue);
    }
    
    /**
     * builds SetSkuChange without checking for non-null required values
     * @return SetSkuChange
     */
    public SetSkuChange buildUnchecked() {
        return new SetSkuChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetSkuChangeBuilder
     * @return builder 
     */
    public static SetSkuChangeBuilder of() {
        return new SetSkuChangeBuilder();
    }

    /**
     * create builder for SetSkuChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSkuChangeBuilder of(final SetSkuChange template) {
        SetSkuChangeBuilder builder = new SetSkuChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
