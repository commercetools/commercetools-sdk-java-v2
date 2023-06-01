package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.ChangeLineItemQuantityChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLineItemQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemQuantityChange changeLineItemQuantityChange = ChangeLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .nextValue(1)
 *             .previousValue(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeLineItemQuantityChangeBuilder implements Builder<ChangeLineItemQuantityChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.LocalizedString lineItem;
    
    
    
    private String lineItemId;
    
    
    
    private Integer nextValue;
    
    
    
    private Integer previousValue;

    
    /**
     *  <p>Update action for <code>changeLineItemQuantity</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeLineItemQuantityChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public ChangeLineItemQuantityChangeBuilder lineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */
    
    public ChangeLineItemQuantityChangeBuilder withLineItem(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */
    
    public ChangeLineItemQuantityChangeBuilder lineItem( final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lineItemId
     * @param lineItemId value to be set
     * @return Builder
     */
    
    public ChangeLineItemQuantityChangeBuilder lineItemId( final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }
    
    
    
    
    /**
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeLineItemQuantityChangeBuilder nextValue( final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeLineItemQuantityChangeBuilder previousValue( final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changeLineItemQuantity</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of lineItem}
     * @return lineItem
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getLineItem(){
        return this.lineItem;
    }
    
    /**
     * value of lineItemId}
     * @return lineItemId
     */
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     * @return nextValue
     */
    
    
    public Integer getNextValue(){
        return this.nextValue;
    }
    
    /**
     *  <p>The amount of a LineItem in the cart. Must be a positive integer.</p>
     * @return previousValue
     */
    
    
    public Integer getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeLineItemQuantityChange with checking for non-null required values
     * @return ChangeLineItemQuantityChange
     */
    public ChangeLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, ChangeLineItemQuantityChange.class + ": lineItem is missing");
        Objects.requireNonNull(lineItemId, ChangeLineItemQuantityChange.class + ": lineItemId is missing");
        Objects.requireNonNull(nextValue, ChangeLineItemQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeLineItemQuantityChange.class + ": previousValue is missing");
        return new ChangeLineItemQuantityChangeImpl(change, lineItem, lineItemId, nextValue, previousValue);
    }
    
    /**
     * builds ChangeLineItemQuantityChange without checking for non-null required values
     * @return ChangeLineItemQuantityChange
     */
    public ChangeLineItemQuantityChange buildUnchecked() {
        return new ChangeLineItemQuantityChangeImpl(change, lineItem, lineItemId, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeLineItemQuantityChangeBuilder
     * @return builder 
     */
    public static ChangeLineItemQuantityChangeBuilder of() {
        return new ChangeLineItemQuantityChangeBuilder();
    }

    /**
     * create builder for ChangeLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemQuantityChangeBuilder of(final ChangeLineItemQuantityChange template) {
        ChangeLineItemQuantityChangeBuilder builder = new ChangeLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
