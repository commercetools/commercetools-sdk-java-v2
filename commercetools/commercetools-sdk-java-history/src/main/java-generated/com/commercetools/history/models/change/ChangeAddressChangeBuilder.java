package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Address;
import com.commercetools.history.models.change.ChangeAddressChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAddressChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAddressChange changeAddressChange = ChangeAddressChange.builder()
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
public class ChangeAddressChangeBuilder implements Builder<ChangeAddressChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.Address nextValue;
    
    
    
    private com.commercetools.history.models.common.Address previousValue;

    
    /**
     *  <p>Update action <code>changeAddress</code> action.</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeAddressChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeAddressChangeBuilder nextValue(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeAddressChangeBuilder withNextValue(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeAddressChangeBuilder nextValue( final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeAddressChangeBuilder previousValue(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeAddressChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeAddressChangeBuilder previousValue( final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action <code>changeAddress</code> action.</p>
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
     * builds ChangeAddressChange with checking for non-null required values
     * @return ChangeAddressChange
     */
    public ChangeAddressChange build() {
        Objects.requireNonNull(change, ChangeAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeAddressChange.class + ": previousValue is missing");
        return new ChangeAddressChangeImpl(change, nextValue, previousValue);
    }
    
    /**
     * builds ChangeAddressChange without checking for non-null required values
     * @return ChangeAddressChange
     */
    public ChangeAddressChange buildUnchecked() {
        return new ChangeAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeAddressChangeBuilder
     * @return builder 
     */
    public static ChangeAddressChangeBuilder of() {
        return new ChangeAddressChangeBuilder();
    }

    /**
     * create builder for ChangeAddressChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAddressChangeBuilder of(final ChangeAddressChange template) {
        ChangeAddressChangeBuilder builder = new ChangeAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
