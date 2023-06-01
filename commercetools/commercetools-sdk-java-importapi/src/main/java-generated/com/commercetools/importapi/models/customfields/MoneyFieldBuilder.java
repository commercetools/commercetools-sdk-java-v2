package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.MoneyField;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneyFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneyField moneyField = MoneyField.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MoneyFieldBuilder implements Builder<MoneyField> {

    
    
    private com.commercetools.importapi.models.common.TypedMoney value;

    
    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */
    
    public MoneyFieldBuilder value( final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */
    
    public MoneyFieldBuilder value(Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }
                    

    /**
     * value of value}
     * @return value
     */
    
    
    public com.commercetools.importapi.models.common.TypedMoney getValue(){
        return this.value;
    }

    /**
     * builds MoneyField with checking for non-null required values
     * @return MoneyField
     */
    public MoneyField build() {
        Objects.requireNonNull(value, MoneyField.class + ": value is missing");
        return new MoneyFieldImpl(value);
    }
    
    /**
     * builds MoneyField without checking for non-null required values
     * @return MoneyField
     */
    public MoneyField buildUnchecked() {
        return new MoneyFieldImpl(value);
    }

    /**
     * factory method for an instance of MoneyFieldBuilder
     * @return builder 
     */
    public static MoneyFieldBuilder of() {
        return new MoneyFieldBuilder();
    }

    /**
     * create builder for MoneyField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyFieldBuilder of(final MoneyField template) {
        MoneyFieldBuilder builder = new MoneyFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
