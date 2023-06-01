package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Address;
import com.commercetools.history.models.change.AddAddressChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAddressChange addAddressChange = AddAddressChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AddAddressChangeBuilder implements Builder<AddAddressChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.Address nextValue;
    
    
    
    private com.commercetools.history.models.common.Address previousValue;

    
    /**
     *  <p>Update action for <code>setAddress</code> action.</p>
     * @param change value to be set
     * @return Builder
     */
    
    public AddAddressChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddAddressChangeBuilder nextValue(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddAddressChangeBuilder withNextValue(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddAddressChangeBuilder nextValue( final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public AddAddressChangeBuilder previousValue(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public AddAddressChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public AddAddressChangeBuilder previousValue( final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>setAddress</code> action.</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.Address getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Address getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds AddAddressChange with checking for non-null required values
     * @return AddAddressChange
     */
    public AddAddressChange build() {
        Objects.requireNonNull(change, AddAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddAddressChange.class + ": previousValue is missing");
        return new AddAddressChangeImpl(change, nextValue, previousValue);
    }
    
    /**
     * builds AddAddressChange without checking for non-null required values
     * @return AddAddressChange
     */
    public AddAddressChange buildUnchecked() {
        return new AddAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of AddAddressChangeBuilder
     * @return builder 
     */
    public static AddAddressChangeBuilder of() {
        return new AddAddressChangeBuilder();
    }

    /**
     * create builder for AddAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAddressChangeBuilder of(final AddAddressChange template) {
        AddAddressChangeBuilder builder = new AddAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
