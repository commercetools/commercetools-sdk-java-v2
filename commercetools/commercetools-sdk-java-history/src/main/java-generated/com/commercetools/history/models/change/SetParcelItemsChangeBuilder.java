package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ParcelChangeValue;
import com.commercetools.history.models.common.DeliveryItem;
import com.commercetools.history.models.change.SetParcelItemsChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetParcelItemsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetParcelItemsChange setParcelItemsChange = SetParcelItemsChange.builder()
 *             .change("{change}")
 *             .parcel(parcelBuilder -> parcelBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetParcelItemsChangeBuilder implements Builder<SetParcelItemsChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;
    
    
    
    private java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue;
    
    
    
    private java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue;

    
    /**
     *  <p>Update action for <code>setParcelItems</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the parcel using the builder function
     * @param builder function to build the parcel value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder parcel(Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValueBuilder> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the parcel using the builder function
     * @param builder function to build the parcel value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder withParcel(Function<com.commercetools.history.models.change_value.ParcelChangeValueBuilder, com.commercetools.history.models.change_value.ParcelChangeValue> builder) {
        this.parcel = builder.apply(com.commercetools.history.models.change_value.ParcelChangeValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the parcel
     * @param parcel value to be set
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder parcel( final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
        return this;
    }
    
    
    
    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder nextValue( final com.commercetools.history.models.common.DeliveryItem ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder nextValue( final java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder plusNextValue( final com.commercetools.history.models.common.DeliveryItem ...nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }
    
    
    
    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder plusNextValue(Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder withNextValue(Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder addNextValue(Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder setNextValue(Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }
                    
    
    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder previousValue( final com.commercetools.history.models.common.DeliveryItem ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder previousValue( final java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder plusPreviousValue( final com.commercetools.history.models.common.DeliveryItem ...previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }
    
    
    
    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder plusPreviousValue(Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder addPreviousValue(Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetParcelItemsChangeBuilder setPreviousValue(Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }
                    

    /**
     *  <p>Update action for <code>setParcelItems</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of parcel}
     * @return parcel
     */
    
    
    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel(){
        return this.parcel;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds SetParcelItemsChange with checking for non-null required values
     * @return SetParcelItemsChange
     */
    public SetParcelItemsChange build() {
        Objects.requireNonNull(change, SetParcelItemsChange.class + ": change is missing");
        Objects.requireNonNull(parcel, SetParcelItemsChange.class + ": parcel is missing");
        Objects.requireNonNull(nextValue, SetParcelItemsChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetParcelItemsChange.class + ": previousValue is missing");
        return new SetParcelItemsChangeImpl(change, parcel, nextValue, previousValue);
    }
    
    /**
     * builds SetParcelItemsChange without checking for non-null required values
     * @return SetParcelItemsChange
     */
    public SetParcelItemsChange buildUnchecked() {
        return new SetParcelItemsChangeImpl(change, parcel, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetParcelItemsChangeBuilder
     * @return builder 
     */
    public static SetParcelItemsChangeBuilder of() {
        return new SetParcelItemsChangeBuilder();
    }

    /**
     * create builder for SetParcelItemsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetParcelItemsChangeBuilder of(final SetParcelItemsChange template) {
        SetParcelItemsChangeBuilder builder = new SetParcelItemsChangeBuilder();
        builder.change = template.getChange();
        builder.parcel = template.getParcel();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
