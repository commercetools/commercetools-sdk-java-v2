package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Address;
import com.commercetools.history.models.change.RemoveShippingAddressIdChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveShippingAddressIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveShippingAddressIdChange removeShippingAddressIdChange = RemoveShippingAddressIdChange.builder()
 *             .change("{change}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class RemoveShippingAddressIdChangeBuilder implements Builder<RemoveShippingAddressIdChange> {

    
    
    private String change;
    
    
    
    private java.util.List<String> nextValue;
    
    
    
    private java.util.List<String> previousValue;
    
    
    
    private com.commercetools.history.models.common.Address address;

    
    /**
     *  <p>Update action for <code>removeShippingAddressId</code> action on customers.</p>
     * @param change value to be set
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    /**
     * set values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder nextValue( final String ...nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }
    
    /**
     * set value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder nextValue( final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    /**
     * add values to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder plusNextValue( final String ...nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }
    
    
    
    
    /**
     * set values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder previousValue( final String ...previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }
    
    /**
     * set value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder previousValue( final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    /**
     * add values to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder plusPreviousValue( final String ...previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }
    
    
    
    
    
    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder address(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder withAddress(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the address
     * @param address value to be set
     * @return Builder
     */
    
    public RemoveShippingAddressIdChangeBuilder address( final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>removeShippingAddressId</code> action on customers.</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.util.List<String> getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public java.util.List<String> getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of address}
     * @return address
     */
    
    
    public com.commercetools.history.models.common.Address getAddress(){
        return this.address;
    }

    /**
     * builds RemoveShippingAddressIdChange with checking for non-null required values
     * @return RemoveShippingAddressIdChange
     */
    public RemoveShippingAddressIdChange build() {
        Objects.requireNonNull(change, RemoveShippingAddressIdChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, RemoveShippingAddressIdChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, RemoveShippingAddressIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(address, RemoveShippingAddressIdChange.class + ": address is missing");
        return new RemoveShippingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }
    
    /**
     * builds RemoveShippingAddressIdChange without checking for non-null required values
     * @return RemoveShippingAddressIdChange
     */
    public RemoveShippingAddressIdChange buildUnchecked() {
        return new RemoveShippingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    /**
     * factory method for an instance of RemoveShippingAddressIdChangeBuilder
     * @return builder 
     */
    public static RemoveShippingAddressIdChangeBuilder of() {
        return new RemoveShippingAddressIdChangeBuilder();
    }

    /**
     * create builder for RemoveShippingAddressIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveShippingAddressIdChangeBuilder of(final RemoveShippingAddressIdChange template) {
        RemoveShippingAddressIdChangeBuilder builder = new RemoveShippingAddressIdChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        builder.address = template.getAddress();
        return builder;
    }

}
